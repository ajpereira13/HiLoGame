package game;

import java.util.Scanner;

public class HiLoLogic {
	
	static int rand = (int) (100 * Math.random() + 1);
	static double n = -1;
	static int count = 0;
	static String s = new String();
	static boolean stillPlaying = false;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Take a guess, or quit at any time by entering \"q\".");
		do {
			while (rand != n && !s.equals("q")) {
				s = scan.nextLine();
				if (s.matches("\\d+")) {
					n = Integer.parseInt(s);
				}else if (s.equals("q")) {
					break;
				}else {
					n = -1;
				}
				HiLo(n);
				count++;
			}
			System.out.println("You made " + count + " guesses.");
			if (s.equals("q")) {
				System.out.println("Thank you for playing.");
			}
			else {
				System.out.println("Thank you for playing.");
				System.out.println();
				System.out.println("If you would like to play again enter \"y\".");
				s = scan.nextLine();
			}
			if (s.equals("y")) {
				stillPlaying = true;
				rand = (int) (100 * Math.random() + 1);
				count = 0;
			} else {
				stillPlaying = false;
			}
		} while (stillPlaying == true && !s.equals("q"));
		scan.close();
		
	}
	
	public static void HiLo(double num) {
		if (num == rand) {
			System.out.println("You guessed correctly!");
		} if (num > rand && num < 101 ) {
			System.out.println("Your guess is too high.");
		} if (num < rand && num > 0) {
			System.out.println("Your guess is too low.");
		} if (num < 1 || num > 100) {
			System.out.println("Your guess must be an integer on the interval [1, 100]");
		}
	}
	
}

package game;

import java.util.Scanner;

public class HiLoLogic2 {
	
	static Scanner scan = new Scanner(System.in);
	static int rand = (int) (100 * Math.random() + 1);
	static String s = new String();
	static boolean stillPlaying = true;
	static int n = -1;
	static int count = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Take a guess, or quit at any time by entering \"q\".");
		do {
			s = scan.nextLine();
			count++;
			HiLo(s);
		} while (!s.equals("q") && stillPlaying);
		scan.close();
		System.out.println("Thank you for playing.");
	}
	
	public static void HiLo(String stirng) {
		
		if (s.matches("\\d+")) {
			n = Integer.parseInt(s);
			if (n == rand) {
				System.out.println("You guessed correctly!");
				if (count == 1) {
					System.out.println("You made " + count + " guess.");
				} else {
					System.out.println("You made " + count + " guesses.");
				}
				System.out.println();
				System.out.println("If you would like to play again press \"y\", otherwise enter any charcter.");
				s = scan.nextLine();
				if (s.equals("y")) {
					stillPlaying = true;
					rand = (int) (100 * Math.random() + 1);
					count = 0;
					n = -1;
					System.out.println("Take a guess, or quit at any time by entering \"q\".");
				} else {
					stillPlaying = false;
				}
			} else if (n > rand && n < 101 ) {
				System.out.println("Your guess is too high.");
			} else if (n < rand && n > 0) {
				System.out.println("Your guess is too low.");
			} else {
				System.out.println("Your guess must be an integer on the interval [1, 100]");
			}
		} else if (s.equals("q")) {
			count--;
		} else {
			System.out.println("Your guess must be an integer on the interval [1, 100]");
		}
		
	}
	
}

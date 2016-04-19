package game;

import java.util.Scanner;

public class HiLoLogic2 {
	
	static int rand = (int) (100 * Math.random() + 1);
	static String s = new String();
	static boolean stillPlaying = true;
	static int n = -1;
	static int count = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Take a guess, or quit at any time by entering \"q\".");
		do {
			s = scan.nextLine();
			count++;
			HiLo(s);
			if (stillPlaying == false) {
				System.out.println("Thank you for playing.");
				System.out.println("You made " + count + " guesses.");
				System.out.println();
				System.out.println("If you would like to play again press \"y\".");
				s = scan.nextLine();
				if (s.equals("y")) {
					stillPlaying = true;
					rand = (int) (100 * Math.random() + 1);
					count = 0;
					System.out.println("Take a guess, or quit at any time by entering \"q\".");
				}
			}
		} while (!s.equals("q") && stillPlaying);
		scan.close();
		
	}
	
	public static void HiLo(String stirng) {
		
		if (s.matches("\\d+")) {
			n = Integer.parseInt(s);
			if (n == rand) {
				stillPlaying = false;
				System.out.println("You guessed correctly!");
			} if (n > rand && n < 101 ) {
				System.out.println("Your guess is too high.");
			} if (n < rand && n > 0) {
				System.out.println("Your guess is too low.");
			} if (n < 1 || n > 100) {
				System.out.println("Your guess must be an integer on the interval [1, 100]");
			}
		} else if (s.equals("q")) {
			count--;
		} else {
			System.out.println("Your guess must be an integer on the interval [1, 100]");
		}
		
	}
	
}

package co.grandcircus;

import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String ans = "y";

		do {

			System.out.print("Enter dice side number: ");
			int sideNumber = scan.nextInt();

			scan.nextLine(); // garbage line

			int roll1 = generateRandomDieRoll(sideNumber);
			int roll2 = generateRandomDieRoll(sideNumber);

			int total = roll1 + roll2;

			System.out.println("Die 1: " + roll1 + "\nDie 2: " + roll2 + "\nTotal: " + total);
			
			if (roll1 == roll2) {

				if (roll1 == 1) {

					System.out.println("Snake-eyes! ");

				} else if (roll1 == 6) {

					System.out.println("Box-cars! ");

				}

			}

			else if (total == 2 || total == 3 || total == 12) {

				System.out.println("Craps!");

			}

			System.out.println("Continue? (y/n)");
			ans = scan.nextLine();

		} while (ans.equalsIgnoreCase("y"));

		scan.close();

	}

	public static int generateRandomDieRoll(int sides) {

		return (int) (Math.random() * sides) + 1;

	}

}

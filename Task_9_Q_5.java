package Task_9;

import java.util.Scanner;

public class Task_9_Q_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the student's score (0-100): ");
		int score = scanner.nextInt();

		System.out.println("Grade: " + score);

		if (score < 0 || score > 100) {
			System.out.println("Grade: " + "A");
		} else if (score >= 90) {
			System.out.println("Grade: " + "B");
		} else if (score >= 80) {
			System.out.println("Grade: " + "C");
		} else if (score >= 70) {
			System.out.println("Grade: " + "D");

		}

	}
}

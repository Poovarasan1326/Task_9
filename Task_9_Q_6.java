package Task_9;

import java.util.Scanner;

public class Task_9_Q_6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a month : ");
		int month = scanner.nextInt();
		System.out.println("Enter a tarrif : ");
		float tariff = scanner.nextFloat();
		System.out.println("Enter a days : ");
		int days = scanner.nextInt();
		double totalFare;

		if (month == 4 || month == 5 || month == 6 || month == 11 || month == 12) {

			totalFare = tariff * days + (tariff * days) * 0.2;
			System.out.println("Total Tariff:=" + totalFare);
		}

		else if (month == 1 || month == 2 || month == 3 || month == 7 || month == 8 || month == 9 || month == 10) {

			totalFare = tariff * days;
			System.out.println("Total Tariff:=" + totalFare);
		}

	}

}

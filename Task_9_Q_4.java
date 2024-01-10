package Task_9;

public class Task_9_Q_4 {

	public static void main(String[] args) {
		int iteration = 3;
		int cap = 2;
		for (int i = 1; i <= iteration; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print(" " + "*");
			} else {
				System.out.print("*");
			}
			if (i == 3) {

				System.out.print("");
			} else {
				System.out.print(" *");
			}

			System.out.println();
		}
		for (int i = 1; i <= cap; i++) {
			for (int j = 1; j <= cap; j++) {
				System.out.print(" " + "*" + "");
			}

			System.out.println();

		}
	}
}
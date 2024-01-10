package Task_9;
import java.util.Scanner;

public class Task_9_Q_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter something : ");
		String givenvalues = scanner.next();

		StringBuilder reverse = new StringBuilder(givenvalues).reverse();
		String reverseString = reverse.toString();

		System.out.println(reverseString);

		if (givenvalues.equals(reverseString)) {

			System.out.println("Given String palindrome");

		} else {

			System.out.println("Given String not palindrome");
		}

	}

}

package Task_9;
import java.util.Scanner;

public class Task_9_Q_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter text : ");
		String givenValues = scanner.next();
		System.out.println("Original: " + givenValues);

		StringBuilder reversed = new StringBuilder(givenValues).reverse();

		System.out.println("Reversed: " + reversed.toString());
	}

}

package JAVABasics;
	
import java.util.Scanner;

class EvenOdd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your Number: ");

		int value = input.nextInt();

		if (value % 2 == 0)
			System.out.println("Input Number " + value + " is Even");
		else
			System.out.println("Input Number " + value + " is Odd");
		input.close();
	}
}
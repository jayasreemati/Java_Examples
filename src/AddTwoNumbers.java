import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double firstNumber = scanner.nextDouble();
		System.out.println("Enter the second number: ");
		double secondNumber = scanner.nextDouble();
		double sum = firstNumber + secondNumber;
		System.out.println("the sum of firstnumber and secondnumber is " + sum);
		scanner.close();

}
}
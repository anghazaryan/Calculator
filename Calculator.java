import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner inputField = new Scanner(System.in);
	
		 System.out.println("Please enter any number");

		int firstNumber = inputField.nextInt();
				System.out.println("Please enter another number ");	

		int secondNumber = inputField.nextInt();

		System.out.println("Choose an operator: +, -, *, or /");
		 char operator = inputField.next().charAt(0);

				int result = 0;

	switch (operator) {

	case '+': 
		result = firstNumber + secondNumber;
		System.out.println(firstNumber + " + " + secondNumber + " = " + result);
		break;

	case '-':
		result = firstNumber - secondNumber;
		System.out.println(firstNumber + " - " + secondNumber + " = " + result);
		break;

	case '*':
		result = firstNumber * secondNumber;
		System.out.println(firstNumber + " * " + secondNumber + " = " + result);
		break;

	case '/':
		result = firstNumber / secondNumber;
		System.out.println(firstNumber + " / " + secondNumber + " = "+ result);
		break;

	default:
		System.out.println("Wrong value is inserted!");
		break;
	  }
    }
  }
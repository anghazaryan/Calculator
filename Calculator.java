import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner inputField = new Scanner(System.in);
	
		System.out.println("Please enter any number");
		float firstNumber = inputField.nextFloat() ;

		System.out.println("Please enter another number ");	
		float secondNumber = inputField.nextFloat() ;

		System.out.println("Choose an operator: +, -, *, or /");
		String operator = inputField.next();

		float result = 0;

		switch (operator) {

		case "+": 
			result = firstNumber + secondNumber;
			System.out.println(firstNumber + " + " + secondNumber + " = " + result);
			break;

		case "-":
			result = firstNumber - secondNumber;
			System.out.println(firstNumber + " - " + secondNumber + " = " + result);
			break;

		case "*":
			result = firstNumber * secondNumber;
			System.out.println(firstNumber + " * " + secondNumber + " = " + result);
			break;

		case "/":
			result = firstNumber / secondNumber;
			System.out.println(firstNumber + " / " + secondNumber + " = "+ result);
			break;

		default:
			System.out.println("Wrong value is inserted!");
			break;
		  }
    }
  }
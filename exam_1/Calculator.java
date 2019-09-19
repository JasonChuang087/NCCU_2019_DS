import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] data = getInputData(scanner);
		boolean checkIfInputIsValid = checkIfInputIsValid(data);
		if(checkIfInputIsValid) {
			double answer = computeAnswer(data);
			System.out.println(answer);
		}else {
			System.out.println("Wrong pattern!!!");
		}
	}
	public static String[] getInputData(Scanner scanner) {
		return scanner.nextLine().split(" ");
	}
	public static boolean checkIfInputIsValid(String[] data) {
		System.out.println("checkIfInputIsValid not done!");
		return true;
	}
	public static double computeAnswer(String[] data) {
		//route to operating method based on operator
		return 0;
	}
	public static double computePlus(String[] data) {
		//route to here if operator is '+' and return the answer
		return 0;
	}
	public static double computeMinus(String[] data) {
		//route to here if operator is '-' and return the answer
		return 0;
	}
	public static double computeMult(String[] data) {
		//route to here if operator is '*' and return the answer
		return 0;
	}
	public static double computeDivid(String[] data) {
		//route to here if operator is '/' and return the answer
		return 0;
	}
}

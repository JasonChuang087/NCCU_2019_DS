import java.util.Scanner;

public class CalculatorAnswer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String[] data = getInputData(scanner);
			boolean checkIfInputIsValid = checkIfInputIsValid(data);
			if(checkIfInputIsValid) {
				double answer = computeAnswer(data);
				System.out.println(answer);
			}else {
				System.out.println("Wrong pattern!!!");
			}
		}
	}
	public static String[] getInputData(Scanner scanner) {
		return scanner.nextLine().split(" ");
	}
	
	public static boolean checkIfInputIsValid(String[] data) {
//		try {
//			Double.parseDouble(data[0]);
//			Double.parseDouble(data[2]);
//		}catch(Exception e) {
//			return false;
//		}
//		return data.length == 3 && "-+*/".contains(data[1]);
		
		//test git hub
		
		return data.length == 3 && data[0].matches("[0-9]+") && data[2].matches("[0-9]+") &&  data[1].matches("[-+*/]{1}");
	}
	public static double computeAnswer(String[] data) {
		//route to operating method based on operator
		double answer;
		if(data[1].equals("+"))
			answer = computePlus(data);
		else if(data[1].equals("-"))
			answer = computeMinus(data);
		else if(data[1].equals("*"))
			answer = computeMult(data);
		else answer = computeDiv(data);
		return answer;
		
	}
	public static double computePlus(String[] data) {
		//route to here if operator is '+' and return the answer
		return Double.parseDouble(data[0]) + Double.parseDouble(data[2]);
	}
	public static double computeMinus(String[] data) {
		//route to here if operator is '-' and return the answer
		return Double.parseDouble(data[0]) - Double.parseDouble(data[2]);
	}
	public static double computeMult(String[] data) {
		//route to here if operator is '*' and return the answer
		return Double.parseDouble(data[0]) * Double.parseDouble(data[2]);
	}
	public static double computeDiv(String[] data) {
		//route to here if operator is '/' and return the answer
		return Double.parseDouble(data[0]) / Double.parseDouble(data[2]);
	}
}

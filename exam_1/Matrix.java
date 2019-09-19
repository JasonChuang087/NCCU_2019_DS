import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	public static final boolean EASY_MODE = true;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] data = getInputData(scanner);
		int[][] answer;
		if(EASY_MODE)
			System.out.println(Arrays.toString(computeAnswer(data)));
		else
			printMatrix(bonusComputeAnswer(data));
	}
	public static String[] getInputData(Scanner scanner) {
		return scanner.nextLine().split(" ");
	}
	public static int[] computeAnswer(String[] data) {
		//computer 2 * 2 matrix answer
		
		return new int[] {};
	}
	public static int[][] bonusComputeAnswer(String[] data) {
		// computer bonus matrix
		
		return new int[][] {};
	}
	public static void printMatrix(int[][] matrix) {
		for(int i = 0 ; i < matrix.length; i++)
			for(int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + ((j + 1) == matrix[0].length ? "\n" : ""));
	}
	
}

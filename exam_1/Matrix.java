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
		
		int[][] a = new int[][] {{Integer.parseInt(data[0]), Integer.parseInt(data[1])}, {Integer.parseInt(data[2]), Integer.parseInt(data[3])}};
		int[][] b = new int[][] {{Integer.parseInt(data[5]), Integer.parseInt(data[6])}, {Integer.parseInt(data[7]), Integer.parseInt(data[8])}};
		
		int[] answer = new int[4];
		answer[0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
		answer[1] = 0;
		answer[2] = 0;
		answer[3] = 0;
		
		return answer;
	}
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

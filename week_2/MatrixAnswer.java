import java.util.Arrays;
import java.util.Scanner;

public class MatrixAnswer {
	
	public static final boolean EASY_MODE = false;
	
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
		answer[1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
		answer[2] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
		answer[3] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
		
		return answer;
	}
	public static int[][] bonusComputeAnswer(String[] data) {
		int[][] a = new int[Integer.parseInt(data[0])][Integer.parseInt(data[1])];
		int[][] b = new int[Integer.parseInt(data[1])][Integer.parseInt(data[2])];
		int index = 4;
		for(int i = 0 ; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				a[i][j] = Integer.parseInt(data[index++]);
			}
		}
		index++;
		for(int i = 0 ; i < b.length; i++) {
			for(int j = 0; j < b[0].length; j++)
				b[i][j] = Integer.parseInt(data[index++]);
		}
		return computeMatrix(a,b);
	}
	
	public static int[][] computeMatrix(int[][] a, int[][] b) {
		int[][] answer = new int[a.length][b[0].length];
		for(int i = 0 ; i < answer.length; i++)
			for(int j = 0 ; j < answer[0].length; j++)
				for(int k = 0 ; k < b.length; k++) {
					answer[i][j] += a[i][k] * b[k][j];
				}
		return answer;
	}
	public static void printMatrix(int[][] matrix) {
		for(int i = 0 ; i < matrix.length; i++)
			for(int j = 0; j < matrix[0].length; j++)
				System.out.print(matrix[i][j] + ((j + 1) == matrix[0].length ? "\n" : ""));
	}
	
}

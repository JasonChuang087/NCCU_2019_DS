package ta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeywordHeap heap = new KeywordHeap();
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()){
			String operation = scanner.next();
			
			switch (operation){
				case "add":
					String name = scanner.next();
					int count = scanner.nextInt();
					double weight = scanner.nextDouble();					
					heap.add(new Keyword(name, count, weight));
					break;
				case "peek":					
					heap.peek();
					break;
				case "removeMin":
					heap.removeMin();
					break;
				case "output":
					heap.output();
					break;
				default:
					System.out.println("InvalidOperation");
					break;
			}	
		}
		scanner.close();
	}

}

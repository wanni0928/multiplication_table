package tutorial.mutiple.table;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("¸î ´Ü?");
//		
//		int index = scanner.nextInt();
		
		for(int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.println((i + 1) + " x " + (j + 1) + "= " + (i + 1) * (j + 1));
			}
			System.out.println();
		}
	}
}

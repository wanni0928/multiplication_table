package tutorial.mutiple.table;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MultiplicationTable mt = new MultiplicationTable();
		int[] results = null;
		
		for(int i = 0; i < 9; i++) {
			results = mt.calculate(i+1);
			mt.print(results);
		}
	}
}

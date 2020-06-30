package tutorial.mutiple.table;

public class MultiplicationTable {
	public int[] calculate(int times) {
		int[] result = new int[9];

		for (int i = 0; i < 9; i++) {
			result[i] = times * (i + 1);
		}
		
		return result;
	}
	
	public void print(int[] results) {
		for(int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}
}

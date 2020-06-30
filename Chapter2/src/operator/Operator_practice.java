package operator;

import java.util.Scanner;

public class Operator_practice {
	// if-else if�� �׸��� switch -case�� ��Ģ���� ����
	// ���̾Ƹ�� ���
	public static void main(String[] args) {
		System.out.println("Ȧ�� ���� �Է��ϼ���:");

		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt(); // �ٸ� Ȧ�� ���� �־����
		int height = lineCount / 2;
		
		for (int i = 0; i < height; i++) {
			for(int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = height; i >= 0; i--) {
			for(int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

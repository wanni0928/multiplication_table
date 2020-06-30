package operator;

import java.util.Scanner;

public class Operator_practice {
	// if-else if로 그리고 switch -case로 사칙연산 구현
	// 다이아몬드 출력
	public static void main(String[] args) {
		System.out.println("홀수 값을 입력하세요:");

		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt(); // 다른 홀수 값을 넣어보세요
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

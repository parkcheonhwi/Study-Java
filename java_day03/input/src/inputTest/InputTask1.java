package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		�� ������ �Է��� �� ���� ��� ���
//		��, next()�� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0, result = 0;
		String message1 = "ù ��° ���� : ", message2 = "�� ��° ���� : ";
		String format = "%d + %d = %d\n";
		
		System.out.print(message1);
		number1 = Integer.parseInt(sc.next());
		
		System.out.print(message2);
		number2 = Integer.parseInt(sc.next());
		
		result = number1 + number2;
		
		System.out.printf(format, number1, number2, result);
		
	}
}



















package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		3���� ������ �� ���� �Է¹��� ��
//		�� ������ ���� ���
//		next()�� ���.
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0, number3 = 0, result = 0;
		String message = "�� ������ �Է��ϼ���.", exampleMessage = "��)1 3 5";
		String format = "%d * %d * %d = %d\n";
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		number1 = Integer.parseInt(sc.next());
		number2 = Integer.parseInt(sc.next());
		number3 = sc.nextInt();
		
		result = number1 * number2 * number3;
		
		System.out.printf(format, number1, number2, number3, result);
	}
}


















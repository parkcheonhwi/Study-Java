package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		��� ��
//		�� ���� �Է¹ޱ�, nextInt() ���
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0;
		String result = null;
		String message = "�� ������ �Է��ϼ���.", exampleMessage = "��)3 6";
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		result = number1 > number2 ? "�� ū ��: " + number1 : number1 == number2 ? "�� ���� �����ϴ�" : "�� ū ��: " + number2;
		
		System.out.println(result);
		
	}
}













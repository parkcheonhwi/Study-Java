package operTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
//		(������)
//		����ڿ��� Ű�� �Է¹ް�
//		������� ������ ���
//		�Ǽ���� �Ǽ��� ���
//		��)	183 -> 183 ���
//			183.5 -> 183.5 ���
//		���� �����ڸ� ���!
		
		double height = 0.0;
		Scanner sc = new Scanner(System.in);
		String message = "Ű :", format = null;
		boolean isInteger = false;
		
		System.out.print(message);
		height = sc.nextDouble();
		
		isInteger = height - (int)height == 0;
		
		format = isInteger ? "%.0fcm" : "%.2fcm";
		format += "\n";
		
		System.out.printf(format, height);
	}
}












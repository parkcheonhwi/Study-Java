package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
//		�����
//		1~10���� �迭�� ��� ���
//		int[] arData = new int[10];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		10~1���� �� ¦���� �迭�� ��� ���
//		int[] arData = new int[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (5 - i) * 2;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		1~100���� �迭�� ���� �� Ȧ���� ���
//		int[] arData = new int[100];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			if(i % 2 != 0) {continue;} //�ε����� Ȧ����� ���� ¦���� �� �ֱ� ������
//			System.out.println(arData[i]);
//		}
		
		
//		�ǹ�
//		1~100���� �迭�� ���� �� ¦���� �� ���
//		int[] arData = new int[100];
//		int result = 0;
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			if(i % 2 != 0) {
//				result += arData[i];
//			}
//		}
//		
//		System.out.println(result);
		
//		A~F���� �迭�� ��� ���
//		char[] arData = new char[6];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		A~F���� �� C�����ϰ� �迭�� ���� �� ���
//		char[] arData = new char[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		���
//		5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
//		int[] arData = new int[5];
//		Scanner sc = new Scanner(System.in);
//		int max = 0, min = 0;
//		String message = "5���� ������ �Է��ϼ���.", exampleMessage = "��)1 3 5 6 8";
//		
//		System.out.println(message);
//		System.out.println(exampleMessage);
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//		}
//		
//		max = arData[0]; 
//		min = arData[0];
//		
//		for (int i = 1; i < arData.length; i++) {
//			if(max < arData[i]) { max = arData[i]; }
//			if(min > arData[i]) { min = arData[i]; }
//		}
//		
//		System.out.println("�ִ밪: " + max);
//		System.out.println("�ּҰ�: " + min);
		
//		���̾�
//		����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int[] arData = null;
		String[] arOrdinal = {"ù", "��", "��", "��", "�ټ�"};
		String message1 = "������ ����: ", message2 = "��° ����: ";
		int total = 0, length = 0;
		double average = 0.0;
		
		System.out.print(message1);
		length = sc.nextInt();
		arData = new int[length];
		
		for (int i = 0; i < length; i++) {
			System.out.print(arOrdinal[i] + message2);
			arData[i] = sc.nextInt();
		}
		
		for (int i = 0; i < length; i++) {
			total += arData[i];
		}
		
		average = (double)total / length;

		System.out.print("[");
		for (int i = 0; i < length; i++) {
			System.out.print(arData[i]);
			if(i != length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println("]");
		
		System.out.println("���: " + average);
	}
}













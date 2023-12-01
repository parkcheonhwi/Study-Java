package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5���� ������ �Է¹ޱ�
//		- ���� �Է� ���·� ����
//		- q �Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �� �� ����ϱ�

//		alt + shift + z : ���� ����Ű(������ ��� ����ؾ� �Ѵ�)
		
		Scanner sc = new Scanner(System.in);
		String message = "��° ����: ";
		int count = 0;
		int[] arData = new int[5];
		String temp = null;
		
		while(true) {
			count++;
			System.out.print(count + message);
			temp = sc.next();
			if(temp.equals("q")) {
				break;
			}
			
			try {
				arData[count - 1] = Integer.parseInt(temp);
				
			} catch (NumberFormatException e) {
				System.out.println("������ �Է����ּ���.");
				count--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5���� ���������� �Է��� �� �ֽ��ϴ�.");
				for (int i = 0; i < arData.length; i++) {
					System.out.print(arData[i] + " ");
				}
				System.out.println();
				break;
			} catch (Exception e) {
				System.out.println("�� �� ���� ����.");
				count--;
			}
		}
	}
}





















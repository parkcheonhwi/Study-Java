package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		�ɸ� �׽�Ʈ(�����), ��ȣ�� �Է¹ޱ�
//		Q. ����� �����ϴ� ���� �����ϼ���.
//		1. ������
//		2. �����
//		3. ������
//		4. ���
//		
//		������ : �Ұ��� �������̰� �������̴�.
//		����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
//		������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
//		��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
		
		String message = "Q. ����� �����ϴ� ���� �����ϼ���.";
		String choiceMessage = "1.������\n2.�����\n3.������\n4.���";
		String redMessage = "�Ұ��� �������̰� �������̴�."; 
		String yellowMessage = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�."; 
		String blackMessage = "�����ϰ� ����ϰ� ��ö�ϰ� ������."; 
		String whiteMessage = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		String errorMessage = "�ٽ� �Է����ּ���.";
		int choice = 0;
		String result = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		System.out.println(choiceMessage);
		choice = sc.nextInt();
		
		result = choice == 1 ? redMessage 
				: choice == 2 ? yellowMessage
						: choice == 3 ? blackMessage 
								: choice == 4 ? whiteMessage 
										: errorMessage;
		
		System.out.println(result);
	}
}
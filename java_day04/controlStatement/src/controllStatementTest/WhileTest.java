package controllStatementTest;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		String message = "Q. ����� �����ϴ� ���� �����ϼ���.";
		String choiceMessage = "1.������\n2.�����\n3.������\n4.���\n5.������";
		String redMessage = "�Ұ��� �������̰� �������̴�."; 
		String yellowMessage = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�."; 
		String blackMessage = "�����ϰ� ����ϰ� ��ö�ϰ� ������."; 
		String whiteMessage = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		String errorMessage = "�ٽ� �Է����ּ���.";
		int choice = 0;
		String result = null;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(message);
			System.out.println(choiceMessage);
			choice = sc.nextInt();
			
			if(choice == 5) {break;}
			
			switch(choice) {
			case 1:
				result = redMessage;
				break;
			case 2:
				result = yellowMessage;
				break;
			case 3:
				result = blackMessage;
				break;
			case 4:
				result = whiteMessage;
				break;
			default:
				result = errorMessage;
				break;
			}
			
			System.out.println(result);
		}
		
		
//		�̸� 10�� ��� : �߸��� �������� while�� ���
//		int count = 0;
//		while(count != 10) {
//			System.out.println(count + ".�ѵ���");
//			count++;
//		}
	}
}

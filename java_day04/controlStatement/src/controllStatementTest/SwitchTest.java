package controllStatementTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
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
		
//		if(choice == 1) {
//			result = redMessage;
//		}else if(choice == 2) {
//			result = yellowMessage;
//		}else if(choice == 3) {
//			result = blackMessage;
//		}else if(choice == 4) {
//			result = whiteMessage;
//		}else {
//			result = errorMessage;
//		}
		
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
}













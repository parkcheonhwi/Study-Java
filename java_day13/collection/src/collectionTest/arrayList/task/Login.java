package collectionTest.arrayList.task;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		UserField userField = new UserField();
		User user = new User();
//		User user2 = new User();
		
		user.setId("hds1234");
		user.setName("�ѵ���");
		user.setPassword("1234");
		user.setPhone("01012341234");
		
//		user2.setId("hds12345");
//		user2.setName("�ѵ���");
//		user2.setPassword("4444");
//		user2.setPhone("0108889999");
		
		if(userField.checkId(user.getId()) == null) {
			
//			������ȣ �߼�
//			String number = userField.sendNumber(user.getPhone());
			String number = userField.makeNumber(6);
			System.out.println(number);
//			������ȣ �˻�
			System.out.print("������ȣ: ");
			if(number.equals(new Scanner(System.in).next())){
				userField.join(user);
				System.out.println(DBConnecter.users);
			}else{
				System.out.println("������ȣ�� Ȯ�����ּ���");
			}
		}else {
			System.out.println("�ߺ��� ���̵�");
		}
		
//		if(userField.checkId(user2.getId()) == null) {
//			userField.join(user2);
//			System.out.println(DBConnecter.users);
//		}else {
//			System.out.println("�ߺ��� ���̵�");
//		}

		
		User userForLogin = new User();
		userForLogin.setId("hds1234");
		userForLogin.setPassword("1234");
		
		if(userField.login(userForLogin)) {
			System.out.println("�α��� ����");
			
		}else {
			System.out.println("�α��� ����");
			
		}
		
////		����������
//		User foundUser = userField.checkId(UserField.userId);
//		foundUser.setPassword("6666");
//		
////		��й�ȣ ����
//		userField.update(foundUser);
		
//		��й�ȣ ���� ������(30�� �Ѱ� ��й�ȣ �����)
		if(userField.update("1234", "8888")) {
			System.out.println("��й�ȣ ���� �Ϸ�, �ٽ� �α��� ���ּ���.");
//		�α׾ƿ�
			userField.logout();
//		��α���
			userForLogin = new User();
			userForLogin.setId("hds1234");
			userForLogin.setPassword("8888");
			
			if(userField.login(userForLogin)) {
				System.out.println("�α��� ����");
				
			}else {
				System.out.println("�α��� ����");
				
			}
		}else {
			System.out.println("��й�ȣ�� Ȯ���ϼ���.");
		}
		
		
		
	}
}





















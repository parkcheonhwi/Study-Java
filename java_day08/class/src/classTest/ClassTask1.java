package classTest;

import java.util.Scanner;

class SuperCar {
//	�귣��
	String brand;
//	����
	String color;
//	����
	long price;
//	����
	boolean engine;
//	��й�ȣ
	String password;
//	��й�ȣ ���� Ƚ��
	int errorCount;

//	static ���
	static {
		System.out.println("��� ���ϵ帳�ϴ�.");
	}

//	�ʱ�ȭ ���
	{
		this.password = "0000";
	}

//	�⺻ ������
	public SuperCar() {
		;
	}

//	�ʱ�ȭ ������
	public SuperCar(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public SuperCar(String brand, String color, long price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}

//	�õ� �ѱ�
//	"ABC".equals("ABC");
//	����ڰ� �Է��� ��й�ȣ�� ���� ������ �õ� �ѱ�
//	���� 3ȸ ���� �� ���� �⵿
	void engineStart() {
		engine = true;
	}

//	�õ� ����
	void engineStop() {
		engine = false;
	}
	
//	��й�ȣ �˻�
	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}

}

public class ClassTask1 {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 700_000_000, "7777");
				
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String password = null;
		while(true) {
			System.out.println("1. �õ��ѱ�\n2. �õ�����");
			choice = sc.nextInt();
			
			if(choice == 1) { // �õ� �ѱ�
				if(!ferrari.engine) {
					System.out.print("��й�ȣ : ");
					password = sc.next();
					if(ferrari.checkPassword(password)) {
						ferrari.errorCount = 0;
						ferrari.engineStart();
						System.out.println(ferrari.brand + " �õ� ����");
						
					}else {
						ferrari.errorCount++;
						if(ferrari.errorCount > 2) {
							System.out.println("���� �⵿");
							break;
						}
					}
				}else {
					System.out.println(ferrari.brand + "�õ��� �̹� �����ֽ��ϴ�.");
				}
				
			}else if(choice == 2) { // �õ� ����
				if(ferrari.engine) {
					ferrari.engineStop();
					System.out.println(ferrari.brand + " �õ� ����");
				}else {
					System.out.println(ferrari.brand + " �õ��� �̹� �����ֽ��ϴ�.");
				}
				
			}else {
				System.out.println("�ٽ� ��");
			}
		}
		
	}
}





























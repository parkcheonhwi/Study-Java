package methodTest;

public class MethodTest {

//	f(x) = 2x+1
//	��, x�� �����̴�.
	int f(int x){
		return 2 * x + 1;
	}
	
//	�� ������ ���� �޼ҵ�
	int add(int number1, int number2){
		return number1 + number2;
	}

//	�޼ҵ� ��� ���
//	1. �޼ҵ� ���� �� static�� �ٿ��ش�.
//	2. ����ϰ��� �ϴ� �޼ҵ��� �Ҽ��� �˷��ش�.
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
//		System.out.println(mt.f(10));
		int result = mt.add(10, 20);
		System.out.println("�����: " + result);
	}
}

















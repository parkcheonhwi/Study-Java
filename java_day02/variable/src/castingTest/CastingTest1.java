package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
		double number1 = 8.43, number2 = 2.59;
//		�ʱⰪ
//		����: 0
//		�Ǽ�: 0.0
//		����: ' '
//		���ڿ�: null, ""
		int result = 0;
		
//		�ڵ� ����ȯ
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		
//		���� ����ȯ
		System.out.println(5 / (double)2);
		System.out.println((int)8.43 + 2.59);
		System.out.println((int)(8.43 + 2.59));
		
//		8.43 + 2.59 = 10
		result = (int)number1 + (int)number2;
		System.out.println(result);
		
	}
}


















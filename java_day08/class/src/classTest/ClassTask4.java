package classTest;

public class ClassTask4 {
	
//	Ŭ������ ���� �� ��
//	 �� �ʵ带 ���� �����Ͽ� ���ϴ� ��ġ�� ����� ��
	
//	�迭�� ������ ��
//	 ��� �����͸� ������� ����� ��
	
	Result getMaxAndMin(int[] arData) {
		Result result = new Result(arData[0], arData[0]);
		
		for (int i = 0; i < arData.length; i++) {
			if(result.max < arData[i]) { result.max = arData[i]; }
			if(result.min > arData[i]) { result.min = arData[i]; }
		}
		return result;
	}
	
	public static void main(String[] args) {
		ClassTask4 classTask4 = new ClassTask4();
		int[] arData = {5, 6, 8, 2, 7};
		
		Result result = classTask4.getMaxAndMin(arData);
		System.out.println("�ִ밪: " + result.max);
		System.out.println("�ּҰ�: " + result.min);
	}
}




















package methodTest;

import java.util.Scanner;

public class MethodTask {
//		1~10���� println()���� ����ϴ� �޼ҵ�
	void printFrom1To10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//		"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	void printHong(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("ȫ�浿");
		}
	}

//		�̸��� n�� println()���� ����ϴ� �޼ҵ�
	void printName(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}

//		�� ������ �������ִ� �޼ҵ�
	int sub(int number1, int number2, int number3) {
		return number1 - number2 - number3;
	}

//		�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
	int[] getResultByDivision(int number1, int number2) {
		return new int[] { number1 / number2, number1 % number2 };
	}

//		1~n������ ���� �����ִ� �޼ҵ�
	int getTotalFrom1(int end) {
		int result = 0;
		for (int i = 0; i < end; i++) {
			result += i + 1;
		}
		return result;
	}

//		Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�(2 -> 3, 5 -> 6)
	int change(int number) {
		return ++number;
	}

//		���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
	String changeToUpperCaseOrLowerCase(String content) {
		String result = "";
		for (int i = 0; i < content.length(); i++) {
			char c = content.charAt(i);
			if (c >= 65 && c <= 90) {
				result += (char) (c + 32);
			} else if (c >= 97 && c <= 122) {
				result += (char) (c - 32);
			} else {
				result += c;
			}
		}

		return result;
	}

//		���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
	int getCountOfCharacterInContent(String content, char character) {
		int count = 0;
		for (int i = 0; i < content.length(); i++) {
			if (content.charAt(i) == character) {
				count++;
			}
		}

		return count;
	}

//		5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
	int getValueInArray(int[] arData, int index) {
		return arData[index];
	}

//		�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
	int changeToInteger(String hangle) {
		String hangles = "�����̻�����ĥ�ȱ�";
		String result = "";
		for (int i = 0; i < hangle.length(); i++) {
			result += hangles.indexOf(hangle.charAt(i));
		}
		return Integer.parseInt(result);
	}

//		5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
//	int[] getMaxAndMin(int[] arData) {
//		int[] arResult = {arData[0], arData[0]};
//		for (int i = 1; i < arData.length; i++) {
//			if (arResult[0] < arData[i]) {
//				arResult[0] = arData[i];
//			}
//			if (arResult[1] > arData[i]) {
//				arResult[1] = arData[i];
//			}
//		}
//		
//		return arResult;
//	}

//		5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
	void getMaxAndMin(int[] arData, int[] arResult) {
		for (int i = 1; i < arData.length; i++) {
			if (arResult[0] < arData[i]) {
				arResult[0] = arData[i];
			}
			if (arResult[1] > arData[i]) {
				arResult[1] = arData[i];
			}
		}
	}
	
	
//		String Ŭ������ indexOf()�޼ҵ� �����, ���ڿ� ��ü�� �˻��� ���ڸ� ���޹޴´�.
	int indexOf(String content, char charcter) {
		for (int i = 0; i < content.length(); i++) {
			if(content.charAt(i) == charcter) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		MethodTask methodTask = new MethodTask();
//		methodTask.printFrom1To10();
//		methodTask.printHong(10);
//		methodTask.printName("�ѵ���", 10);
//		int result = methodTask.sub(1, 2, 3);
//		System.out.println(result);
//		int[] arResult = methodTask.getResultByDivision(10, 3);
//		System.out.println("��: " + arResult[0]);
//		System.out.println("������: " + arResult[1]);
//		int result = methodTask.getTotalFrom1(100);
//		System.out.println(result);
//		Scanner sc = new Scanner(System.in);
//		int result = 0;
//		String resultMessage = null;
//		
//		System.out.print("0 �Ǵ� �ڿ���: ");
//		result = methodTask.change(sc.nextInt());
//		
//		resultMessage = result % 2 == 0 ? "¦���� ����Ǿ����ϴ�." : "Ȧ���� ����Ǿ����ϴ�.";
//		System.out.println(resultMessage);
//		String result = methodTask.changeToUpperCaseOrLowerCase("apple123!@#GOOd");
//		System.out.println(result);
//		int count = methodTask.getCountOfCharacterInContent("apple", 'p');
//		System.out.println(count + "��");
//		int value = methodTask.getValueInArray(new int[] {1, 3, 5, 7, 9}, 2);
//		System.out.println(value);
//		int result = methodTask.changeToInteger("�Ȱ������̻�");
//		System.out.println(result);
//		int[] arResult = methodTask.getMaxAndMin(new int[] {3, 6, 1, 8, 9});
//		System.out.println("�ִ밪: " + arResult[0]);
//		System.out.println("�ּҰ�: " + arResult[1]);
//		int[] arData = {3, 6, 1, 8, 9};
//		int[] arResult = {arData[0], arData[0]};
//		methodTask.getMaxAndMin(arData, arResult);
//		System.out.println("�ִ밪: " + arResult[0]);
//		System.out.println("�ּҰ�: " + arResult[1]);
		
//		int result = methodTask.indexOf("apple", 'e');
//		System.out.println(result);
	}
}

















package lambdaTask;

public class PrintNameTest {
	public static void main(String[] args) {
//		�ܺο��� ���޹��� �� ��, �̸��� �޾Ƽ� ��ü �̸��� �����Ѵ�. 
		PrintName printName = (l, f) -> l + f;
		System.out.println(printName.getFullName("��", "����"));
	}
}

package interfaceTest;

public class Cat implements Pet{
	@Override
	public void sitDown() {
		System.out.println("���� �ʴ´�.");
	}
	
	@Override
	public void waitNow() {
		System.out.println("�ȱ�ٸ���.");
	}
	
	@Override
	public void poop() {
		System.out.println("�� ���ص� �� �Ѵ�.");
	}

}




















package synchronizedTest;

public class ATM implements Runnable{
	
	int money = 10000;
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			withdraw(1000);
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
		}
	}
	
//	����ȭ�� ����ϸ�, �ϳ��� ������ �۾� ���� �� ���� �����尡 ���۵ȴ�.
//	�ڿ� ���� �� ������ �ǳʶٴ� ��츦 ������ �� �ִ�.
	public synchronized void withdraw(int money) {
//		synchronized (this) {
			this.money -= money;
			System.out.println(Thread.currentThread().getName() + "��(��)" + money + "�� ���");
			System.out.println("���� �ܾ�: " + this.money + "��");
//		}
	}
	
	
}













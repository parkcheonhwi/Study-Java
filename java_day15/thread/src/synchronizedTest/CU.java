package synchronizedTest;

public class CU {
	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread mom = new Thread(atm, "����");
		Thread daughter = new Thread(atm, "��");
		
		mom.start();
		daughter.start();
	}
}

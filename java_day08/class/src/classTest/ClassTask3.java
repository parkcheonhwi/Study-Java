package classTest;

class Market {
	String productName;
	int productPrice;
	int productStock;
	
	public Market() {;}
	
	public Market(String productName, int productPrice, int productStock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}

	void sell(Customer customer) {
		customer.money -= productPrice - productPrice * (customer.discount / 100.0);
		productStock--;
	}
}

class Customer {
	String name;
	String phone;
	int money;
	int discount;
	
	public Customer() {;}

	public Customer(String name, String phone, int money, int discount) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.discount = discount;
	}
}

public class ClassTask3 {
	public static void main(String[] args) {
		Market emart = new Market("����", 7000, 300);
		Customer hds = new Customer("�ѵ���", "01012341234", 10000, 30);
		emart.sell(hds);
		
		System.out.println(emart.productStock + "�� ����");
		System.out.println(hds.money + "�� ����");
	}
}














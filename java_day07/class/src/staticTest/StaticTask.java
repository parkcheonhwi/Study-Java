package staticTest;

class Company {
	static int money;
	String name;
	int age;
	int income;
	
	public Company(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class StaticTask {
	public static void main(String[] args) {
		Company employee1 = new Company("�ѵ���", 20);
		Company employee2 = new Company("�̵���", 21);
		Company employee3 = new Company("�����", 22);
		Company employee4 = new Company("��ȫ��", 23);
		
		employee1.income += 10_000;
		employee2.income += 1_000;
		employee3.income += 2_000;
		employee4.income -= 10_000;
		
		Company.money += employee1.income;
		Company.money += employee2.income;
		Company.money += employee3.income;
		Company.money += employee4.income;
		
		System.out.println(Company.money);
	}
}


















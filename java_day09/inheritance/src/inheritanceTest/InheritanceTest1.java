package inheritanceTest;

class A {
	String name;
	int data;
	
	public A() {
		System.out.println(this);
		System.out.println("�θ� ������ ȣ���.");
		this.name = "A";
		this.data = 10;
	}
	
	void printName() {
		System.out.println(name);
	}
}

class B extends A{
	
	public B() {
		super();
		System.out.println(this);
		System.out.println("�ڽ� ������ ȣ���.");
	}
	
	void printData() {
		System.out.println(data);
	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B b = new B();
		b.printName();
		System.out.println(b);
	}
}






















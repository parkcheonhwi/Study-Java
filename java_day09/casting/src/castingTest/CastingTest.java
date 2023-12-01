package castingTest;

class Car {
	
	public Car() {;}
	
	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
	
}

class SuperCar extends Car{
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	void openRoof() {
		System.out.println("���� ����");
	}
}

public class CastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
//		up casting
		Car noOptionFerrari = new SuperCar();
		noOptionFerrari.engineStart();
		
//		down casting
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		fullOptionFerrari.openRoof();
		
//		����
//		SuperCar brokenFerrari = (SuperCar) new Car();
		
//		instanceof : ���ǽ�
//		��ü instanceof Ÿ�� : �� �Ǵ� ����
		
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(ferrari instanceof Car);
		System.out.println(ferrari instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionFerrari instanceof Car);
		System.out.println(fullOptionFerrari instanceof SuperCar);
		
	}
}







































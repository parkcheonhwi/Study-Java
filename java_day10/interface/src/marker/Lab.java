package marker;

public class Lab {
	public void checkKinds(Animal[] arAnimal) {
		for (int i = 0; i < arAnimal.length; i++) {
			
			if(arAnimal[i] instanceof CarnivoreMarker) {
				System.out.println("���ĵ���");
			}else if(arAnimal[i] instanceof HerbivoreMarker) {
				System.out.println("�ʽĵ���");
			}else {
				System.out.println("��ĵ���");
			}
		}
	}
	
	public static void main(String[] args) {
		
		new Lab().checkKinds(new Animal[] {new Bear(), new Cow(), new Dog(), new Tiger()});
	}
}























package equalsTest;

class Student {
	private int id;
	private String name;
	private int age;
	
	public Student() {;}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Student) {
			Student anotherStudent = (Student) obj;
			if(this.id == anotherStudent.getId()) {
				return true;
			}
		}
		return false;
	}
	
}

public class EqualsTest {
	
	
	public static void main(String[] args) {
		Student student = new Student(1, "�ѵ���", 20);
		
		if(student.equals(new Student(1, "�ѵ���", 20))) {
			System.out.println("�뿩 �Ϸ�");
			
		}else {
			System.out.println("���� �Ű���");
		}
		
		
		
//		String data1 = "ABC";
//		String data2 = "ABC";
//		String data3 = new String("ABC");
//		String data4 = new String("ABC");
//		
//		System.out.println(data1 == data2);
//		System.out.println(data1.equals(data2));
//		System.out.println(data3 == data4);
//		System.out.println(data3.equals(data4));
	}
}



















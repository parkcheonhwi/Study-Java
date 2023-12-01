package lambdaTask;

public class PrintNameTest {
	public static void main(String[] args) {
//		외부에서 전달받은 성 씨, 이름을 받아서 전체 이름을 제작한다. 
		PrintName printName = (l, f) -> l + f;
		System.out.println(printName.getFullName("한", "동석"));
	}
}

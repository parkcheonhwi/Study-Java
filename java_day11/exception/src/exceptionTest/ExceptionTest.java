package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] arData = new int[5];
		
		try {
			System.out.println(arData[0]);
			System.out.println("����!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

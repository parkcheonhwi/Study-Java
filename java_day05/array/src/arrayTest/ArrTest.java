package arrayTest;

public class ArrTest {
	public static void main(String[] args) {
		int[][] arrData = {{3, 4, 5, 6}, {8, 9, 1, 4}, {1, 5, 6, 7}};
		
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.print(arrData[i][j]);
			}
			System.out.println();
		}
		
		
//		int length = 0;
		
//		System.out.println(arrData.length); //���� ����
//		System.out.println(arrData[0].length); //���� ����
		
//		for (int i = 0; i < arrData.length; i++) {
//			length += arrData[i].length;
//		}
		
//		for (int i = 0; i < length; i++) { // 12��
//			System.out.print(arrData[i / 4][i % 4]);
//			if((i + 1) % 4 == 0) {
//				System.out.println();
//			}
//		}
		
		
		
	}
}















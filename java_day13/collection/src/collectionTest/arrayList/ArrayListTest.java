package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
//		<?>: ���׸�(�̸��� ����)
//		��üȭ �� Ÿ���� �����ϴ� ���
//		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//		���� �ٿ� ĳ������ �� �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ִ�.
		
		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(60);
		datas.add(20);
		datas.add(70);
		datas.add(80);
		datas.add(90);
		System.out.println(datas.size());
		
		try {
			System.out.println(datas.get(10));
		} catch (Exception e) {
			System.out.println("�ε��� �ȹٷ�!");
		}
		
		Collections.shuffle(datas);
		Collections.sort(datas);
		System.out.println(datas);
		Collections.reverse(datas);
		System.out.println(datas);
		
//		�߰�(����)
//		50 �ڿ� 500 ����
		if(datas.contains(50)) {
			try {
				datas.add(datas.indexOf(50) + 1, 500);
			} catch (Exception e) {
				System.out.println("�͵��� �ȹٷ�!");
			}
		}else {
			System.out.println("ã���ô� ���� �����ϴ�.");
		}
		
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
		System.out.println(datas);
		
//		����
//		90�� 9�� ����
		if(datas.contains(90)) {
			int prev = datas.set(datas.indexOf(90), 9);
			System.out.println(prev + " ���� �Ϸ�");
		}
		
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
		
		System.out.println(datas);
		
//		����
//		80 ����
//		1. �ε����� ����
//		if(datas.contains(80)) {
//			int deletedData = datas.remove(datas.indexOf(80));
//			System.out.println(deletedData + " ���� �Ϸ�");
//			System.out.println(datas);
//		}
//		2. ������ ����
		if(datas.remove(Integer.valueOf(80))) {
			System.out.println("���� ����");
			System.out.println(datas);
		}		
		
	}
}


























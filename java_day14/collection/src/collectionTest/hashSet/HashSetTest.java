package collectionTest.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
//		�����͸� �������� ���� �� ������ �ο��ؾ� �Ѵ�.
//		iterator�� �����̴�.
		HashSet<String> bloodTypeSet = new HashSet<String>();
		
		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("O");
		bloodTypeSet.add("AB");
		
		Iterator<String> iter = bloodTypeSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
//		�ߺ������� �� ���!
//		DBMS�� �⺻ ������ Set�̴�!
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 1, 2));
//		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
//		
//		System.out.println(datas);
		
		
//		HashSet<String> bloodTypeSet = new HashSet<String>();
//		bloodTypeSet.add("A");
//		bloodTypeSet.add("B");
//		bloodTypeSet.add("O");
//		System.out.println(bloodTypeSet.add("AB"));
//		System.out.println(bloodTypeSet.add("AB"));
//		System.out.println(bloodTypeSet.add("AB"));
//		System.out.println(bloodTypeSet.add("AB"));
//		System.out.println(bloodTypeSet.add("AB"));
//		System.out.println(bloodTypeSet.add("AB"));
//		System.out.println(bloodTypeSet.add("AB"));
//		System.out.println(bloodTypeSet.add("AB"));
//		System.out.println(bloodTypeSet.add("AB"));
//		System.out.println(bloodTypeSet.add("AB"));
//		
//		System.out.println(bloodTypeSet.size());
	}
}


















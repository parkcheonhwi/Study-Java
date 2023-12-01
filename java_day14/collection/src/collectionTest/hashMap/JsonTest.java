package collectionTest.hashMap;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		User user1 = new User(1, "�ѵ���", 20, "����");
		User user2 = new User(2, "ȫ�浿", 20, "������");
		User user3 = new User(3, "�̼���", 20, "��ȹ��");
		User user4 = new User(4, "�輼ȯ", 20, "����");
		User user5 = new User(5, "�����", 20, "������");
		
		JSONArray usersJSON = new JSONArray(); 
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		users.stream().map(JSONObject::new).forEach(usersJSON::put);
		
		System.out.println(usersJSON.toString());
		
	}
}



























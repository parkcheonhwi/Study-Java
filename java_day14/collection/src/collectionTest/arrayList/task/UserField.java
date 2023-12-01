package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	public static String userId;
	public ArrayList<User> users = DBConnecter.users;
	private final int KEY = 3;
	
//	���̵� �ߺ��˻�
	public User checkId(String id) {
//		���� for��, ���� for��, forEach
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	
//	ȸ������
	public void join(User user) {
		user.setPassword(encrypt(user.getPassword()));
		users.add(user);
	}
	
//	�α���
	public boolean login(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb != null) {
			if(userInDb.getPassword().equals(encrypt(user.getPassword()))) {
				userId = user.getId();
				return true;
			}
		}
		return false;
		
	}
	
//	�α׾ƿ�
	public void logout() {
		userId = null;
	}
	
//	��й�ȣ ����(����������)
	public void update(User user) {
		User userInDb = checkId(user.getId());
		userInDb.setPassword(encrypt(user.getPassword()));
	}
	
//	��й�ȣ ����(��й�ȣ ���� ������)
	public boolean update(String password, String newPassword) {
		User foundUser = checkId(userId);
		if(foundUser.getPassword().equals(encrypt(password))) {
			foundUser.setPassword(encrypt(newPassword));
			return true;
		}
		return false;
	}
	
//	������ȣ ����(6�ڸ�)
	public String makeNumber(int count) {
		Random random = new Random();
		String number = "";
		for (int i = 0; i < count; i++) {
			number += random.nextInt(10);
		}
		return number;
	}
	
//	������ȣ ����
	public String sendNumber(String phone) {
		String api_key = "";
	    String api_secret = "";
	    Message coolsms = new Message(api_key, api_secret);
	    String number = makeNumber(6);
	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", phone);
	    params.put("from", "01000000000");
	    params.put("type", "SMS");
	    params.put("text", "[������ȣ]" + number);
	    params.put("app_version", "test app 1.2"); // application name and version

	    try {
	      JSONObject obj = (JSONObject) coolsms.send(params);
	      System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }
	    return number;
	}
	
//	��ȣȭ
	public String encrypt(String password) {
		String encryptedPassword = "";
		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char)(password.charAt(i) * KEY);
		}
		
		return encryptedPassword;
	}
}





















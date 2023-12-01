package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {

	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("�ѵ���", "hds", "1234"),
			new User("ȫ�浿", "hgd", "2314"),
			new User("�̼���", "lss", "5434"),
			new User("�輼ȯ", "ksh", "2232")
			));

	
//	���� Optional ����ٰ� �� Optional�� ������ ���ƶ�!
//	�ݵ�� ���� Ÿ�Կ����� Optional�� ����ϰ�, ���� ��ü�� �����ش�.
//	��) Optional<List<User>> : ����.
	public Optional<User> findById(Long id) {
		User user = null;
		
		for(User userInDb : users) {
			if(userInDb.getId() == id) {
				user = userInDb;
			}
		}
		
		return Optional.ofNullable(user);
		
	}

	public static void main(String[] args) {
//		OptionalTest optionalTest = new OptionalTest();
//		Optional<User> foundUser = optionalTest.findById(3000L);
//		User user = foundUser.orElseThrow(() -> {throw new NoSuchUserException("�׷� ��� �����ϴ�.");});
		
//		if(foundUser.isPresent()) {
//			foundUser.get();
//		}
//		optionalTest.findById(3000L).map(User::getUserId).ifPresent(System.out::println);
//		optionalTest.findById(3000L).map(User::getUserId)
//		.ifPresentOrElse(userId -> {
//			System.out.println(userId);
//		}, () -> {
//			System.out.println("�������� �ʴ� ȸ���Դϴ�.");
//		});
	}
}

























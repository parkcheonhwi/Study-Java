package anonymous;

public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
//		����� ����
//		���ᳪ�� �����
		Starbucks jamsil = new Starbucks();
		
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				return new String[] {"�Ƹ޸�ī��", "ī���", "���̵�", "��ī����"};
			}
		});
		
		gangnam.register(new Form() {
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenu();
				
				for (int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + " �Ǹ� �Ϸ�");
						break;
					}
				}
				
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"�Ƹ޸�ī��", "ī���", "���̵�", "��ī����"};
			}
		});
	}
}











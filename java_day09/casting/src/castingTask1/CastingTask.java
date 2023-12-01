package castingTask1;

//���ø���
//�ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
//����ڰ� ������ ������
//�ִϸ��̼��̶�� "�ڸ� ����" ��� ���
//��ȭ��� "4D" ��� ���
//��󸶶�� "����" ��� ���
public class CastingTask {
	
	public void checkVideo(Video video) {
		if(video instanceof Drama) {
			Drama drama = (Drama) video;
			drama.sellGoods();
		}else if(video instanceof Animation) {
			Animation animation = (Animation) video;
			animation.showSubtitle();
		}else if(video instanceof Film) {
			Film film = (Film) video;
			film.shakeChair();
		}
	}
	
	public static void main(String[] args) {
		CastingTask castingTask = new CastingTask();
		castingTask.checkVideo(new Drama());
		castingTask.checkVideo(new Film());
		castingTask.checkVideo(new Animation());
	}
}















package cn.zw.thread.create;
/**
 * �Ƽ�ʹ��ʵ��Runnable�ӿڷ��������߳�
 * 1.���ⵥ�̳д����ľ�����
 * 2.���ڹ�����Դ
 * <p>Title:TestRunnable</p>
 * ʹ��Runnable�����߳�
 * 1.��ʵ��Runnable�ӿڣ�����run()--->��ʵ��ɫ
 * 2.�������߳�  ʹ�þ�̬����
 * 	a.������ʵ��ɫ
 * 	b�����������ɫ+��ʵ��ɫ����
 * 	c.����start()����
 * @author zhengwei
 * @date 2017-5-11 ����1:42:25
 */
public class TestRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("���Ż��");
		}
	}
}

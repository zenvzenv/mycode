package cn.zw.thread.create;
/**
 * 
 * <p>Title:Demo01</p>
 * ģ���������
 * 1.�������߳�		�̳�Thread+��дrun()�߳���
 * 2.ʹ���̣߳�����������󣬵��ö����start()�����������߳�
 * @author zhengwei
 * @date 2017-5-11 ����1:07:31
 */
public class Tuzi extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("��������"+i+"��");
		}
	}
}
class Wugui extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("�ڹ�����"+i+"��");
		}
	}
}
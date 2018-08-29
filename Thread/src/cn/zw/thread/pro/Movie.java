package cn.zw.thread.pro;
/**
 * 
 * <p>Title:Movie</p>
 * һ����������ͬ����Դ
 * �����ߣ�������ģʽ		�źŵƷ�
 * wait():�̵߳ȴ����ͷ�������sleep���ͷ���
 * notify()/notifyAll()�����߳�
 * @author zhengwei
 * @date 2017-5-11 ����8:30:28
 */
public class Movie {
	private String pic;
	//�ź�
	//flag-->T	�����������������ߵȴ���������ɺ�֪ͨ����
	//flag-->F	���������ѣ������ߵȴ���������ɺ�֪ͨ����
	private boolean flag=true;
	/**
	 * ����
	 * @param pic
	 */
	public synchronized void play(String pic){
		if (!flag) {	//�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�����ˣ�"+pic);
		//�������
		this.pic=pic;
		//֪ͨ����
		this.notifyAll();
		//������ͣ��
		this.flag=false;
	}
	public synchronized void watch(){
		if(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�����ˣ�"+pic);
		//
		//֪ͨ����
		this.notifyAll();
		//����ֹͣ
		this.flag=true;
	}
}

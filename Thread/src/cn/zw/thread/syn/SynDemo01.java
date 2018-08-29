package cn.zw.thread.syn;
/**
 * 
 * <p>Title:SynDemo01</p>
 * �������ģʽ
 * ȷ��һ����ֻ��һ������
 * ����ʽ		double checking
 * 1.������˽�л��������ⲿֱ�Ӵ�������
 * 2.����һ��˽�еĹ��췽��
 * 3.����һ������Ĺ����ľ�̬���������ʱ��������û�ж��󣬴����ö���
 * 
 * @author zhengwei
 * @date 2017-5-11 ����9:10:59
 */
public class SynDemo01 {
	public static void main(String[] args) {
		JvmThread t1=new JvmThread(100);
		JvmThread t2=new JvmThread(500);
		t1.start();
		t2.start();
	}
}
class JvmThread extends Thread{
	private long time;
	public JvmThread(){
	}
	public JvmThread(long time){
		this.time=time;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"--->����"+Jvm.getInstance(time));
	}
}
class Jvm{
	//����һ��˽�еľ�̬����
	private static Jvm instance =null;
	//������˽�л��������ⲿֱ�Ӵ�������
	private Jvm(){
		
	}
	//����һ������Ĺ����ľ�̬�������������ʱ������������û�ж��󣬴����ö���
	public static Jvm getInstance(long time){
		//���μ�飬���Ч��
		if(null==instance){
			synchronized(Jvm.class){
				if (null==instance) {
					try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance=new Jvm();
				}
			}
		}
		return instance;
	}
}
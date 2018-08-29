package cn.zw.thread.syn;
/**
 * �������ģʽ
 * 1.����ʽ
 * a.������˽�л�
 * b.����˽�еľ�̬����
 * c.�����ṩ�������Եľ�̬������ȷ���������
 * <p>Title:MyJvm</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-11 ����9:24:18
 */
public class MyJvm {
	private static MyJvm instance;
	private MyJvm(){
		
	}
	public static MyJvm getInstance(){
		if(null==instance){//���Ч��
			synchronized(MyJvm.class){
				if (null==instance) {
					instance=new MyJvm();
				}
			}
		}
		return instance;
	}
}
/**
 * 
 * <p>Title:MyJvm2</p>
 * ����ʽ
 * 1.������˽�л�
 * 2.����˽�еľ�̬���ԣ�ͬʱ��������
 * 3.��������ľ�̬�ķ������Եķ��ʷ���
 * @author zhengwei
 * @date 2017-5-11 ����9:28:58
 */
class MyJvm2{
	private static MyJvm2 instance=new MyJvm2();
	private MyJvm2(){
		
	}
	public static MyJvm2 getInstance(){
		return instance;
	}
}
/**
 * ����ʹ�õ�ʱ����أ��ӻ�����ʱ�䣬���Ч��
 * <p>Title:MyJvm3</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-11 ����9:33:04
 */
class MyJvm3{
	private static class JVMholder{
		private static MyJvm3 instance=new MyJvm3();
	}
	private MyJvm3(){
		
	}
	public static MyJvm3 getInstance(){
		return JVMholder.instance;
	}
}

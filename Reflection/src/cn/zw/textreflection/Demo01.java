package cn.zw.textreflection;
/**
 * 
 * <p>Title:Demo01</p>
 * <p>Description:���Ը������Ͷ�Ӧ��java.lang.Class����Ļ�ȡ��ʽ</p>
 * .class
 * .getClass
 * Class c=forName()
 * @author zhengwei
 * @date 2017-5-14 ����8:17:51
 */
@SuppressWarnings("all")
public class Demo01 {
	public static void main(String[] args) {
		String path="cn.zw.bean.User";
		
		try {
			//����ͱ�ʾһЩ���ݣ�һ���౻���غ�JVM�ᴴ��һ����Ӧ�����Class������������ṹ��Ϣ���ᱻ�ŵ���Ӧ��Class������ȥ
			//���Class�������һ�澵��һ����ͨ�����澵�����ǿ��Կ�����Ӧ���ȫ�����ǡ�������Ƿ���
			Class clz=Class.forName(path);
			System.out.println(clz.hashCode());
			
			Class clz2=Class.forName(path);//һ����ֻ��Ӧһ������
			System.out.println(clz2.hashCode());
			
			Class clz3=String.class;
			Class clz4=path.getClass();
			System.out.println(clz3==clz4);
			
			Class clz5=int.class;
			
			int[] a=new int[10];
			int[] b=new int[30];
			System.out.println(a.getClass().hashCode());
			System.out.println(b.getClass().hashCode());
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

package cn.zw.array;
/**
 * ��������Ļ����﷨
 * @author zhengwei
 *
 */
public class Test02 {
	public static void main(String[] args){
		//��������
		int[] a;
		int b[];
		//��������
		a=new int[4];
		b=new int[5];
		//��ʼ������
		//1.Ĭ�ϳ�ʼ��������Ԫ���൱�ڶ���ĳ�Ա������Ĭ�ϵĹ������Ա������ͬ
		//2.��̬��ʼ��:
//		a[0]=23;
//		a[1]=24;
//		a[2]=25;
//		a[3]=26;
		for (int i = 0; i < a.length; i++) {
			a[i]=i*12;
		}
		//3.�����ʼ��
		int[] c={13,45,78};
		Car[] cars={
						new Car("����"),
						new Car("��������"),
						new Car("����")
					};
		Car c2=new Car("����");
		System.out.println(c2==cars[0]);
	}
}

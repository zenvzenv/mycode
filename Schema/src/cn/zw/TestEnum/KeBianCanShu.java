package cn.zw.TestEnum;

public class KeBianCanShu {
	public static void main(String[] args) {
		add(10);
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		Integer i=10;//�Զ�װ��
		int m=i;//�Զ�����
	}
	public static void add(int...nums){
		//nums�������Ϊһ������
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		System.out.println(sum);
	}
}

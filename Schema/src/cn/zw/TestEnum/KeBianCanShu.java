package cn.zw.TestEnum;

public class KeBianCanShu {
	public static void main(String[] args) {
		add(10);
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		Integer i=10;//自动装箱
		int m=i;//自动拆箱
	}
	public static void add(int...nums){
		//nums可以理解为一个数组
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		System.out.println(sum);
	}
}

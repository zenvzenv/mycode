package code3��26;
/*
 * ��Ʒ�����ԭ�򣺷����ı����ǹ��ܿ飬����ʵ��ĳ�����ܵ����ļ��ϡ�
 * ������Ʒ�����ʱ����ñ��ַ�����ԭ���ԣ�����һ������ֻ���һ�����ܣ�������������չ��
 */
public class TestMethod {
	public static void test01(int x){//void��ʾ�޷���ֵ
		int oddSum=0;
		int evenSum=0;
		for (int i = 1; i <= x; i++) {
			if(i%2==0){
				oddSum+=i;
			}else{
				evenSum+=i;
			}
		}
		System.out.println("ż����Ϊ:"+oddSum);
		System.out.println("������Ϊ:"+evenSum);
	}
	public static void test02(int x,int y,int z){
		for (int i = 1; i <= x; i++) {
			if(i%y==0){
				System.out.print(i+"\t");
			}
			if(i%(y*z)==0){
				System.out.println();
			}
		}
	}
	//java��ֻ��ֵ���ݣ�û�����ô���
	public static int add(int x,int y){//x,y����ʽ����
		return x+y;//1.����һ��ֵ��2.������������������
	}
	public static void main(String[] args) {
		test01(1000);
		System.out.println();
		test02(100,6,3);
		System.out.println();
		int s=add(24, 42);//ʵ��
		System.out.println(s);
	}
}

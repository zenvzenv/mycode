package code3��25��;

public class TestWhile {
	public static void main(String[] args) {
		int a=1;//��ʼ��
		while (a<=100) {//�����ж�
			System.out.println(a);//ѭ����
			a++;//����
		}
		System.out.println("whileѭ������");
		
		int sum=0;
		int b=1;
		while (b<=100) {//���жϺ�ִ��
			sum+=b;
			b++;
		}
		System.out.println("��Ϊ:"+sum);
		
		int c=0;
		do {//��ִ�к��ж�
			System.out.println(c);
			c++;
		} while (c<=0);
	}
}

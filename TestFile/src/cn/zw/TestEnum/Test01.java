package cn.zw.TestEnum;
/**
 * 
 * <p>Title:Test01</p>
 * <p>Description:����ö��</p>
 * @author zhengwei
 * @date 2017-4-16 ����10:25:02
 */

public class Test01 {
	public enum Color{
		RED,YELLOW,BLACK//ȫ�ǳ���
	}
	public static void main(String[] args) {
		Color c=Color.YELLOW;
		switch (c) {
		case RED:
			c=Color.RED;
			System.out.println("��ɫ");
			break;
		case YELLOW:
			c=Color.YELLOW;
			System.out.println("��ɫ");
			break;
		case BLACK:
			c=Color.BLACK;
			System.out.println("��ɫ");

		default:
			break;
		}
	}
}

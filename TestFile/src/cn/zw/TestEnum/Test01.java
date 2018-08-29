package cn.zw.TestEnum;
/**
 * 
 * <p>Title:Test01</p>
 * <p>Description:测试枚举</p>
 * @author zhengwei
 * @date 2017-4-16 下午10:25:02
 */

public class Test01 {
	public enum Color{
		RED,YELLOW,BLACK//全是常量
	}
	public static void main(String[] args) {
		Color c=Color.YELLOW;
		switch (c) {
		case RED:
			c=Color.RED;
			System.out.println("红色");
			break;
		case YELLOW:
			c=Color.YELLOW;
			System.out.println("黄色");
			break;
		case BLACK:
			c=Color.BLACK;
			System.out.println("黑色");

		default:
			break;
		}
	}
}

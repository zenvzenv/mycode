/*
 * java是强类型语言，所有变量都必须声明变量
 */
package code3月22;

public class TestVariable {
	int t;//实例变量、成员变量、属性
	public static void main(String[] args){
		int a;//局部变量，使用前必须初始化
		a=5;
		int y=a+3;
		int b,c,d;//一行可以声明多个变量
		
		final double PI=3.14;//常量只能被初始化一次
		//PI=3.15;	报错
		/*
		 * 变量命名遵循驼峰原则
		 * 常量用大写字母和下划线
		 * 类名首字母大写和驼峰原则
		 */
	}
}

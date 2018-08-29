package code3月28;

/**
 * 测试static变量
 * @author zhengwei
 * 在类中，用static修饰的成员变量为静态变量，或类变量，类属性
 * 它为该类的公用变量，属于类，被该类的所有实例所共享，在类被载入时被显示初始化。
 * 对于该类的所有对象来说，static成员只有一份。被该类所有对象共享！
 * 可以使用“对象.属性名”来调用，不过，一般嗾使用“类名.类属性”来调用。
 * static变量置于方法区中
 * 静态变量可以直接通过类名直接调用，也可以通过实例对象进行访问
 * 在静态方法里面不能调用非静态的东西
 * 非静态的方法或对象可以调用静态的东西
 */

public class TestStaticStudent1 {
	public static void main(String[] args) {
		TestStaticStudent.ss=13231;
		TestStaticStudent.printSS();
		
		TestStaticStudent s=new TestStaticStudent();
		s.ss=12312;
		s.printSS();
	}
}

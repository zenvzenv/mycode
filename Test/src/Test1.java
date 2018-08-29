
public class Test1 {
	public static void main(String[] args) {
//		String s1 = "Programming";
//        String s2 = new String("Programming");
//        String s3 = "Program" + "ming";
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s1 == s1.intern());
		/*int x=10;
		int y=(x++)+(++x)+(++x);
		int y=x+=x-=x=x-x;
		System.out.println(y);
		if(x>10){
			try {
				throw new Exception("123");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int index=1;
		String[] foo=new String[index];
		System.out.println(foo[0]);*/
		/*int x=1,y;
		y=(x++)+(++x)+(x--)+(--x)+x;
		System.out.println(y);*/
		/*for (int i = 0; i < 3; i++) {
			for (int j = 3; j <= 0; j--) {
				if(i==j){
					continue;
				}
				System.out.println(i+"=i,"+j+"=j");
			}
		}*/
		Test1 test=new Test1();
		test.MyMethod(null);
	}
	public void MyMethod(Object o){
		System.out.println("这是一个对象");
	}
	public void MyMethod(String str){
		System.out.println("这是一个字符串");
	}
}

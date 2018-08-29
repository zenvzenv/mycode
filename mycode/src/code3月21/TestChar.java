package code3月21;

public class TestChar {
	public static void main(String[] args) {
		char c1='a';
		char c2='郑';//unicode编码	0~65535个字符
		char c3='\'';//转义字符
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4='a';
		int i=c4+2;
		char c5=(char) i;
		System.out.println(i);
		System.out.println(c5);
		for (int j = 0; j < 26; j++) {
			char temp=(char) (c4+j);
			System.out.println(temp);
		}
		//java里面的字符串，是定义成String类的
		String str="kldnfldnklfnklsd";
		System.out.println("\n"+str);
		
		boolean b=false;//false
		if(b){
			System.out.println(false);
		}else{
			System.out.println(true);
		}
	}
}

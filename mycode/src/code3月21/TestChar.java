package code3��21;

public class TestChar {
	public static void main(String[] args) {
		char c1='a';
		char c2='֣';//unicode����	0~65535���ַ�
		char c3='\'';//ת���ַ�
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
		//java������ַ������Ƕ����String���
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

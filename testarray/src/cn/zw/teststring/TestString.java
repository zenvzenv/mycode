package cn.zw.teststring;
/**
 * String�ǲ��ɱ��ַ�����
 * ��ϰString���г��õķ���
 * �������鿴Դ��
 * @author zhengwei
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str=new String("abcd");
		String str1=new String("abcd");
		String str2="abcd";
		System.out.println(str.charAt(2));
		System.out.println(str1.equals(str));
		System.out.println(str2.equals(str));//equals�Ƚϵ��������Ƿ����
		System.out.println(str2==str);
		
		String str3="abc";
		String str4="abc";
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);
		
		
		System.out.println(str3.indexOf('c'));
		String s=str3.substring(1);//�и��ַ���
		System.out.println(s);
		
		String str5=str3.replace('c', '*');//�滻�ַ�
		System.out.println(str5);
		
		String str6="abc,efg,higk";//�ַ����и�
		String[] strArry=str6.split(",");
		for (int i = 0; i < strArry.length; i++) {
			System.out.println(strArry[i]);
		}
		
		String str7="  aa  bb  ";
		String str77=str7.trim();//ȥ����β�ո�
		System.out.println(str77);
		
		System.out.println("Abc".equalsIgnoreCase("abc"));
		
		System.out.println("Abcbf".indexOf("b"));
		System.out.println("Abcbf".lastIndexOf("b"));
		System.out.println("Abcbd".startsWith("A"));
		System.out.println("Abcbd".endsWith("d"));
		System.out.println("Abcbd".toLowerCase());//ȫ��Сд
		System.out.println("Abcbd".toUpperCase());//ȫ���д
		
		System.out.println("#############################");
		String gh="a";
		for (int i = 0; i < 10; i++) {
			gh+=i;
		}
		System.out.println(gh);
	}
}

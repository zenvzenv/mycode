package cn.zw.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * <p>Title:Demo01</p>
 * this is a cat and that is a mice and where is the food?
 * ͳ��ÿ�����ʳ��ֵĴ���
 * �洢��Map��
 * key:String
 * value:�Զ�������
 * 
 * ���ּ�˼·
 * 1.�����е�key����������֮�������������Ŷ��ڵ�value
 * 2.��һ�δ������������ֵ���ڶ���֮��ֱ��ʹ���������ֵ
 * 
 * @author zhengwei
 * @date 2017-5-3 ����10:35:38
 */
public class Demo01 {
	public static void main(String[] args) {
		String str="this is a cat and that is a mice and where is the food";
		//�ָ��ַ���
		String[] strArray=str.split(" ");
		//�洢��Map��
		Map<String,Letter> letters=new HashMap<String,Letter>();
		Letter col=null;
				//1.�������������ֵ
		for (String key : strArray) {
			if(null==letters.get(key)){
				col=new Letter();
				col.setCount(1);//��һ�ε�ֵ�����
				letters.put(key, col);
			}else{
				//2.ֱ��ʹ���������ֵ
				col=letters.get(key);
				col.setCount(col.getCount()+1);
			}
		}
		Set<String> keys=letters.keySet();
		for (String key : keys) {
			col=letters.get(key);
			System.out.println("��ĸ��"+key+"������"+col.getCount());
		}
	}
	
	public static void test01(){
		String str="this is a cat and that is a mice and where is the food";
		//�ָ��ַ���
		String[] strArray=str.split(" ");
		
		//�洢��Map��
		Map<String,Letter> letters=new HashMap<String,Letter>();
		/*
		for (String key : strArray) {
			//Ϊ���е�key��������
			if (letters.containsKey(key)) {
				letters.put(key, new Letter());
			}
		}
		for (String key : strArray) {
			//֮����������Ѱ�ö�Ӧ��value
			Letter col=letters.get(key);//ֱ��ʹ������
			col.setCount(col.getCount()+1);
		}
		*/
		for (String key : strArray) {
			if (!letters.containsKey(key)) {
				letters.put(key, new Letter());
			}
			Letter col=letters.get(key);
			col.setCount(col.getCount()+1);
		}
		//���Map��ֵ
		Set<String> keys=letters.keySet();
		for (String key : keys) {
			Letter col=letters.get(key);
			System.out.println("��ĸ��"+key+"������"+col.getCount());
		}
	}
}

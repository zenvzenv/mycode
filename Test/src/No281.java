import java.util.HashMap;
import java.util.Map;


public class No281 {
	public static void main(String[] args) {
		Map map1=new HashMap();
		map1.put("����", "����");
		map1.put("����", "18");
		map1.put("����", "90");
		map1.put("��ַ", "����");
		
		Map map2=new HashMap();
		map2.put("����", "����");
		map2.put("����", "28");
		map2.put("����", "50");
		map2.put("��ַ", "�Ϻ�");
		
		System.out.println(map1.get("����"));
				
	}
}

import java.util.HashMap;
import java.util.Map;


public class No281 {
	public static void main(String[] args) {
		Map map1=new HashMap();
		map1.put("姓名", "张三");
		map1.put("年龄", "18");
		map1.put("体重", "90");
		map1.put("地址", "背景");
		
		Map map2=new HashMap();
		map2.put("姓名", "李四");
		map2.put("年龄", "28");
		map2.put("体重", "50");
		map2.put("地址", "上海");
		
		System.out.println(map1.get("姓名"));
				
	}
}

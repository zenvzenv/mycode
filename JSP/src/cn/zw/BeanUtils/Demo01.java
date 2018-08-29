package cn.zw.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

public class Demo01 {
	@Test
	public void fun1() throws Exception{
		String className="cn.zw.BeanUtils.User";
		Class clazz=Class.forName(className);
		Object bean=clazz.newInstance();
		BeanUtils.setProperty(bean, "name", "郑伟");
		BeanUtils.setProperty(bean, "password", "123456");
		System.out.println(bean.toString());
		
		String name=BeanUtils.getProperty(bean, "name");
		System.out.println(name);
	}
	/**
	 * 把Map封装到bean中
	 * Map的键域bean中的属性名一致
	 * @throws Exception 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void fun2() throws  Exception{
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", "郑伟");
		map.put("password", "123456");
		User user=new User();
		BeanUtils.populate(user, map);
		System.out.println(user.toString());
	}
	@Test
	public void fun3(){
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", "郑伟");
		map.put("password","123456");
		//request.getParamterMap();
		User user=CommonUtils.toBean(map, User.class);
		System.out.println(user.toString());
	}
}

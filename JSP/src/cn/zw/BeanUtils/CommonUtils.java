package cn.zw.BeanUtils;

import java.util.Map;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;

public class CommonUtils {
	/**
	 * 得到32位字符串
	 * @return
	 */
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
	/**
	 * 把map中的数据直接封装到bean中
	 * @param map
	 * @param clazz
	 * @return
	 */
	public static <T> T toBean(Map map,Class<T> clazz){
		try{
			T bean=clazz.newInstance();
			BeanUtils.populate(bean, map);
			return bean;
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}

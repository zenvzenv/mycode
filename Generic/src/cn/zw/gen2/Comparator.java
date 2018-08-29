package cn.zw.gen2;
/**
 * 
 * <p>Title:Comparator</p>
 * <p>Description:接口中泛型字幕只能使用在方法中，不能使用在全局常量中</p>
 * @author zhengwei
 * @date 2017-5-3 上午9:59:31
 * @param <T>
 */
public interface Comparator<T> {
	void compare(T t);
}

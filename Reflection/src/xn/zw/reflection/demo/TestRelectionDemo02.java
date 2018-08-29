package xn.zw.reflection.demo;

import java.lang.reflect.Field;

public class TestRelectionDemo02 {
	public static void main(String[] args) {
		try {
			Class clazz=Class.forName("xn.zw.reflection.demo.Person");
			Person person=(Person) clazz.newInstance();
			Field name=clazz.getDeclaredField("name");
			name.setAccessible(true);
			name.set(person, "֣ΰ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}
}

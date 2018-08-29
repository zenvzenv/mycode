package cn.zw.io.util;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

public class FileUtil {
	/**
	 * �����࣬�ر���
	 * �ɱ����...	ֻ�����β����һλ����������ʽ������һ��
	 * @param io
	 */
	public static void close(Closeable...io){
		for (Closeable closeable : io) {
			if (null!=closeable) {
				try {
					closeable.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static <T extends Closeable> void close1(T...io){
		for (T t : io) {
			if (null!=t) {
				try {
					t.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

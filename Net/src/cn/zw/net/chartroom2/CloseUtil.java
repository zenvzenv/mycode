package cn.zw.net.chartroom2;

import java.io.Closeable;
import java.io.IOException;

public class CloseUtil {
	public static void closeable(Closeable...io){
		for (Closeable closeable : io) {
			if (null==closeable) {
				try {
					closeable.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

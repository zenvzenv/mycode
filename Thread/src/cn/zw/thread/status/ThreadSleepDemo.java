package cn.zw.thread.status;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * <p>Title:ThreadSleepDemo</p>
 * <p>Description:����ʱ</p>
 * @author zhengwei
 * @date 2017-5-11 ����3:30:18
 */
public class ThreadSleepDemo {
	public static void main(String[] args) throws InterruptedException {
		//��ǰʱ�����10��
		Date endTime=new Date(System.currentTimeMillis()+10*1000);
		long end=endTime.getTime();
		while (true) {
			System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
			endTime=new Date(endTime.getTime()-1000);
			Thread.sleep(1000);
			if (end-10000>endTime.getTime()) {
				break;
			}
		}
	}
	public static void test01() throws InterruptedException{
		int num=10;
		while (true) {
			System.out.println(num--);
			Thread.sleep(1000);
			if(num<=0){
				break;
			}
		}
	}
}

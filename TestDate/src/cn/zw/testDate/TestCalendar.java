package cn.zw.testDate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 
 * <p>Title:TestCalendar</p>
 * <p>Description:测试日期类</p>
 * @author zhengwei
 * @date 2017-4-16 下午1:13:34
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar c=new GregorianCalendar();
		//c.set(2017, 4, 16, 13, 14, 31);
		c.set(Calendar.MONTH, 1);//单独定义某个时间域
		c.set(Calendar.DATE, 16);
		
		c.setTime(new Date());
		
		Date dd=c.getTime();
		System.out.println(dd);
		System.out.println(c.get(Calendar.YEAR));
		c.add(Calendar.YEAR, 30);
		System.out.println(c);
	}
}

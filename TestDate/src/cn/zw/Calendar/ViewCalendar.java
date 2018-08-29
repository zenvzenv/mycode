package cn.zw.Calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * <p>Title:ViewCalendar</p>
 * <p>Description:可视化日历程序</p>
 * @author zhengwei
 * @date 2017-4-16 下午1:36:06
 */
public class ViewCalendar {
	public static void main(String[] args) {
		String temp="2017-5-16";
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date=format.parse(temp);
			Calendar c=new GregorianCalendar();
			c.setTime(date);
			c.set(Calendar.DATE, 1);
			int w=c.get(Calendar.DAY_OF_WEEK);
			System.out.println(w);
			int maxDate=c.getActualMaximum(Calendar.DATE);
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			for (int i = 1; i < w; i++) {
				System.out.print("\t");
			}
			for (int i = 1; i <= maxDate; i++) {
				System.out.print(i+"\t");
				if(w==Calendar.SATURDAY){
					System.out.println();
				}
				c.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

package cn.zw.testDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) {
		DateFormat df=new SimpleDateFormat("yyyy年MM月dd日");//格式化字符串
		Date d=new Date(132132113);
		String str=df.format(d);//将时间对象按照格式化字符串转化成字符串
		System.out.println(str);
		System.out.println("#####################");
		String str2="1994-11-02";
		DateFormat df2=new SimpleDateFormat("yyyy-mm-dd");//需要保持一致
		try {
			Date d2=df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package cn.zw.sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class NewsItemApp {
	public static void main(String[] args) {
		List<NewsItem> news=new ArrayList<NewsItem>();
		news.add(new NewsItem("123",100,new Date()));
		news.add(new NewsItem("123",80,new Date(System.currentTimeMillis()-10000)));
		news.add(new NewsItem("123",60,new Date(System.currentTimeMillis()-60*60)));
		System.out.println("≈≈–Ú«∞:"+news);
		Collections.sort(news);
		System.out.println("≈≈–Ú∫Û"+news);
	}
}

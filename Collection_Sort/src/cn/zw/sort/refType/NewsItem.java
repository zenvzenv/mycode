package cn.zw.sort.refType;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * <p>Title:NewsItem</p>
 * <p>Description:������Ŀʵ����</p>
 * @author zhengwei
 * @date 2017-5-5 ����11:24:17
 */
public class NewsItem  implements Comparable<NewsItem>{
	//����
	private String title;
	//�����
	private int hits;
	//ʱ��
	private Date pubTime;
	
	public NewsItem() {
		super();
	}
	
	public NewsItem(String title, int hits, Date pubTime) {
		super();
		this.title = title;
		this.hits = hits;
		this.pubTime = pubTime;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Date getPubTime() {
		return pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	@Override
	//ʱ�併��+���������+���⽵��
	public int compareTo(NewsItem o) {
		int result=0;
		//�Ƚ�ʱ��
		result=-this.pubTime.compareTo(o.pubTime);//����
		if (0==result) {
			//�����
			result=-this.hits-o.hits;
			if (0==result) {//�������ͬ
				//����
				result=-this.title.compareTo(o.title);//����
			}
		}
		
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("����").append(this.title);
		sb.append("ʱ�䣺").append(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(pubTime));
		sb.append(",�����").append(this.hits).append("\n");
		return sb.toString();
	}
	
}

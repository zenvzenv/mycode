package cn.zw.Test01;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * <p>Title:ClassRoom</p>
 * <p>Description:�༶��</p>
 * @author zhengwei
 * @date 2017-5-4 ����10:16:14
 */
public class ClassRoom {
	private String no;
	private List<Student> stus;//ѧ���ױ�
	private double total;//�ܷ�
	public ClassRoom() {
		super();
		stus=new ArrayList<Student>();
	}
	
	public ClassRoom(String no) {
		super();
		this.no = no;
	}

	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public List<Student> getStus() {
		return stus;
	}
	public void setStus(List<Student> stus) {
		this.stus = stus;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}

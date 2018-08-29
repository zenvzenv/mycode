package cn.zw.others.qoe;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

/**
 * 
 * <p>Title:Demo01</p>
 * <p>Description:ʹ�ö���ģ�����д��ҵ��</p>
 * @author zhengwei
 * @date 2017-5-6 ����10:01:47
 */
public class Demo01 {
	public static void main(String[] args) {
		Queue<Request> que=new ArrayDeque<Request>();
		//ģ���Ŷ����
		for(int i=0;i<10;i++){
			final int num=i;
			que.offer(new Request(){
				@Override
				public void depost() {
					System.out.println("��"+num+"���ˣ�����������Ϊ"+(Math.random()*10000));
				}
				
			});
		}
		dealWith(que);
	}
	public static void dealWith(Queue<Request> que){
		Request req=null;
		while(null!=(req=que.poll())){
			req.depost();
		}
	}
}
interface Request{
	void depost();
}
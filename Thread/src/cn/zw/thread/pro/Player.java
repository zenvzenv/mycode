package cn.zw.thread.pro;
/**
 * 
 * <p>Title:Player</p>
 * ������
 * @author zhengwei
 * @date 2017-5-11 ����8:28:39
 */
public class Player implements Runnable{
	private Movie m;
	public Player(Movie m){
		this.m=m;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (0==i%2) {
				m.play("������");
			}else{
				m.play("�Ұ׻�");
			}
		}
	}
}

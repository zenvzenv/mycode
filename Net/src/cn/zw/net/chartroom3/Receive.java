package cn.zw.net.chartroom3;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * ��������
 * <p>Title:Receive</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-12 ����11:29:31
 */
public class Receive implements Runnable{
	//������
	private DataInputStream dis;
	//�����ߵ�״̬
	private boolean isRunning=true;
	public Receive() {
	}
	public Receive(Socket socket){
		try {
			dis=new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			//e.printStackTrace();
			isRunning=false;
			CloseUtil.closeable(dis);
		}
	}
	/**
	 * ��������
	 * @return
	 */
	public String receive(){
		String msg="";
		try {
			msg=dis.readUTF();
		} catch (IOException e) {
			//e.printStackTrace();
			isRunning=false;
			CloseUtil.closeable(dis);
		}
		return msg;
	}
	@Override
	public void run() {
		//�߳���
		while(isRunning){
			System.out.println(receive());
		}
	}

}

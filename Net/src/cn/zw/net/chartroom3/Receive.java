package cn.zw.net.chartroom3;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 接收数据
 * <p>Title:Receive</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-12 下午11:29:31
 */
public class Receive implements Runnable{
	//输入流
	private DataInputStream dis;
	//控制线的状态
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
	 * 接受数据
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
		//线程体
		while(isRunning){
			System.out.println(receive());
		}
	}

}

package cn.zw.net.chartroom3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 发送数据
 * <p>Title:Send</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-12 下午11:28:55
 */
public class Send implements Runnable{
	//控制台的输入流
	private BufferedReader console;
	//管道的输出流
	private DataOutputStream dos;
	//控制线程状态
	private boolean isRunning =true;
	//昵称
	private String name;
	public Send() {
		console=new BufferedReader(new InputStreamReader(System.in));
	}
	public Send(Socket client,String name){
		this();
		try {
			dos=new DataOutputStream(client.getOutputStream());
			this.name=name;
			send(this.name);
		} catch (IOException e) {
			//e.printStackTrace();
			isRunning=false;
			CloseUtil.closeable(dos,console);
		}
	}
	/**
	 * 从控制台接收数据
	 * @return
	 */
	private String getMsgFromConsole(){
		try {
			return console.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	/**
	 * 从控制台接受数据
	 * 之后发送数据
	 */
	public void send(String msg){
		if(null!=msg&&!msg.equals("")){
			try {
				dos.writeUTF(msg);
			} catch (IOException e) {
				//e.printStackTrace();
				isRunning=false;
				CloseUtil.closeable(dos,console);
			}
		}
	}
	@Override
	public void run() {
		while(isRunning){
			send(getMsgFromConsole());
		}
	}
	
}

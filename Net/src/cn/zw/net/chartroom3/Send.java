package cn.zw.net.chartroom3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * ��������
 * <p>Title:Send</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-12 ����11:28:55
 */
public class Send implements Runnable{
	//����̨��������
	private BufferedReader console;
	//�ܵ��������
	private DataOutputStream dos;
	//�����߳�״̬
	private boolean isRunning =true;
	//�ǳ�
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
	 * �ӿ���̨��������
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
	 * �ӿ���̨��������
	 * ֮��������
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

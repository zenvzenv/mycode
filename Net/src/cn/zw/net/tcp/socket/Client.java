package cn.zw.net.tcp.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * <p>Title:Client</p>
 * �ͻ���,����ָ���������˼Ӷ˿ڣ���ʱ��������
 * �������ݼӷ�������
 * @author zhengwei
 * @date 2017-5-12 ����10:42:24
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client=new Socket("127.0.0.1",888);
		//��������
		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		String msg=br.readLine();
		System.out.println(msg);
	}
}

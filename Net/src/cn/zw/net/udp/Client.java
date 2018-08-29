package cn.zw.net.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * 
 * <p>Title:Client</p>
 * 1.客户端：
 * a.创建客户端	DatagramSocket类+指定端口
 * b.准备数据	字节数组	把double--->字符数组	字节数组输出流
 * c.打包	DatagramPacket+服务器地址及端口
 * d.发送
 * f.释放资源
 * @author zhengwei
 * @date 2017-5-12 下午9:54:30
 */
public class Client {
	public static void main(String[] args) throws IOException {
		//创建客户端
		DatagramSocket client=new DatagramSocket(666);
		//准备数据
		double msg=66.6;
		byte[] data=conver(msg);
		//打包
		DatagramPacket packet=new DatagramPacket(data, 0, data.length,new InetSocketAddress("127.0.0.1",888));
		//发送
		client.send(packet);
		//释放资源
		client.close();
	}
	/**
	 * 字节数组，数据源+Data输出流
	 * @param num
	 * @return
	 * @throws IOException 
	 */
	public static byte[] conver(double num) throws IOException{
		byte[] data=null;
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(bos);
		dos.writeDouble(num);
		dos.flush();
		
		//获取数据
		data=bos.toByteArray();
		dos.close();
		
		return data;
	}
}

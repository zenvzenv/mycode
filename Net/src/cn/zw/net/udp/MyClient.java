package cn.zw.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 
 * <p>Title:MyClient</p>
 * UDP:以数据为中心，面向连接，不安全，数据可能丢失，效率高
 * 一、类DatagramSocket	DatagramPacket
 * 1.客户端：
 * a.创建客户端	DatagramSocket类+指定端口
 * b.准备数据	字节数组
 * c.打包	DatagramPacket+服务器地址及端口
 * d.发送
 * f.释放资源
 * 
 * 二、服务器
 * a.创建服务器DatagramSocket类+指定接口
 * b.准备接受容器，字节数组，封装DatagramPacket
 * c.包，接受数据
 * d.分析数据
 * f.释放资源
 * @author zhengwei
 * @date 2017-5-12 下午9:29:13
 */
public class MyClient {
	public static void main(String[] args) throws IOException {
		//1.创建客户端+指定端口
		DatagramSocket client=new DatagramSocket(6666);
		//2.准备数据
		String msg="zw";
		
		byte[] data=msg.getBytes();
		//打包
		DatagramPacket packet=new DatagramPacket(data,data.length,new InetSocketAddress("127.0.0.1",8888));
		//发送数据
		client.send(packet);
		client.close();
	}
}

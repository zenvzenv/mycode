package cn.zw.net.udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 
 * <p>Title:Server</p>
 * 服务端
 * 1.创建服务端+端口
 * 2.准备接受容器
 * 3.封装成包
 * 4.接受数据
 * 5.分析数据	字符数组--->double
 * 6.释放资源
 * @author zhengwei
 * @date 2017-5-12 下午9:54:02
 */
public class Server {
	public static void main(String[] args) throws IOException {
		DatagramSocket server=new DatagramSocket(888);
		byte[] container=new byte[1024];
		DatagramPacket packet=new DatagramPacket(container,container.length);
		server.receive(packet);
		double data=conver(packet.getData());
		int len=packet.getLength();
		System.out.println(data);
		server.close();
	}
	/**
	 * 字节数组+Dat输入流
	 * @param data
	 * @return
	 * @throws IOException 
	 */
	public static double conver(byte[] data) throws IOException{
		DataInputStream dis=new DataInputStream(new ByteArrayInputStream(data));
		double num=dis.readDouble();
		dis.close();
		return num;
	}
}

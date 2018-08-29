package cn.zw.testjdbc;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * <p>Title:TestBLOB</p>
 * <p>Description:测试二进制大文件</p>
 * @author zhengwei
 * @date 2017-5-16 下午7:47:41
 */
public class TestBLOB {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		InputStream is=null;
		OutputStream os=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","root");
//			ps=conn.prepareStatement("insert into t_user (username,headimg) values (?,?)");
//			ps.setString(1, "zw");
//			ps.setBlob(2, new FileInputStream("c:/inco.jpg"));
			System.out.println("开始");
			ps=conn.prepareStatement("select * from t_user where id=?");
			ps.setInt(1, 22007);
			rs=ps.executeQuery();
			while(rs.next()){
				Blob b=rs.getBlob("headimg");
				is=b.getBinaryStream();
				os=new BufferedOutputStream(new FileOutputStream("c:/迅雷下载/b.jpg"));
				int len=0;
				byte[] flush=new byte[1024];
				while(-1!=(len=is.read())){
//					os.write(flush,0,len);
					os.write(len);
					os.flush();
				}
				System.out.println("成功");
			}
			
			
			
			
			
			ps.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

package cn.zw.testjdbc;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * 
 * <p>Title:TestCLOB</p>
 * <p>Description:测试CLOB文本大对象的使用</p>
 * 包含：将字符串，文本内容插入到数据库中的CLOB字段，将CLOB字段值取出来的操作。
 * @author zhengwei
 * @date 2017-5-16 下午4:58:25
 */
public class TestCLOB {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","root");
			//ps=conn.prepareStatement("insert into t_user (username,myinfo) values (?,?)");
			//ps.setString(1, "zw");
			//ps.setClob(2, new FileReader("c:/a.txt"));//将文本里的内容直接存到数据库中
			//ps.setClob(2, new BufferedReader(new InputStreamReader(new ByteArrayInputStream("zw".getBytes()))));
			
			
			ps=conn.prepareStatement("select * from t_user where id=?");
			ps.setInt(1, 22005);
			rs=ps.executeQuery();
			while(rs.next()){
				Clob c=rs.getClob("myinfo");
				Reader r=c.getCharacterStream();
				int temp=0;
				while((temp=r.read())!=-1){
					System.out.print((char)temp);
				}
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}

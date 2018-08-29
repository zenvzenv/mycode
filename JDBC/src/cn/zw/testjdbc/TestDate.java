package cn.zw.testjdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Random;
/**
 * 
 * <p>Title:TestDate</p>
 * <p>Description:测试Data的用法</p>
 * Date表示的是年月日
 * Time表示的是时分秒
 * TimeStamp表示的是年月日时分秒
 * @author zhengwei
 * @date 2017-5-16 下午4:14:51
 */
public class TestDate {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","root");
			for(int i=0;i<1000;i++){
				String sql="insert into t_user (username,pwd,regTime,brithday) values (?,?,?,?)";
				ps=conn.prepareStatement(sql);
				ps.setObject(1, "zw"+i);
				ps.setObject(2, "123");
				
				int rand=new Random().nextInt(1000000000)+1000000000;
				
				Date date=new java.sql.Date(System.currentTimeMillis()-rand);
				ps.setObject(3, date);
				Timestamp ts=new Timestamp(System.currentTimeMillis()-rand+10000000);
				ps.setTimestamp(4, ts);
				ps.execute();
			}
			
			System.out.println("插入成功");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			if (null==ps) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (null==conn) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

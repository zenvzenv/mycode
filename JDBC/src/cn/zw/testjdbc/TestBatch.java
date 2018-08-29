package cn.zw.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * <p>Title:TestBatch</p>
 * <p>Description:测试批量处理sql语句</p>
 * @author zhengwei
 * @date 2017-5-16 上午11:32:35
 */
public class TestBatch {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","root");
			conn.setAutoCommit(false);
			stmt=conn.createStatement();
			for(int i = 0;i<20000;i++){
				stmt.addBatch("insert into t_user (username,pwd,regTime) values ('zw"+i+"','666',now())");
			}
			stmt.executeBatch();
			conn.commit();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

package cn.zw.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 
 * <p>Title:TestPreparStatement</p>
 * <p>Description:测试preparedstatement的用法</p>
 * @author zhengwei
 * @date 2017-5-16 上午10:49:59
 */
public class TestPreparStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc", "root","root");
			String sql="insert into t_user(username,pwd) values (?,?)";//占位符
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "zw1");//参数索引从1开始计算，而不是0
			ps.setString(2, "123");
			System.out.println("插入一行记录");
			ps.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

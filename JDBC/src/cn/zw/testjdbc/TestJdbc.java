package cn.zw.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接(连接对象其实包含了Socket对象，是一个远程的连接，比较耗时！这是Connection对象管理的一个要点)
			//为了提高效率，大都会使用连接池来管理连接对象
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","root");
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

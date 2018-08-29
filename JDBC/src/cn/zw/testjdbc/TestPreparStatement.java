package cn.zw.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 
 * <p>Title:TestPreparStatement</p>
 * <p>Description:����preparedstatement���÷�</p>
 * @author zhengwei
 * @date 2017-5-16 ����10:49:59
 */
public class TestPreparStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc", "root","root");
			String sql="insert into t_user(username,pwd) values (?,?)";//ռλ��
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "zw1");//����������1��ʼ���㣬������0
			ps.setString(2, "123");
			System.out.println("����һ�м�¼");
			ps.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

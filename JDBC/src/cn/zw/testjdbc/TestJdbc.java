package cn.zw.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//��������(���Ӷ�����ʵ������Socket������һ��Զ�̵����ӣ��ȽϺ�ʱ������Connection��������һ��Ҫ��)
			//Ϊ�����Ч�ʣ��󶼻�ʹ�����ӳ����������Ӷ���
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

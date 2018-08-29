package cn.zw.testjdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 
 * <p>Title:JDBCUtil</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-16 ����8:30:22
 */
public class JDBCUtil {
	static Properties pros=null;//���԰������Ǵ�����Դ�ļ��е���Ϣ
	
	static{//����JDBCUtil���ʱ�����
		pros=new Properties();
		try {
			//��ȡsrc�µ��ļ�
			pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	/**
	 * �������ݿ�
	 * @return
	 */
	public static Connection getMySQL(){
		try {
			Class.forName(pros.getProperty("mysqlDriver"));
			return DriverManager.getConnection(pros.getProperty("mysqlUrl"),pros.getProperty("mysqlUser"),pros.getProperty("mysqlPwd"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * �ر�������
	 * @param rs
	 * @param ps
	 * @param conn
	 */
	public static void close(ResultSet rs,PreparedStatement ps,Connection conn){
		if (null==rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (null==ps) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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

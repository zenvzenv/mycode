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
 * @date 2017-5-16 下午8:30:22
 */
public class JDBCUtil {
	static Properties pros=null;//可以帮助我们处理资源文件中的信息
	
	static{//加载JDBCUtil类的时候调用
		pros=new Properties();
		try {
			//读取src下的文件
			pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	/**
	 * 连接数据库
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
	 * 关闭数据流
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

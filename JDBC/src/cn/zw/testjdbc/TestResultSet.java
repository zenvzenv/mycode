package cn.zw.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * <p>Title:TestResultSet</p>
 * <p>Description:����resultset���÷�</p>
 * @author zhengwei
 * @date 2017-5-16 ����10:54:06
 */
public class TestResultSet {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","root");
			String sql="select id,username,pwd from t_user where id>?";
			ps=conn.prepareStatement(sql);
			ps.setObject(1, 2);//����id����2��
			rs=ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getString(3));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//������try--catch�ֿ�д
			if (null==rs) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}if(null==ps){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}if(null==conn){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

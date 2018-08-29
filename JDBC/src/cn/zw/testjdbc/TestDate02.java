package cn.zw.testjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDate02 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","root");
			String sql="select * from t_user where regTime>? and regTime<? order by regTime";
			ps=conn.prepareStatement(sql);
			java.sql.Date start=new java.sql.Date(str2Date("2017-4-16 16:44:30"));
			java.sql.Date end=new java.sql.Date(str2Date("2017-5-16 16:44:30"));
			ps.setObject(1, start);
			ps.setObject(2, end);
			rs=ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id")+"--"+rs.getString("username")+"--"+rs.getDate("regtime"));
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static long str2Date(String dataSrc){
		DateFormat fromat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			return fromat.parse(dataSrc).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
			return 0;
		}
	}
}

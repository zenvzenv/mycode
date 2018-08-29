package cn.zw.AddServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取参数
		String s1=request.getParameter("num1");
		String s2=request.getParameter("num2");
		//把字符串转成整形
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		//相加
		int sum=num1+num2;
		//存到request域中
		request.setAttribute("result", sum);
		//转发到JSP页面
		request.getRequestDispatcher("/add/result.jsp").forward(request, response);
	}

}

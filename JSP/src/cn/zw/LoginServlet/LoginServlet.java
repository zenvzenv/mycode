package cn.zw.LoginServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//验证验证码是否正确
		String verifycode=request.getParameter("verifycode");
		String session_verifycode=(String)request.getSession().getAttribute("session_verifycode");
		if(!verifycode.equalsIgnoreCase(session_verifycode)){
			request.setAttribute("msg", "验证码错误");
			request.getRequestDispatcher("/login/login.jsp");
			return;
		}
		
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if (username.equalsIgnoreCase("zw")&&password.equalsIgnoreCase("zw")) {
			HttpSession session=request.getSession();
			session.setAttribute("username", "zw");
			session.setAttribute("password", "zw");
			
			Cookie cookie=new Cookie("username",username);
			cookie.setMaxAge(60*60*24);
			response.addCookie(cookie);
			
			response.sendRedirect("/JSP/login/succ1.jsp");//重定向需要加上项目名
		}else{
			request.setAttribute("msg", "用户名或密码错误！");
			request.getRequestDispatcher("/login/login.jsp").forward(request, response);//转发不需要加上项目名
			
		}
	}
}

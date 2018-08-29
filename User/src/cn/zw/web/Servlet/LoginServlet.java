package cn.zw.web.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zw.Service.UesrService;
/**
 * UserServlet≤„
 * @author zhengwei
 *
 */
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//«Î«Û±‡¬Î
		response.setContentType("text/html;charset=utf-8");//œÏ”¶±‡¬Î
		
		//“¿¿µUserService
		UesrService userService = new UesrService();
	}

}

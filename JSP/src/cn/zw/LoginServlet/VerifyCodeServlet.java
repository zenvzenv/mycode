package cn.zw.LoginServlet;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VerifyCodeServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		VerifyCode vc=new VerifyCode();
		BufferedImage image=vc.getImage();
		String text=vc.getText();
		HttpSession session=request.getSession();
		session.setAttribute("session_verifycode", text);
		VerifyCode.output(image, response.getOutputStream());
	}

}

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		//请求设置中文
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println("name:" + name);
		System.out.println("password:" + password);
		
		String html = null;
		if("admin".equals(name) && "123".equals(password))
			html = "<div style='color:green'>登陆成功</div>";
		else
			html = "<div style='color:red'>登陆失败</div>";
		//服务器响应设置中文
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter pw = response.getWriter();
		pw.println(html);
	}
}

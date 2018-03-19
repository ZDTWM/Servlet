import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		//请求设置中文
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println("name:" + name);
		System.out.println("password:" + password);
		
		//浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有)
		System.out.println("浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有): " + request.getRequestURL());
		
		//浏览器发出请求的资源名部分，去掉了协议和主机名:
		System.out.println("浏览器发出请求的资源名部分，去掉了协议和主机名: " + request.getRequestURI());
		
		//请求行中的参数部分:
		System.out.println("请求行中的参数部分: " + request.getQueryString());
		
		//浏览器所处于的客户机的IP地址: 
		System.out.println("浏览器所处于的客户机的IP地址: " + request.getRemoteAddr());
		
		//浏览器所处于的客户机的主机名:
		System.out.println("浏览器所处于的客户机的主机名: " + request.getRemoteHost());
		
		//浏览器所处于的客户机使用的网络端口: 
		System.out.println("浏览器所处于的客户机使用的网络端口: " + request.getRemotePort());
		
		//服务器的IP地址: 
		System.out.println("服务器的IP地址: " + request.getLocalAddr());
		
		//服务器的主机名: 
		System.out.println("服务器的主机名: " + request.getLocalName());
		
		//得到客户机请求方式:
		System.out.println("得到客户机请求方式: " + request.getMethod());
		
		String html = "null";
		if("admin".equals(name) && "123".equals(password))
			 html = "<div style='color:green'>登录成功</div>";
		else
			 html = "<div style='color:red'>登录失败</div>";
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println(html);
		
	}
}

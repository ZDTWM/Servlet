import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println("name:" + name);
		System.out.println("password:" + password);
		
		String html = null;
		if("admin".equals(name) && "123".equals(password))
			html = "<div style='color:green'>success</div>";
		else
			html = "<div style='color:red'>success</div>";
		
		PrintWriter pw = response.getWriter();
		pw.println(html);
	}
}

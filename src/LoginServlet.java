import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		//������������
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println("name:" + name);
		System.out.println("password:" + password);
		
		//�������������ʱ������URL������Э�� ������ �˿�(�����)
		System.out.println("�������������ʱ������URL������Э�� ������ �˿�(�����): " + request.getRequestURL());
		
		//����������������Դ�����֣�ȥ����Э���������:
		System.out.println("����������������Դ�����֣�ȥ����Э���������: " + request.getRequestURI());
		
		//�������еĲ�������:
		System.out.println("�������еĲ�������: " + request.getQueryString());
		
		//����������ڵĿͻ�����IP��ַ: 
		System.out.println("����������ڵĿͻ�����IP��ַ: " + request.getRemoteAddr());
		
		//����������ڵĿͻ�����������:
		System.out.println("����������ڵĿͻ�����������: " + request.getRemoteHost());
		
		//����������ڵĿͻ���ʹ�õ�����˿�: 
		System.out.println("����������ڵĿͻ���ʹ�õ�����˿�: " + request.getRemotePort());
		
		//��������IP��ַ: 
		System.out.println("��������IP��ַ: " + request.getLocalAddr());
		
		//��������������: 
		System.out.println("��������������: " + request.getLocalName());
		
		//�õ��ͻ�������ʽ:
		System.out.println("�õ��ͻ�������ʽ: " + request.getMethod());
		
		String html = "null";
		if("admin".equals(name) && "123".equals(password))
			 html = "<div style='color:green'>��¼�ɹ�</div>";
		else
			 html = "<div style='color:red'>��¼ʧ��</div>";
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println(html);
		
	}
}

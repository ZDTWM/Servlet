import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistServlet extends HttpServlet{
	protected void service(HttpServletRequest request, HttpServletResponse response){
		//��ȡ��ֵ����
		System.out.println("��ȡ��ֵ����name:" + request.getParameter("name"));
		
		//��ȡ���ж�ֵ�Ĳ���hobbies
		String[] hobbies = request.getParameterValues("hobbies");
		System.out.println("��ȡ���ж�ֵ�Ĳ���hobbies: " + Arrays.asList(hobbies));
		
		//ͨ�� getParameterMap �������еĲ���
		System.out.println("ͨ�� getParameterMap �������еĲ����� ");
		Map<String,String[]> parameters = request.getParameterMap();
		
		Set<String> paramNames = parameters.keySet();
		for(String param : paramNames){
			String[] value = parameters.get(param);
			System.out.println(param + ":" + Arrays.asList(value));
		}
		
	}
}

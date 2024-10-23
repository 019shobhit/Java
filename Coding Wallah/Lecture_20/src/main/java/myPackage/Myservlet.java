package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		
		double a = Double.parseDouble(str1);
		double b = Double.parseDouble(str2);
		double ans;
		
		if(str3.equals("1")) ans= a+b+0f;
		else if(str3.equals("2")) ans=a-b-0f;
		else if(str3.equals("3")) ans=a*b*1f;
		else if(str3.equals("4")) ans=a/b*1f;
		else ans =0;
//		response.getWriter().append("Answer is : " + ans);
		response.sendRedirect("NewFile.jsp?ans="+ans);
//		response.sendRedirect("result.jsp?ans="+ans+"&joke="+randomJoke);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

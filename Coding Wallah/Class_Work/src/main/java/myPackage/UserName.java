package myPackage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/UserName")
public class UserName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public UserName() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("n1");
		String num2 = request.getParameter("n2");
		int x = Integer.parseInt(num1);
		int y = Integer.parseInt(num2);
		int sum = x+y;

//		response.getWriter().append("<h1> The sum is: "+sum+"</h1> <br> <form action='newServlet' method='get'> <button type=\"submit\">Add</button> </form>");
		
//		for calling outside url parameter
//		response.sendRedirect("newServlet?Data="+sum);
		
//		for inside calling url parameter
//		RequestDispatcher rd = request.getRequestDispatcher("newServlet");
//		rd.forward(request, response);
		
//		request attribute
		request.setAttribute("Data1", x);
		request.setAttribute("Data1", y);
		response.sendRedirect("newServlet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		String str = request.getParameter("name");
		response.getWriter().append("<h1>Hello, "+str+" How are you? </h1>");
	}

}

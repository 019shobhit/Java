package myPackage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Hello servlet 1 is calling "+str1+" "+str2);
		
		String str1=request.getParameter("u");
		String str2=request.getParameter("p");
//		response.sendRedirect("servlet2?d1="+str1+"&d2="+str2);
		
		
//		RequestDispatcher rd = request.getRequestDispatcher("servlet2");
//		rd.forward(request, response);
		
		HttpSession session = request.getSession();
		session.setAttribute("a1", str1);
		request.setAttribute("a2",str2);
		request.getRequestDispatcher("servlet2").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1=request.getParameter("u");
		String str2=request.getParameter("p");
		HttpSession session = request.getSession();
		session.setAttribute("a1", str1);
		session.setAttribute("a2",str2);
		request.getRequestDispatcher("servlet2").forward(request, response);	}

}

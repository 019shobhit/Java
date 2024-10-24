package MyPackage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Servlet 1 ");
		String str1 = request.getParameter("username");
		String str2 = request.getParameter("password");

//		ways to create connect two Servlet
//		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
//		rd.forward(request, response);
		
		// URL Parameter
		response.sendRedirect("Servlet2?d1="+str1+"&d2="+str2);
		
//		Request Attribute
		request.setAttribute("d1", str1);
		request.setAttribute("d2", str2);
		
//		Session Attribute
//		HttpSession session = request.getSession();
//		session.setAttribute("d1", str1);
//		session.setAttribute("d2", str2);
		
		request.getRequestDispatcher("Servlet2").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String str1 = request.getParameter("username");
		String str2 = request.getParameter("password");
		
//		Request Attribute
		request.setAttribute("d1", str1);
		request.setAttribute("d2", str2);
		
//		Session Attribute
//		HttpSession session = request.getSession();
//		session.setAttribute("d1", str1);
//		session.setAttribute("d2", str2);
		
		request.getRequestDispatcher("Servlet2").forward(request, response);
	}

}

package myPackage;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/newServlet")
public class newServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public newServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		1.
//		String n = request.getParameter("Data");

		
		//		int num1 = (Integer) request.getAttribute("Data1");
//		int num2 = (Integer) request.getAttribute("Data2");
//		int sum = num1*num2;
//		int sum = 12;

		response.getWriter().append("Servlet 2 is calling: <br> <h2> the square is :   </h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package atj;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Konwerter
 */
@WebServlet(description = "Mój konwerter", urlPatterns = { "/Konwerter" })
public class Konwerter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
Double value1=Double.parseDouble(request.getParameter("value1"));
		
		switch(request.getParameter("oper"))
		{
		case "CF":
			//F = (°C × 1.8) + 32
			response.getWriter().println("Wynik: "+((value1*1.8)+32));
			break;
		case "FC":
			// 	°C = (°F − 32) /1.8
			response.getWriter().println("Wynik: "+((value1-32)/1.8));
			break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

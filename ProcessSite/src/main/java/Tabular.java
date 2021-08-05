

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tabular
 */
@WebServlet("/Tabular")
public class Tabular extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tabular() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter(); 
		String login=request.getParameter("uname");
//		String pd=request.getParameter("passwd");
//		out.println("<html><body><h1>Welcome "+ login +"!"); 
//		out.println("<form action='Serv2'>");
//		out.println("<input type='hidden' name='login' value="+login+">");
////		out.println("<input type='hidden' name='passwd' value="+pd+">");
//		out.println("<br><input type='submit' value='Continue to next..'> </form>");
		out.println("<html><body><h1>Welcome "+ login +"!");
		out.println("<table style=\"width:100%\">\n"
				+ "  <tr>\n"
				+ "    <th>Firstname</th>\n"
				+ "    <th>Lastname</th>\n"
//				+ "    <th>Age</th>\n"
				+ "  </tr>\n"
				+ "  <tr>\n"
				+ "    <td>" + login + "</td>\n"
//				+ "    <td>Smith</td>\n"
//				+ "    <td>50</td>\n"
				+ "  </tr>\n"
//				+ "  <tr>\n"
//				+ "    <td>Eve</td>\n"
//				+ "    <td>Jackson</td>\n"
//				+ "    <td>94</td>\n"
//				+ "  </tr>\n"
				+ "</table>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

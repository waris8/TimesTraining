package Package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static int count;
    static int count1;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String x=Integer.toString(request.getServerPort());
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath()).append(x).append(request.getServerName());
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		java.util.Date currDate=new java.util.Date(); 
//		java.io.PrintWriter out = response.getWriter(); 
//		response.setContentType("text/html"); 
//		out.println("<html><head><title>Greetings Servlet </title></head>"); 
//		out.println("<body>Hello "+currDate+"</body></html>"); 
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		count++;
		out.println("<html>");	
		out.println("<head><title>BasicServlet</title></head>");
		out.println("<body>");
		out.println("You are user number   " + String.valueOf(count)+ "  visting our web site"+ "\n");
//		out.println("</body></html>");
		
		if(count%10==0) {
			count1++;
			out.println("\n");
			out.println("new fresh look");
			out.println("new look no. " + count1);
			out.println("</body></html>");
		}
		else {
			out.println("</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		if ((fname != null && fname.trim().length() != 0) && (lname != null && lname.trim().length() != 0))
			request.getRequestDispatcher("Success").forward(request, response);
		else {
			request.setAttribute("errorattr", "first name or last name not entered");
			request.getRequestDispatcher("Error").include(request, response);
			// getServletContext().getNamedDispatcher("error").include( request, response);
			request.getRequestDispatcher("index.html").include(request, response);
		}
		response.getWriter().append("<h1> Register Page</h1>");
	}

}

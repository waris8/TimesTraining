

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessForm
 */
@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		java.io.PrintWriter out=response.getWriter(); 
		out.println("<html><body>"); 
		String name=request.getParameter("uname"); 
		String loan=request.getParameter("uamount"); 
		String random =  "7685";
		String date = "28062021";
		String colors[]= {"Red", "Green", "Blue", "Black"};//request.getParameterValues("color"); 
		for(int i=0;i<colors.length;i++) 
		out.println("<font color='"+ colors[i]+"'>Hello "+name+"</font><br>" );
		out.println("<html><body><h1>Welcome "+ name +"!"); 
		out.println("<form action='Tabular'>");
		out.println("<input type='hidden' name='login' value="+name+">");
//		out.println("<input type='hidden' name='passwd' value="+pd+">");
		out.println("<br><input type='submit' value='Continue to next..'> </form>");
		out.println("</body></html>"); 
	}

}

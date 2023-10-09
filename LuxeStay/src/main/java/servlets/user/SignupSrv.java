package servlets.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.user.User;
import service.user.UserServiceImpl;

/**
 * Servlet implementation class AddUserSrv

@WebServlet("/signup") */
public class SignupSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String rePassword = request.getParameter("re-password");
		String role = request.getParameter("role");
		
		UserServiceImpl usrimp = new UserServiceImpl();
		
		
		// Check if passwords are matching
		if (usrimp.checkUserExist(email)) {
			

			response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    out.println("<script type='text/javascript'>");
		    out.println("alert('User with this email already exists.');");
		    out.println("window.location = 'login.jsp';"); // Redirect to login.jsp
		    out.println("</script>");
		
			
			
			
		}
		else {
			
			User user = new User(fname, lname, email, password,role);
			
			UserServiceImpl usimp = new UserServiceImpl();
			usimp.addUser(user);
			
			response.sendRedirect("login");
		}
		
	}

}

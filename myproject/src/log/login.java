package log;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid=request.getParameter("userId");
		String pass=request.getParameter("password");
		logindao obj=new logindao();
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		
		if(obj.check(userid, pass)){
			HttpSession session=request.getSession();
			session.setAttribute("userid", userid);
			response.sendRedirect("home.jsp");
		}
		
	}

}

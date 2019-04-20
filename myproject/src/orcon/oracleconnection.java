package orcon;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class oracleconnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public oracleconnection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			PreparedStatement st = con.prepareStatement("insert into registrationdetails values(?,?,?,?,?,?,?,?,?)"); 
			
	            st.setString(1,request.getParameter("firstname"));
	            st.setString(2,request.getParameter("lastname"));
	            st.setString(3,request.getParameter("dob"));
	            st.setString(4,request.getParameter("gender"));
	            st.setString(5,request.getParameter("country"));
	            st.setString(6,request.getParameter("Region"));
	            st.setString(7,request.getParameter("emailid"));
	            st.setString(8,request.getParameter("mobileno"));
	            st.setString(9,request.getParameter("setpassword"));
	    		
	            st.executeUpdate();
	            st.close(); 
	            con.close();
			out.println("Registered Successfully");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

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

@WebServlet("/proces")
public class orac extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public orac() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr")){
			Class.forName("oracle.jdbc.Driver.OracleDriver");
			System.out.println("Stye");
			PreparedStatement st = con.prepareStatement("insert into rooms values(?,?,?,?,?,?,?)"); 
			
	            st.setString(1,request.getParameter("fname"));
	            st.setString(2,request.getParameter("email"));
	            st.setString(3,request.getParameter("mobile"));
	            st.setString(4,request.getParameter("noguest"));
	            st.setString(5,request.getParameter("checkin"));
	            st.setString(6,request.getParameter("checkout"));
	            st.setString(7,request.getParameter("req"));
	    		
	            st.executeUpdate();
	            st.close(); 
	            con.close();
			out.println("Registered Successfully");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

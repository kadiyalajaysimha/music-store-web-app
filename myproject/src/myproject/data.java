package myproject;

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

@WebServlet("/data")
public class data extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try (Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr")){
			System.out.println("Sueesss");
			
			PreparedStatement ps=con.prepareStatement("insert into jobs values(?,?,?,?)");
			ps.setString(1,req.getParameter("id"));
			ps.setString(2,req.getParameter("name"));
			ps.setString(3,req.getParameter("min"));
			ps.setString(4,req.getParameter("max"));
			int count=ps.executeUpdate();
			
			PrintWriter pw=resp.getWriter();
			resp.setContentType("text/html");
			if(count==1)
			{
				pw.println("<html><body><b>Suceess</b></body></html>");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

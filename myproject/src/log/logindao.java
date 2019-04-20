package log;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;


public class logindao {
		String sql="select * from registrationdetails where emailid=? and setpassword=?";
		public boolean check(String userid,String pass){
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
					PreparedStatement pt=con.prepareStatement(sql);
					pt.setString(1, userid);
					pt.setString(2,pass);
					ResultSet rs=pt.executeQuery();
					if(rs.next()){
						return true;
					}
				}
				
				
				
				catch(Exception e){
					e.printStackTrace();
				}
				return false;
			}
			}


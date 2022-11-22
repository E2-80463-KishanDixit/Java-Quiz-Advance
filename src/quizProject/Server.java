package quizProject;

import java.sql.*;
import java.util.Scanner;
public class Server {

		Connection Con;
		String name,email,phone,id;
		
		public void creat()
		{
			String username = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/batch5";
			try {
				Class.forName("Con.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Con=DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Connected");
			
		}
		
//		public void writeData()
//		{
//			Scanner s = new Scanner(System.in);
//			System.out.println("Enter id,name,email,phone:");
//			id = s.next();
//			name = s.next();
//			email = s.next();
//			phone = s.next();
//			
//			PreparedStatement ps = null;
//			String query = "Insert into users (id,name,email,phone) values(?,?,?)";
//			try {
//				ps=Con.prepareStatement(query);
//				ps.setString(1, id);
//				ps.setString(2, name);
//				ps.setString(3, email);
//				ps.setString(4, phone);
//				
//				if(ps.execute()) {
//					
//					System.out.println("data stored");
//				}
//				else
//				{
//					System.out.println("Error");
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		
		
		public static void main(String args[])
		{
		Server s = new Server();
			s.creat();
//			s.writeData();
			
		}
		
	}



package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=null;
		con=DriverManager.getConnection("jdbc:mySQL://localhost:3306/Student", "root", "");
		if(con!=null)//CONNECTION CHECKING
		{
		System.out.println("Connection Successful");
		}
		else
		{
		System.out.println("check your connection");
		}
		Scanner s=new Scanner(System.in);
		System.out.println("1. insert");
		System.out.println("2. Display");
		System.out.println("Enter the operation");
		int n=s.nextInt();
		switch(n) {
		case 1:
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the reg no");
		int regno=s.nextInt();
		System.out.println("Enter the Department");
		String dept=s.next();
		System.out.println("Enter the year");
		int year=s.nextInt();
		System.out.println("Enter the address");
		String add=s.next();
		
		PreparedStatement st=con.prepareStatement("insert into"+" student(NAME,REGNO,DEPARTMENT,YEAR,ADDRESS) values(?,?,?,?,?);");
		st.setString(1,name);
		st.setInt(2,regno);
		st.setString(3,dept);
		st.setInt(4,year);
		st.setString(5,add);
		st.executeUpdate();
		System.out.println("Insertion successfull");
		//closing connection
		con.close();
		break;
		case  2:
			Statement s1=con.createStatement();
			ResultSet r=s1.executeQuery("Select*from student");
			while(r.next())
			{
			System.out.println(r.getString(1)+" "+r.getInt(2)+" "+r.getString(3)+" "+r.getInt(4)+" "+r.getString(5));	
			}
			break;
			}
		}

		}
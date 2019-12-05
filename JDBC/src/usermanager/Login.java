package usermanager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import crude.ConnectionManager;

public class Login {
	ConnectionManager con=new ConnectionManager();
	Scanner s=new Scanner(System.in);
	int t;
	public void loginData() throws ClassNotFoundException, SQLException
	{
     System.out.println("1)Admin login\n2)User login");
     switch(t)
     {
     case 1:
    	 System.out.println("Enter the admin name");
    	 String adn=s.next();
    	 System.out.println("Enter the admin password");
    	 String aspw=s.next();
    	 Statement st=con.getConnection().createStatement();//callable statemnt to get some data
    	 ResultSet rs=st.executeQuery("select * from admin");//result set
    	 if(adn.equals(rs.getString(2))&&aspw.contentEquals(rs.getString(3)))
    			 {
    		     System.out.println("Welcome to admin");
    			 }
    	 else {
    		     System.out.println("admin login failed"); 
    	      }
    	 break;
     case 2:
    	 System.out.println("Enter the user name");
    	 String un1=s.next();
    	 System.out.println("Enter the user password");
    	 String up1=s.next();
    	 Statement st1=con.getConnection().createStatement();//callable statemnt to get some data
    	 ResultSet rs1=st1.executeQuery("select * from userinfo");//result set
    	 if(un1.equals(rs1.getString(2))&&up1.contentEquals(rs1.getString(3)))
		 {
	     System.out.println("Welcome to admin");
		 }
 else {
	     System.out.println("admin login failed"); 
      }
 break;
     }
		
}
}
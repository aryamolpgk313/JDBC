package usermanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionmanager {
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=null;
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanager","root","");
	if(con!=null)//connection checking
	{
	return con;
	}
	else
	{
	return null;
	}
	}

}

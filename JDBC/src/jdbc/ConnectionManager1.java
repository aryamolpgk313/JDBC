package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectionManager1 {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
// TODO Auto-generated method stub
Class.forName("com.mysql.jdbc.Driver");
Connection con=null;
con=DriverManager.getConnection("jdbc:mySQL://localhost:3306/Application", "root", "");
if(con!=null)//CONNECTION CHECKING
{
System.out.printf("Connection Successful");
}
else
{
System.out.printf("check your connection");
}
con.close();
}


}





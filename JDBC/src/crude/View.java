package crude;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View
{
ConnectionManager con=new ConnectionManager();
public void viewData() throws ClassNotFoundException, SQLException
{
Statement st=con.getConnection().createStatement();//callable statemnt to get some data
ResultSet rs=st.executeQuery("select * from login");//result set
while(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));//print value
}
}
}


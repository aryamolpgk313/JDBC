package crude;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Delete
{
ConnectionManager con=new ConnectionManager();
Scanner s=new Scanner(System.in);
public void deleteData() throws SQLException, ClassNotFoundException {
System.out.println("Enter the id to be deleted");
int n=s.nextInt();
PreparedStatement ps=(PreparedStatement)con.getConnection().prepareStatement("delete from login where id = ?");//delete statement
System.out.println("deleted successfully");
ps.setInt(1,n);
ps.executeUpdate();
con.getConnection().close();
}
}

	

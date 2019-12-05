package crude;

import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Update {

		ConnectionManager con=new ConnectionManager();
		public void updateData() throws ClassNotFoundException, SQLException
		{	
			Scanner s=new Scanner(System.in);
			System.out.println("enter the id to be updated");
			int uid=s.nextInt();
			System.out.println("enter the id");
			int id1=s.nextInt();
			System.out.println("enter the username");
			String user1=s.next();
			System.out.println("enter the password");
			String pwd1=s.next();
			PreparedStatement ps=(PreparedStatement)con.getConnection().prepareStatement("update login set id=?,username=?,password=? where id=?");
			ps.setInt(1,id1);
			ps.setString(2,user1);
			ps.setString(3,pwd1);
			ps.setInt(4,uid);
			ps.executeUpdate();
			con.getConnection().close();
			System.out.println("updated successfully");
			
		}
		
	}



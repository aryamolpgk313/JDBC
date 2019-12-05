package crude;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysql.jdbc.PreparedStatement;
public class Insert {
ConnectionManager con=new ConnectionManager();
public void insertData() throws ClassNotFoundException, SQLException
{
	Pattern use=Pattern.compile("(^[A-Z]+[a-z]*)");//username
	Pattern pswd=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");//password
Scanner s=new Scanner(System.in);
System.out.println("enter the id");
int id=s.nextInt();
System.out.println("enter the username");
String user=s.next();
Matcher nm=use.matcher(user);
System.out.println("enter the password");
String pwd=s.next();
Matcher pd=pswd.matcher(pwd);
if(nm.matches()&&pd.matches())
{
PreparedStatement ps=(PreparedStatement)con.getConnection().prepareStatement("insert into login(id,username,password)values(?,?,?)");//insert statement
System.out.println("successfull");
ps.setInt(1,id);
ps.setString(2,user);
ps.setString(3,pwd);
ps.executeUpdate();
con.getConnection().close();
System.out.println("successfull");
}
else
{
	if(!nm.matches())
		System.out.println("invalid user name");
		if(!pd.matches())
		System.out.println("invalid password");
	
}

}

}

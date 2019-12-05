package usermanager;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysql.jdbc.PreparedStatement;

import crude.ConnectionManager;

public class Insert1 {
	ConnectionManager con=new ConnectionManager();
	Scanner s=new Scanner(System.in);
	int ch;
	public void insertData() throws ClassNotFoundException, SQLException
	{
		Pattern user=Pattern.compile("(^[A-Z]+[a-z]*)");//Username
		Pattern pswd=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");//password
		System.out.println("1)Admin\n2)Student");
		System.out.println("enter the choice");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the admin id");
			int id1=s.nextInt();
			System.out.println("Enter the admin name");
			String admin=s.next();
			Matcher ad=user.matcher(admin);
			System.out.println("Enter the admin password");
		    String adp=s.next();
		    Matcher pd=pswd.matcher(adp);
		    if(ad.matches()&&pd.matches())
		    {
		    PreparedStatement ps=(PreparedStatement)con.getConnection().prepareStatement("insert into admin(id,username,password)values(?,?,?)");//insert statement
		    ps.setInt(1,id1);
		    ps.setString(2,admin);
		    ps.setString(3,adp);
		    ps.executeUpdate();
		    con.getConnection().close();
		    }
		    else
		    {
		    	if(!ad.matches())
		    		System.out.println("invalid admin name");
		    		if(!pd.matches())
		    		System.out.println("invalid admin password");
		    	
		    }
		    
		case 2:
			System.out.println("Enter the user id");
			int id2=s.nextInt();
			System.out.println("Enter the user name");
			String usnme=s.next();
			Matcher un=user.matcher(usnme);
			System.out.println("Enter the user password");
		    String pwd=s.next();
		    Matcher up=pswd.matcher(pwd);
		    if(un.matches()&&up.matches())
		    {
		    PreparedStatement pt=(PreparedStatement)con.getConnection().prepareStatement("insert into userinfo(id,username,password)values(?,?,?)");//insert statement
		    pt.setInt(1,id2);
		    pt.setString(2,usnme);
		    pt.setString(3,pwd);
		    pt.executeUpdate();
		    con.getConnection().close();
		    }
		    else
		    {
		    	if(!un.matches())
		    		System.out.println("invalid user name");
		    		if(!up.matches())
		    		System.out.println("invalid password");
		    	
		    }
		}
}
}
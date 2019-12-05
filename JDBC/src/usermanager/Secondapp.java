package usermanager;

import java.sql.SQLException;
import java.util.Scanner;

import crude.Insert;

public class Secondapp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		int n;
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("1)insert\n2)Login\n3)Exit");
			System.out.println("enter the choice");
			n=s.nextInt();
			switch(n)
			{
			case 1:
				Insert1 insert=new Insert1();
				insert.insertData();
				break;
			case 2:
		        Login login=new Login();
			    login.loginData();
			    break;
			case 3:
				System.exit(0);
			    
			}
			
		}while(n!=0);
		}
	}



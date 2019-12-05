package crude;

import java.sql.SQLException;
import java.util.Scanner;

public class Firstapp {

public static void main(String[] args) throws SQLException, ClassNotFoundException
{
	Firstapp Case= new Firstapp();
    Case.choice();

}
public void choice() throws SQLException, ClassNotFoundException
{
Scanner s=new Scanner(System.in);
int ch;
do {
System.out.println("1)insert\n2)view\n3)update\n4)delete\n5)Exit");
System.out.println("enter the choice");
ch=s.nextInt();
switch(ch)
{
case 1:
Insert insert=new Insert();
insert.insertData();

case 2:
View view=new View();
view.viewData();
break;
case 3:
Update update=new Update();
update.updateData();
break;
case 4:
Delete delete=new Delete();
delete.deleteData();
break;
case 5:
System.exit(0);;
break;
}
}while(ch!=0);
}

}

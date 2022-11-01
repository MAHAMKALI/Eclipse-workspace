package jdbcApp3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeData3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kishore","061998");
		
		System.out.println("Enter the name of table");
		Scanner scanner = new Scanner(System.in);
		String tname = scanner.next();
		String q1 = "create table "+tname+"(empid number,empname varchar2(20),empsal number(10,2),location varchar2(20))";
		Statement statement = connection.createStatement();
		int a = statement.executeUpdate(q1);
		if(a==0)
			System.out.println("Table is created successfully");
		Thread.sleep(5000);
		int rowcount=0;
		while(true) {
			System.out.println("Enter employeeId:");
			int eid = scanner.nextInt();
			System.out.println("Enter employee name:");
			String ename = scanner.next();
			System.out.println("Enter employee salary");
			float esal = scanner.nextFloat();
			System.out.println("Enter employee job location:");
			String eloc = scanner.next();
			String q2 = "insert into "+tname+" values("+eid+",'"+ename+"',"+esal+",'"+eloc+"')";
			statement.executeUpdate(q2);
			System.out.println("One Row Inserted successfully....");
			System.out.println("Do you want to enter one more record..(yes/no)");
			String option = scanner.next();
			if(option.equals("no"))
				break;
			rowcount=rowcount+1;
		}
		System.out.println(rowcount+" rows are inserted successfully....");
		
		System.out.println("Do you want to see any table data..(yes/no");
		String str = scanner.next();
		if(str.equals("yes")) {
			System.out.println("Enter name of table:");
			String s = scanner.next();
			String q3 = "select * from "+s;
			ResultSet rs = statement.executeQuery(q3);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getFloat(3)+"--"+rs.getString(4));
			}
			System.out.println();
			System.out.println("All your modifications are updated successfully");
		}
		else {
			System.out.println("All your modifications are updated successfully");
		}
		scanner.close();
		connection.close();
	}

}
/*
 Enter the name of table
empdata
Table is created successfully
Enter employeeId:
101
Enter employee name:
kishore
Enter employee salary
2000
Enter employee job location:
chennai
One Row Inserted successfully....
Do you want to enter one more record..(yes/no)
yes
Enter employeeId:
102
Enter employee name:
Rajesh
Enter employee salary
3000
Enter employee job location:
banglore
One Row Inserted successfully....
Do you want to enter one more record..(yes/no)
yes
Enter employeeId:
103
Enter employee name:
Sukumar
Enter employee salary
4000
Enter employee job location:
hyderabad
One Row Inserted successfully....
Do you want to enter one more record..(yes/no)
yes
Enter employeeId:
104
Enter employee name:
Vamsi
Enter employee salary
3000
Enter employee job location:
chennai
One Row Inserted successfully....
Do you want to enter one more record..(yes/no)
no
3 rows are inserted successfully....
Do you want to see any table data..(yes/no
yes
Enter name of table:
empdata
101---kishore---2000.0--chennai
102---Rajesh---3000.0--banglore
103---Sukumar---4000.0--hyderabad
104---Vamsi---3000.0--chennai

All your modifications are updated successfully
*/

package jdbcApp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeData1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kishore","061998");
		
		Statement statement = connection.createStatement();
		
		String q1 = "create table EmployeeInfo(empid number,empname varchar2(20),empsal number(10,2),location varchar2(20))";
		int a = statement.executeUpdate(q1);
		if(a==0)
			System.out.println("Table is created");
		
		//String q2 = "insert into EmployeeInfo values(101,'mahesh',2000,'chennai')";
		//String q3 = "insert into EmployeeInfo values(102,'Rakesh',3000,'banglore')";
		//String q4 = "insert into EmployeeInfo values(103,'Suresh',4000,'hyderabad')";
		String q2 = "insert into EmployeeInfo values(?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(q2);
		
		//1st record
		preparedStatement.setInt(1,101);
		preparedStatement.setString(2, "mahesh");
		preparedStatement.setInt(3, 2000);
		preparedStatement.setString(4, "chennai");
		preparedStatement.executeUpdate();
		//2nd record
		preparedStatement.setInt(1,102);
		preparedStatement.setString(2, "Rakesh");
		preparedStatement.setInt(3, 3000);
		preparedStatement.setString(4, "banglore");
		preparedStatement.executeUpdate();
		//3rd record
		preparedStatement.setInt(1,103);
		preparedStatement.setString(2, "Suresh");
		preparedStatement.setInt(3, 4000);
		preparedStatement.setString(4, "hyderabad");
		preparedStatement.executeUpdate();
		
		Thread.sleep(5000);
		
		System.out.println("records are inserted successfully");
		Thread.sleep(1000);
		String q5 = "select * from EmployeeInfo";
		ResultSet rs = statement.executeQuery(q5);
		while(rs.next()) {
			System.out.println(rs.getString(2)+" is having an employeeId "+rs.getInt(1)+" earning a salary of "+rs.getInt(3)+" in "+rs.getString(4));
		}
	
		String q6 = "update EmployeeInfo set empsal = empsal + 1000 where empsal>3000";
		statement.executeUpdate(q6);
		System.out.println("-------------------------------------------After Updatation-----------------------------------------------------------------");
		Thread.sleep(5000);
		String q7 = "select * from EmployeeInfo";
		ResultSet rs1 = statement.executeQuery(q7);
		while(rs1.next()) {
			System.out.println(rs1.getString(2)+" is having an employeeId "+rs1.getInt(1)+" earning a salary of "+rs1.getInt(3)+" in "+rs1.getString(4));
		}
		
		String q8 ="drop table EmployeeInfo purge"; //table will be deleted permanentely
		statement.executeUpdate(q8);
		Thread.sleep(5000);
		System.out.println("Table is dropped successfully..............");
		connection.close();
	}

}

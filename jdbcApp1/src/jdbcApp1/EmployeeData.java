package jdbcApp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployeeData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kishore","061998");
		
		Statement statement = connection.createStatement();
		
		String q1 = "select * from person";
		ResultSet rs =statement.executeQuery(q1);
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}
		
		
		connection.close();
	}

}

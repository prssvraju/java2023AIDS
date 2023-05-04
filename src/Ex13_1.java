//Create a Connection: Firstly, we have to establish the connection using driver manager between the java application and MySQL database by providing the database name, username, and password for the database.
//Create Statement: To fire a SQL query we first need to create a statement.
//Execute Query: Write down the query and execute it, in our case, we will write an insert query.
//Close Connection: At the end of executing, we must close the connection.

import java.sql.*;

class Ex13_1 {
	public static void main(String args[]) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "password");
			Statement stmt = con.createStatement();
			String sql = "select * from student";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
			{
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));	
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
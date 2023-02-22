package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			String sql = "SELECT * FROM mytable WHERE id = ?";
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			//stmt = conn.createStatement();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 1); // set the value of the first parameter to 123
			ResultSet rs = pstmt.executeQuery();
			//ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println("ID: " + id + ", Name: " + name);
			}
			//stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

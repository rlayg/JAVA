package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDr {

	public static void main(String[] args) throws SQLException  {
//		mysql
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/scottdb";
		Connection conn = null;
		try {
			Class.forName(driver);
			 conn = DriverManager.getConnection(url, "root", "mysql80");
			
			if(conn != null) {
				System.out.println("mysql 연결 성공");
			}
			
		} catch (Exception e) {
			System.out.println("mysql 연결 실패" + e.getMessage());
		}
		finally {
			if(conn != null) {
				conn.close();
				}
		}
	}

}

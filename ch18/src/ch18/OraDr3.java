package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraDr3 {

	public static void main(String[] args) throws SQLException{
		String	driver = "oracle.jdbc.driver.OracleDriver";  //약속 있어야해
		String	url	   = "jdbc:oracle:thin:@172.30.1.83:1521:xe";
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		conn = DriverManager.getConnection(url, sc.nextLine(), sc.nextLine());
		if(conn != null) {
			System.out.println("Success 연결 성공");
		} else {
			System.out.println("Fail");
		}
		conn.close();
	}

	private static void Connection(String driver, String url, Scanner sc) throws SQLException {
		String id;
		String password;
		Connection conn = null;
		
		try {
//			System.out.println("ID 입력");
//			id = sc.nextLine();
//			System.out.println("PassWord 입력");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, sc.nextLine(), sc.nextLine());

			System.out.println("Start");
			if(conn != null) {
				System.out.println("Success 연결 성공");
			} else {
				System.out.println("Fail");
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class OraPrac {

	public static void main(String[] args) throws SQLException { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dept 입력");
		String deptno = sc.nextLine();
		System.out.println("dname 입력");
		String dname = sc.nextLine();
		System.out.println("loc 입력");
		String loc = sc.nextLine();
		
		String		sql = String.format("Insert Into dept values"
				+ "(%s, '%s', '%s')", deptno, dname, loc);
		String		driver = "oracle.jdbc.driver.OracleDriver";
		String		url	   = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			
			int result = pstmt.executeUpdate(); //excuteupdate의 반환값은  영향받은 sql의 행 개수를 반환하기 때문
//			0이면 업뎃이든 딜리트든 인서트든 아무것도 안됫다
			if(result == 1) {
				System.out.println("입력 성공");
			} else {
				System.out.println("입력 실패");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pstmt.close();
			conn.close();
		}
	
		
		
//		Date now = new Date();
//		String dateStr = now.toString();
//		System.out.println(dateStr);
//		
//		String name = "John";
//		int age = 30;
//		String message = String.format("My name is %s and I am %d years old.", name, age);
//		System.out.println(message);
	}

}

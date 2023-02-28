package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyPrepare {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("MySql 부서코드 ? ");
		String	dno			= sc.nextLine();
		System.out.println("MySql 부서명 ? ");
		String	dname		= sc.nextLine();
		System.out.println("MySql 전화번호 ? ");
		String	phone		= sc.nextLine();
		System.out.println("MySql 직위 ? ");
		String	position	= sc.nextLine();
				
		Connection conn = null;
		PreparedStatement  pstmt = null;
				
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/scottdb";
		
		String sql = String.format("Insert Into division values(?, ?, ?, ?)");
		
		System.out.println("sql->" + sql);
		
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql80");
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dno);
			pstmt.setString(2, dname);
			pstmt.setString(3, phone);
			pstmt.setString(4, position);
			
			int result = pstmt.executeUpdate();
			//입력/수정/삭제시 -> executeUpdate
			if(result > 0 ) {
				System.out.println("Mysql 입력 성공");
			} else {
				System.out.println("Mysql 입력 실패");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
		}
		sc.close();
		
		
	}

}

package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyDelete {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("MySql 삭제할 부서를 입력 ? ");
		String	dno			= sc.nextLine();
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/scottdb";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "Delete from division Where dno = (?)";
		
		System.out.println("sql -> " + sql);
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql80");
			pstmt = conn.prepareStatement(sql); //sql문을 미리 준비에두고 밑에 값을 자라락 넣어줘
			pstmt.setString(1, dno);			// statement는 위에서 값을 넣어주니까 밑에 int result 에 sql을 넣어줘
			
			int result = pstmt.executeUpdate();
			if(result > 0 ) {
				System.out.println("입력 성공");
			} else {
				System.out.println("입력 실패");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());		
		} finally {
			if( pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
		sc.close();
	}

}

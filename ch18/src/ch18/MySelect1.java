package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySelect1 {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("MySql 부서코드를 입력");
		int		dno = sc.nextInt();
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/scottdb";

		
		String	sql = "Select * From division Where dno = " + dno;
		
		Connection	conn = null;
		Statement	stmt = null;
		ResultSet	rs	 = null;
		
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql80");
			stmt = conn.createStatement(); // stmt 객체 생성
			rs	 = stmt.executeQuery(sql); //SQL문 실행 결과 저장
//			rs 에서 Row 첫번째 읽기
			if(rs.next()) {
				String dname = rs.getString(2); //rs.getString("dname") <-- 같은 뜻
				String phone = rs.getString(3); //rs.getString("phone") <-- 같은 뜻
				String position = rs.getString("position");
				System.out.println("mysql 부서코드 : " + dno);
				System.out.println("mysql 부서명 : " + dname);
				System.out.println("mysql 전화번호 : " + phone);
				System.out.println("mysql 직위 : " + position);
			} else {
				System.out.println("데이터 없네");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
			sc.close();
		}
		
		
		
		
		
	}

}

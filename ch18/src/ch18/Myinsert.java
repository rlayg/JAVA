package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Myinsert {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.println("MySql 부서코드 ? ");
		String	dno			= sc.nextLine();
		System.out.println("MySql 부서명 ? ");
		String	dname		= sc.nextLine();
		System.out.println("MySql 직위 ? ");
		String	position	= sc.nextLine();
				
		Connection conn = null;
		Statement  stmt = null;
				
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/scottdb";

		String sql = String.format("Insert Into division(dno, dname, position)"
				+ "values(%s, '%s', '%s')", dno, dname, position);
		
		System.out.println("sql->" + sql);
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql80");
			stmt = conn.createStatement();
			//result는 작업에 성공한 갯수
			int result = stmt.executeUpdate(sql);
			//입력/수정/삭제시 -> executeUpdate
			if(result > 0 ) {
				System.out.println("Mysql 입력 성공");
			} else {
				System.out.println("Mysql 입력 실패");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
		}
		sc.close();
		
		
	}

}

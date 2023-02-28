package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//53번부터 삭제가능 그 앞에 번호는 포레인키 리스트릭되있음
public class OraDelete2 {

	public static void main(String[] args) throws SQLException {
		String	driver = "oracle.jdbc.driver.OracleDriver";
		String	url	   = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서를 입력하세요 ?");
		String deptno = sc.nextLine();
		
		Connection conn = null;
		Statement stmt = null;
		
		String sql = String.format("Delete from dept Where deptno = %s", deptno);
		System.out.println("sql-> "+sql);

		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			
			
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("입력 성공");
			} else {
				System.out.println("입력 실패");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		

		
		
		

	}

}

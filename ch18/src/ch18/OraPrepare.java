package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OraPrepare {


	public static final String driver = "oracle.jdbc.driver.OracleDriver";
	public static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 Oracle 부서코드 ? ");
		String deptno = sc.nextLine();
		System.out.println("입력할 Oracle 부서명 ? ");
		String dname= sc.nextLine();
		System.out.println("입력할 Oracle 근무지 ? ");
		String loc = sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		Localhost -> 127.0.0.1; , Port 번호 : 1521, xe(orcl) -> Service Id(Sid)
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		String sql = "Insert Intp dept values("+deptno+",'"+dname+"','"+loc+"')"; 위와 같이
		String sql = "Insert Into dept values(?, ?, ?)";
		
		
		
		
//		prepareStatement 는 보안때문 권장 그냥 Statement 은 보안 취약
		try {
			Class.forName(OraPrepare.driver);
				conn = DriverManager.getConnection(OraPrepare.url,"scott","tiger");
				pstmt = conn.prepareStatement(sql); //sql추가
				pstmt.setString(1, deptno);
				pstmt.setString(2, dname);
				pstmt.setString(3, loc);
//				result는 작업에 성공한 갯수
				int result = pstmt.executeUpdate(); // 입력/수정/삭제시 -> executeUpdate
				if(result > 0) System.out.println("OraPrepare 입력성공 ");
				else		   System.out.println("OraPrepare 입력실패 ");
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	}

}

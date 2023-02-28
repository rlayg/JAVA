package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
// 과제
public class OraUpdate {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 부서를 입력하세요 ?");
		String	deptno = sc.nextLine();
		System.out.println("수정할	부서명 ?");
		String	dname= sc.nextLine();
		System.out.println("수정할	근무지 ?");
		String	loc= sc.nextLine();
//		OraInsert 에 넣은걸 업데이트로 바꿔바
		
		Connection	conn = null;
		Statement	stmt = null;

		String		driver = "oracle.jdbc.driver.OracleDriver";
//		Localhost ->			127.0.0.1;, Port 번호: 1521 , xe(orcl) -> Service ID(Sid)
		String		url	   = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // 여기가 드라이버 호출 = 드라이버뭔지알려주는거:아이피:포트번호:SID
//		String		url	   = "jdbc:oracle:thin:@172.30.1.83:1521:xe";
//		String		url	   = "jdbc:oracle:thin:@localhost:1521:xe"; //이렇게 로컬호스트로 해도 된다
		
//		String		sql = String.format("Update dept set dname", dname, dname, loc);
		String		sql = String.format("Update dept set dname = '%s', "+"loc='%s' where deptno=%s" , dname, loc, deptno);
		
//		String.format("\"Update dept set dname = '%s', \"+\"loc='%s' where deptno=%s\" , dname, loc, deptno")
		
		
		System.out.println("sql-> "+sql); //sql이 정상적으로 나오는지 점검하는거
		
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
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {

			
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
		
		sc.close();
		
	}

}

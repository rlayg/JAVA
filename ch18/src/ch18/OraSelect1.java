package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraSelect1 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드를 입력하세요");
		int deptno = sc.nextInt();
		String driver = "oracle.jdbc.driver.OracleDriver";
//		Localhost -> 127.0.0.1; , Port 번호 : 1521, xe(orcl) -> Service Id(Sid)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "Select dname, loc From Dept Where deptno =" + deptno; 
		
		Connection conn = null; //DB 연결
		Statement  stmt = null; //SQL문장 수행 객체 미리 선언
		ResultSet  rs   = null; //SQL문장 Select 시 내용을 받아 놓는 객체 Oracle의 Cursor문과 느낌이 비슷해
		
		try {
			Class.forName(driver); //driver가 load 근데 설정한거랑 안맞을수 있어서 트라이캐치
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement(); //stmt // 던저
			rs	 = stmt.executeQuery(sql); //셀렉트만 executeQuery 사용
			
			//rs Row에 대한 실행결과가 있냐 있으면 가져와 next / 가져올 컬럼명 적어 "dname"(이런거)
			if(rs.next()) { 
//				detpno가 하나인걸 알고, 유일하다는걸 알기에 if문 함 그게 아니라면 do-while문을 사용
//				String dname = rs.getString("dname"); //버퍼에 있는걸 가져올때 겟스트링 쓴다고 생각
//				String loc   = rs.getString("loc");
				String dname = rs.getString(1); //String sql 컬럼의 번호순. 순서 정확히 알면 숫자로 가져와도 된다
				String loc   = rs.getString(2);
				System.out.println("부서번호 : " + deptno);
				System.out.println("부서명  : " + dname);
				System.out.println("위치   : " + loc);
			} else {
				System.out.println("자료가 없습니다");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if( rs != null)		rs.close(); //이렇게 뚜껑 닫는게 좋다
			if( stmt != null)	stmt.close();
			if( conn != null)	conn.close();
		}
		sc.close();
		
	}

}

package ch18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc1 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 Oracle 부서코드 ? ");
		String deptno = sc.nextLine();
		System.out.println("입력할 Oracle 부서명 ? ");
		String dname= sc.nextLine();
		System.out.println("입력할 Oracle 근무지 ? ");
		String loc = sc.nextLine();
		
		Connection	conn = null;
		
		//PROCEDURE 호출객체
		CallableStatement cs = null; //콜이 가능한 문장
		String driver = "oracle.jdbc.driver.OracleDriver";
//		Localhost -> 127.0.0.1; , Port 번호 : 1521, xe(orcl) -> Service Id(Sid)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		String sql = "{call dept_Insert(?,?,?)}"; // call 하고 프로시저 명/ 파라미터 3개 ???
//							sql에 dept_Insert 프로시저 있어야함/ {} 없어도 되는데 있는게 FM
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			cs = conn.prepareCall(sql); //PROCEDURE 호출할때는 prepareCall 씀 나머진 같다
			cs.setString(1, deptno);
			cs.setString(2, dname);
			cs.setString(3, loc);
			
			int resultBool = cs.executeUpdate();
			System.out.println("result -> " + resultBool);
			if(resultBool > 0) {
				System.out.println("Oracle CallableStatement Boolean 입력 성공");
			} else {
				System.out.println("Oracle CallableStatement Boolean 입력 실패");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if( cs	!= null)	cs.close();
			if( conn != null)	conn.close();
		}
		sc.close();
	}

}


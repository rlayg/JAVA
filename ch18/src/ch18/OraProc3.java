package ch18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc3 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 Oracle 사원코드 ? ");
		String empno = sc.nextLine();
		
		Connection			conn = null;
		CallableStatement	cs	 = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
//		Localhost -> 127.0.0.1; , Port 번호 : 1521, xe(orcl) -> Service Id(Sid)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
//		Function Call 할 때의 Format
//		사번을 입력하여 --> 급여인상, 변경된 급여를 Return
		String sql = "{? = call func_sal(?)}"; //앞에거?는 입력한 사번의 급여,뒤에거? 파라메터 입력값
//		앞의 ? 는 프로시저로 따지면 out이야
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			cs	 = conn.prepareCall(sql);
			cs.setString(2, empno); // 변경할 사번 / 사번은 2번에 놓는거야 1번 아니야
			cs.registerOutParameter(1, java.sql.Types.INTEGER); //변경 급여
			cs.executeQuery();
//			cs.executeUpdate() 얘는 업데이트
			
			int		sal		=	cs.getInt(1); //첫번째걸 받아오면 sal이야
			
			if(sal > 0) {
				System.out.println("Oracle CallableStatement 수정 성공");
				System.out.println("변경사번		" + empno);
				System.out.println("변경급여		" + sal);
			} else {
				System.out.println("Oracle CallableStatement 수정 실패");
			}
			
		} catch (Exception e) {
			System.out.println("e.getMessage()");
		} finally {
			if( cs != null) cs.close();
			if( conn != null) conn.close();
		}
	}

}

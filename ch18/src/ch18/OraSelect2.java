package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class OraSelect2 {

	public static void main(String[] args) throws SQLException {
		// 멀티 Row 
		String driver = "oracle.jdbc.driver.OracleDriver";
//		Localhost -> 127.0.0.1; , Port 번호 : 1521, xe(orcl) -> Service Id(Sid)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "Select * From emp"; //멀티로우다
		
		Connection conn = null; //DB 연결
		Statement  stmt = null; //SQL문장 
		ResultSet  rs   = null; //Result Set

		System.out.println("사원명단");
		System.out.println("사원코드\t 사원명\t 업무\t\t 급여\t 일자");
		System.out.println("=============================================");
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			rs	 = stmt.executeQuery(sql); //resutSet에는 Select * From emp의 출력값이 담겨있어
			
			if(rs.next()) { //멀티로우기 때문에 안에서 do-while 해야해
				//Each Row(각각의 로우별로)
				do {
					int		empno = rs.getInt(1); //뽑을대 아예 int로 뽑아내
					String	ename = rs.getString(2); //뽑을대 아예 String로 뽑아내
					String	job	  = rs.getString(3); //이게 방법2 안할경우 원래 타입
					int		sal	  = rs.getInt("SAL"); //조회하고자 하는 컬럼값에 null이 있으면 안나올수 있다
					//Util.Date sql.Date 아니야
					Date	date  = rs.getDate("hiredate"); // 뽑을때 date로 뽑아
					
//					JOB이 NULL일경우 NULL 처리 방법1 천재들방법 방법2 컴퓨터방법
//					방법1 문제가 일어난 곳 사이에다가 NULL처리
					if(job == null) {
						job = "직책없음";
					} else { // else문은 없어도 되는데 가독성때문에 그냥 넣음
						job = job;
					}
					
//					방법2 컴퓨터 방법
//					1.rs.getString(3)을 rs.getString("JOB")로 변경하여, 조회하는 컬럼의 이름으로 값을 가져옵니다.
//					2.값을 가져온 후에 rs.wasNull() 메서드를 이용하여, 해당 컬럼 값이 null인지를 검사합니다.
//					3.null일 경우, 출력값으로 "-" 문자열을 사용하도록 처리합니다.
//					코드로 나타내면 다음과 같습니다.
//					String job = rs.getString("JOB");
//					if (rs.wasNull()) {
//					    job = "-";
//					}
//					이렇게 하면, job 값이 null일 경우 "-" 문자열이 출력되도록 처리됩니다.
					
					if(job.length() > 7) {
						System.out.printf("%d \t%s\t%s\t%d\t%TF\n", empno, ename, job, sal, date);
					} else  {
						System.out.printf("%d \t%s\t%s\t\t%d\t%TF\n", empno, ename, job, sal, date);
					} // JOB 글자 길이가 짧은 애들은 탭 한번 더 쳐줘야 한다
					
//					if(job.length() > 7)
//						 System.out.printf("%d \t%s\t%s\t%d\t%TF\n", empno, ename, job, sal, date);
//					else System.out.printf("%d \t%s\t%s\t%d\t%TF\n", empno, ename, job, sal, date);
					
				} while(rs.next()); //모든 Row가 끝날때까지 
			}else {
				System.out.println("date No");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}finally {
			if(rs   != null)	rs.close();
			if(stmt != null)	stmt.close();
			if(conn != null)	conn.close();
		}
		System.out.println("---사원 조회 종료---");
	}

}


//public static final String driver = "oracle.jdbc.driver.OracleDriver";
//public static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";



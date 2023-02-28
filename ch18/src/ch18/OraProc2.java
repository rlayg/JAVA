package ch18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OraProc2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정보가 궁금한 사람 사번 ");
		int	empno = sc.nextInt();

		String driver = "oracle.jdbc.driver.OracleDriver";
//		Localhost -> 127.0.0.1; , Port 번호 : 1521, xe(orcl) -> Service Id(Sid)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//							 	 	 in -> Empno  OUT->ename, sal
		String	sql = "{call emp_Info2(?,				?,		?)}";
		Connection	conn = null;
		CallableStatement	cs = null;
		
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "tiger");
			cs = conn.prepareCall(sql);
			cs.setInt(1, empno);
			cs.registerOutParameter(2, java.sql.Types.VARCHAR); //레지스터 밑에 저장되있는걸 빼겟다 문자 받을때 뒤에있는거 쓰면 돼
			cs.registerOutParameter(3, java.sql.Types.INTEGER);
//			가져오겠다고 선언만 해놓은거 executeQuery 실행하기 전에 선언해야함
			cs.executeQuery();
			String ename = cs.getString(2); //선언해놓은애를 가져오기만 하면 돼
			int sal = cs.getInt(3);
			System.out.println("사번 : " + empno);
			System.out.println("이름 : " + ename);
			System.out.println("급여 : " + sal);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

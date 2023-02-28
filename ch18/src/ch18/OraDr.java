package ch18;
// 예제 순서 OraDr - 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//	The type java.sql.DriverManager is not accessible 오라클 드라이버가 없다는거
//  oraclexe - ojdbc6.jar 찾기 - 이클립스 ch18 우클릭 - 빌드패스 - 콘피규어빌드 - 라이브러리 - 2번째 애드 익스터널 - ojdbc6.jar 추가
public class OraDr {

	public static void main(String[] args) throws SQLException{
		String	driver = "oracle.jdbc.driver.OracleDriver";  //약속 있어야해
//											IP		Port Service Id
		String	url	   = "jdbc:oracle:thin:@127.0.0.1:1521:xe";  
//		자기 로컬 아이피 집에서 공인아이피 얻으면 이걸 적으면 돼
		
//		1521은 호스트번호 sid 는 서비스아이디 무료는 xe 유료는 orcl -- 이것들은 바뀔 수 있어
//		String	url	   = "jdbc:oracle:thin:@localhost:1521:xe"; 
//		@localhost 이렇게 해도 되야해 
		
//		String	url	   = "jdbc:oracle:thin:@172.30.1.83:1521:xe";
//		cmd ipconfig - IPv4 주소 - 내 아이피 @옆에 넣어도 되야해(이게 공인아이피면 밖에서도 돼 DHCP(사설ip)면 안돼
//		로컬호스트, 나의 아이피 다 같은 결과 나와야해 
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Start");
			if(conn != null) {
				System.out.println("Success 연결 성공");
			} else {
				System.out.println("Fail");
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
/*
설치 순서
1. JDK
2. 이클립스
3. oracle 11g xe
4. SQL디벨로퍼
5. Tomcat (M/W) /미들웨어


*/
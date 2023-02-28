package ch18;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraInsert {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호 입력?");
		String	deptno = sc.nextLine();
		System.out.println("부서명 입력?");
		String	dname = sc.nextLine();
		System.out.println("위치 입력?");
		String	loc = sc.nextLine();
		
		Connection	conn = null;
		Statement	stmt = null;
		String		driver = "oracle.jdbc.driver.OracleDriver";
//		Localhost ->			127.0.0.1;, Port 번호: 1521 , xe(orcl) -> Service ID(Sid)
		String		url	   = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // 여기가 드라이버 호출 = 드라이버뭔지알려주는거:아이피:포트번호:SID
//		String		url	   = "jdbc:oracle:thin:@172.30.1.83:1521:xe";
//		String		url	   = "jdbc:oracle:thin:@localhost:1521:xe"; //이렇게 로컬호스트로 해도 된다
//		String		url	   = "jdbc:oracle:thin:@172.30.1.73:1521:xe";
		
//		Dept Table Insert를 완성
//		String sql   = "Insert Into dept values("+deptno+),'"+dname+"', '"+loc+"')";
		String		sql = String.format("Insert Into dept values(%s, '%s', '%s')", deptno, dname, loc);
		//format이 뭐냐? printf %s는 문자열로 완성되지만 나올때는 num으로 나와야한다 '
		System.out.println("sql-> "+sql);
		
		try {
			Class.forName(driver);//오라클 드라이버가 메모리에 올라가 빨간줄난다면 드라이버가 없을수도 있어서. 이걸 매칭시켜줘야함//던지든지 트라이캐치
			//jdbc 드라이브 로드
			conn = DriverManager.getConnection(url, "scott", "tiger"); //ppt에 이게 드라이버 연결해서 db에 접촉하는거다 라고 설명
			//연결정보도 입력해 /빨간줄 입력자가 잘못입력하면 어덕해? 또 감싸면 로직 지저분해져 -> 던저
			//포트연결 성공이 여기까지
			stmt = conn.createStatement();
//			statement - sql문장을 구성하는애	
			int result = stmt.executeUpdate(sql); //insert할거야 그럼 executeUpdate 쓸거야
			//인서트 딜리트 업데이트 경우 실행결과 로우의 개수가 넘어와 인트로 받아야함
			//셀렉트의 경우 익스큐트쿼리로 해서 리절트셋으로 받아야 해
			if(result > 0)System.out.println("입력 성공");
			else		  System.out.println("입력 실패");
			
		} catch (Exception e) { //익셉션 오류로 퉁쳐 복잡하고 중요한거 아니면 이걸로 다 퉁쳐
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 		
	}

}

//55 자재팀 영등포 54 구매팀 당산 57, 'IT1팀', '신도림' 입력함 다 들어가





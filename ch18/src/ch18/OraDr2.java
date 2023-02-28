package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class OraDr2 {

	public static void main(String[] args) throws SQLException{
		String	driver = "oracle.jdbc.driver.OracleDriver";  
		String	url	   = "jdbc:oracle:thin:@172.30.1.83:1521:xe";
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		
		conn = connectDB(driver, url, sc);
		System.out.println("쿼리문을 작성해주세요");
		String query = sc.nextLine();
	    PreparedStatement ps = conn.prepareStatement(query);
	    
		ResultSet rs =  ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		
		for(int j = 1; j <= columnCount; j++) {
			System.out.print(rsmd.getColumnName(j) + "\t");
		}
		System.out.println();
		
		while(rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}
		if(conn != null) {
			System.out.println("conn이 안닫혔어");
			conn.close();
			System.out.println("내가 닫음");
		}else {
			System.out.println("닫혀있음");
		}
		
	}

	private static Connection connectDB(String driver, String url, Scanner sc) throws SQLException {
		String id;
		String pw;
		Connection connection = null;
		try {
			System.out.println("아이디를 입력해주세요");
			id = sc.nextLine();
			System.out.println("비밀번호 입력");
			pw = sc.nextLine();
			Class.forName(driver);
			connection = DriverManager.getConnection(url, id, pw);
			System.out.println("Start");
			if(connection != null) {
				System.out.println("Success 연결 성공");
			} else {
				System.out.println("Fail");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}

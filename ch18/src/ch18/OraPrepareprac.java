package ch18;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OraPrepareprac {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 detpno");
		String empno = sc.nextLine();
			
		String		driver = "oracle.jdbc.driver.OracleDriver";
		String		url	   = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	
		Connection conn = null;
		CallableStatement cs = null;
		
		String sql = "{? = call func_sal(?)}";
		
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}

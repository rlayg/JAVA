package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pt = new Properties();
		
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		System.out.println("1-1 path : " + path);
		path = URLDecoder.decode(path, "utf-8");
		System.out.println("1-2 path : " + path);
		pt.load(new FileReader(path));
		String driver = pt.getProperty("driver");
		String url = pt.getProperty("url");
		System.out.println("3. url : " + url);
		
//		과제 username & password 해서 밑에 4번 5번이 나오게 해라
		String userName = pt.getProperty("username");
		String password = pt.getProperty("password");
		System.out.println("4. username : " + userName);
		System.out.println("5. password : " + password);	
	}

}

/*
%20 아스키코드  Decode로 복호화
Properties는 맵계열이고 그렇기에 키와 밸류로 나눠짐 
Properties의 특징이 =를 기준으로 앞은 키 뒤는 밸류로 나눠진다
Ex)
driver=oracle.jbdc.OracleDriver
가 있다면
driver 가 Key
oracle.jbdc.OracleDriver 가 Value
*/
package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtil {
	// controller 패키지의 관리 클래스
	// 데이터베이스 연동 클래스
//	static final String driver = "oracle.jdbc.driver.OracleDriver";
//	static final String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";

	public static Connection getConnection() throws Exception {

		Properties properties = new Properties();
		Connection con = null;
		try (FileInputStream fileInputStream = new FileInputStream("src/config/db.properties")) {
			// Properties 파일을 읽어옵니다.
			properties.load(fileInputStream);

			// 원하는 프로퍼티 값을 가져옵니다.
			String driver = properties.getProperty("driver");
			String dbUrl = properties.getProperty("url");
			String dbUsername = properties.getProperty("username");
			String dbPassword = properties.getProperty("password");

			// 가져온 값을 출력합니다.
//			System.out.println("Database URL: " + dbUrl);
//			System.out.println("Database Username: " + dbUsername);
//			System.out.println("Database Password: " + dbPassword);
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			return con;
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		return con;

	}

}



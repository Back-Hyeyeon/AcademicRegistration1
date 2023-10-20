package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	//controller 패키지의 관리 클래스
	//데이터베이스 연동 클래스
	static final String driver = "oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
	
	public static Connection getConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, "hr", "hr");
		return con;
	}

}

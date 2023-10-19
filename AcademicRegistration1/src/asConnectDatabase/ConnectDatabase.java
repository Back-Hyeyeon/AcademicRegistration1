package asConnectDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {

	public static void main(String[] args) {
	
			String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
			String user = "hr";
			String pw = "hr";
			Connection conn = null;
			// 1.드라이버 로드
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// System.out.println("oracle 적재 성공");

				// 2.오라클데이터 베이스 연결
				conn = DriverManager.getConnection(url, user, pw);
				// System.out.println("oracle 접속 성공");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("oracle 접속 실패");
			} catch (SQLException e) {
				System.out.println("오라클 연결에 실패했습니다.");

			}
			
	
	}

	
}

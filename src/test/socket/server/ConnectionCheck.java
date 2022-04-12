package test.socket.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCheck {

	public static void main(String[] args) {
		try {
		String dbURL = "jdbc:sqlserver://192.168.0.105\\MSSQLServer;user=sa;password=suraj";
		Connection conn = DriverManager.getConnection(dbURL);
		
		if (conn != null) {
		    System.out.println("Connected");
		}
		} catch (SQLException e) {
			System.err.println(e.getLocalizedMessage());
//			e.printStackTrace();
		}
	}
}

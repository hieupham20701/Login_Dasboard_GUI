package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private static Connection con = null;
	private static ConnectDB instance = new ConnectDB();
	public static ConnectDB getInstance() {
		return instance;
	}
	public void connection() {
		 String username = "sa";
		 String password = "sapassword";
		 String url = "jdbc:sqlserver://localhost:1433;databasename=login_Dashboard";
		 try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnect() {
		return con; 
	}
}

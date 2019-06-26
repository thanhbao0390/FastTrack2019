package ft.edu.vn.cafes.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	static final String url = "jdbc:mysql://localhost:3306/db-cafes";
	static final String user = "root";
	static final String password = "";

	public static Connection connect() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, password);

		return conn;
	}

}

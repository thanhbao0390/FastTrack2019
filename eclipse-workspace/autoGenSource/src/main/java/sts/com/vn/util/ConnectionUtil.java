package sts.com.vn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection connectDBRoot() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(Constants.url + Constants.dbroot, Constants.user,
				Constants.password);

		return conn;
	}

	public static Connection connectDB() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(Constants.url + Constants.dbname, Constants.user,
				Constants.password);

		return conn;
	}

}

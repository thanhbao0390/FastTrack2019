package ft.edu.vn.cafes.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ft.edu.vn.cafes.entity.KhuVuc;
import ft.edu.vn.cafes.util.ConnectionUtil;

public class KhuVucDao {
	public List<KhuVuc> list() throws ClassNotFoundException, SQLException {

		List<KhuVuc> list = new ArrayList<KhuVuc>();
		KhuVuc obj;

		Connection con = ConnectionUtil.connect();
		Statement stmt = con.createStatement();

		String sql = "select * from khuvuc";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			obj = new KhuVuc();
			obj.setMaKV(rs.getString("MaKV"));
			obj.setTenKV(rs.getString("TenKV"));

			list.add(obj);
		}

		rs.close();
		stmt.close();
		con.close();

		return list;
	}
}

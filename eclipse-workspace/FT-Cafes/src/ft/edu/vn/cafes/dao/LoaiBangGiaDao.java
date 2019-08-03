package ft.edu.vn.cafes.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ft.edu.vn.cafes.entity.LoaiBangGia;
import ft.edu.vn.cafes.util.ConnectionUtil;

public class LoaiBangGiaDao {
	public List<LoaiBangGia> list() throws ClassNotFoundException, SQLException {

		List<LoaiBangGia> list = new ArrayList<LoaiBangGia>();
		LoaiBangGia obj;

		Connection con = ConnectionUtil.connect();
		Statement stmt = con.createStatement();

		String sql = "select * from loaibanggia";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			obj = new LoaiBangGia();
			obj.setMaBG(rs.getString("MaBG"));
			obj.setTenBG(rs.getString("TenBG"));
			obj.setMacdinh(rs.getInt("Macdinh"));

			list.add(obj);
		}

		rs.close();
		stmt.close();
		con.close();

		return list;
	}
}

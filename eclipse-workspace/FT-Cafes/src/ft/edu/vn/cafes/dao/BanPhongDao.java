package ft.edu.vn.cafes.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ft.edu.vn.cafes.entity.BanPhong;
import ft.edu.vn.cafes.util.ConnectionUtil;

public class BanPhongDao {
	public List<BanPhong> list() throws ClassNotFoundException, SQLException {

		List<BanPhong> list = new ArrayList<BanPhong>();
		BanPhong obj;

		Connection con = ConnectionUtil.connect();
		Statement stmt = con.createStatement();

		String sql = "select * from banphong";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			obj = new BanPhong();
			obj.setSoban(rs.getString("Soban"));
			obj.setMaKV(rs.getString("MaKV"));
			obj.setMaBG(rs.getString("MaBG"));

			list.add(obj);
		}

		rs.close();
		stmt.close();
		con.close();

		return list;
	}

	public int add(BanPhong obj) throws ClassNotFoundException, SQLException {

		Connection con = ConnectionUtil.connect();
		Statement stmt = con.createStatement();

		String sql = "INSERT INTO `banphong`(`Soban`, `MaKV`, `MaBG`) VALUES (" 
				+ "'" + obj.getSoban() + "'" 
				+ ",'" + obj.getMaKV() + "'" 
				+ ",'" + obj.getMaBG() + "'" + ")";
		int r = stmt.executeUpdate(sql);

		stmt.close();
		con.close();
		return r;
	}
}

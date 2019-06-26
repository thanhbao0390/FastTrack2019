package ft.edu.vn.cafes.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ft.edu.vn.cafes.entity.NhanVien;
import ft.edu.vn.cafes.util.ConnectionUtil;

public class NhanVienDao {

	public List<NhanVien> list() throws ClassNotFoundException, SQLException {

		List<NhanVien> list = new ArrayList<NhanVien>();
		NhanVien nv;

		Connection con = ConnectionUtil.connect();
		Statement stmt = con.createStatement();

		String sql = "select * from Nhanvien";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			nv = new NhanVien();
			nv.setMaNV(rs.getString("MaNV"));
			nv.setMaBP(rs.getString("MaBP"));
			nv.setHoten(rs.getString("Hoten"));
			nv.setDiachi(rs.getString("Diachi"));
			nv.setDienthoai(rs.getString("Dienthoai"));
			nv.setMasothue(rs.getString("Masothue"));
			nv.setKetoan(rs.getBoolean("IsKetoan"));
			nv.setThungan(rs.getBoolean("IsThungan"));

			list.add(nv);
		}

		rs.close();
		stmt.close();
		con.close();

		return list;
	}

}

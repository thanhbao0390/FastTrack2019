/**
 * 
 */
package ft.edu.vn.cafes.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ft.edu.vn.cafes.dao.BanPhongDao;
import ft.edu.vn.cafes.dao.KhuVucDao;
import ft.edu.vn.cafes.dao.LoaiBangGiaDao;
import ft.edu.vn.cafes.entity.BanPhong;
import ft.edu.vn.cafes.entity.KhuVuc;
import ft.edu.vn.cafes.entity.LoaiBangGia;

/**
 * @author thanhbao
 *
 */
public class SoDoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		BanPhongDao dao = new BanPhongDao();
		List<BanPhong> list = new ArrayList<BanPhong>();
		
		KhuVucDao daoKV = new KhuVucDao();
		List<KhuVuc> khuvucs = new ArrayList<KhuVuc>();
		
		LoaiBangGiaDao daoLBG = new LoaiBangGiaDao();
		List<LoaiBangGia> loaibanggias = new ArrayList<LoaiBangGia>();
		
		try {
			list = dao.list();
			khuvucs = daoKV.list();
			loaibanggias = daoLBG.list();
		} catch (ClassNotFoundException | SQLException e) {
			//e.printStackTrace();
		}
		
		req.setAttribute("list", list);
		req.setAttribute("khuvucs", khuvucs);
		req.setAttribute("loaibanggias", loaibanggias);

		RequestDispatcher rd = req.getRequestDispatcher("layout/sodo.jsp");
		rd.forward(req, resp);
	}

}

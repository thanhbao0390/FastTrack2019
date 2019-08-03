/**
 * 
 */
package ft.edu.vn.cafes.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import ft.edu.vn.cafes.dao.BanPhongDao;
import ft.edu.vn.cafes.entity.BanPhong;

/**
 * @author thanhbao
 *
 */
public class SoDoAddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String soban = req.getParameter("soban");
		String khuvuc = req.getParameter("khuvuc");
		String loaibanggia = req.getParameter("loaibanggia");
		
		BanPhong obj = new BanPhong();
		obj.setSoban(soban);
		obj.setMaKV(khuvuc);
		obj.setMaBG(loaibanggia);
		
		BanPhongDao dao = new BanPhongDao();
		try {
			dao.add(obj);
		} catch (ClassNotFoundException | SQLException e) {
			//e.printStackTrace();
		}
		
		String json = new Gson().toJson(obj);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().write(json);
	}

}

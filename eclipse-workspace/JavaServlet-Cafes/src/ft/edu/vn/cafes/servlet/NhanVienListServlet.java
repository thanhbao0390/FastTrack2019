/**
 * 
 */
package ft.edu.vn.cafes.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ft.edu.vn.cafes.dao.NhanVienDao;
import ft.edu.vn.cafes.entity.NhanVien;

/**
 * @author thanhbao
 *
 */
public class NhanVienListServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		NhanVienDao dao = new NhanVienDao();
		List<NhanVien> list = new ArrayList<NhanVien>();
		try {
			list = dao.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("list", list);
		RequestDispatcher rd = req.getRequestDispatcher("layout/nhanvien-list.jsp");
		rd.forward(req, resp);
	}

}

/**
 * 
 */
package ft.edu.vn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author thanhbao
 *
 */
public class HomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<String> list = new ArrayList<String>();
		list.add("Nguyen van A");
		list.add("Nguyen van B");
		list.add("Nguyen van C");
		list.add("Nguyen van D");
		
		req.setAttribute("name", "Nguyen Thanh Bao");
		req.setAttribute("listName", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
	    dispatcher.forward(req, resp);
	}
}

package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bo.UpdatettBO;

/**
 * Servlet implementation class DA_checkthongtincanhan
 */
@WebServlet("/DA_checkthongtincanhan")
public class DA_checkthongtincanhan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DA_checkthongtincanhan() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		String update = (String) session.getAttribute("userName");
		String ten = request.getParameter("bidanh");
		String sodienthoai = request.getParameter("sdt");
		String diachi = request.getParameter("diachi");
		String banla = (String) request.getParameter("banla");
		UpdatettBO updatetBO = new UpdatettBO();
		updatetBO.updatett(update, ten, sodienthoai, diachi, banla);
		System.out.print("     " + update);
		response.sendRedirect("DA_trangcanhan.jsp");
	}

}

package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.mathang;
import model.bo.CheckBO;

/**
 * Servlet implementation class Showchitietmathang
 */
@WebServlet("/Showchitietmathang")
public class Showchitietmathang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Showchitietmathang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CheckBO checkBO = new CheckBO();
		String id = request.getParameter("idnew");
		System.out.println(id);
		ArrayList<mathang> arrTDD = new ArrayList<mathang>();
		arrTDD = checkBO.getMatHang(id);
		request.setAttribute("arrTDD", arrTDD);
		RequestDispatcher rd = request.getRequestDispatcher("Showchitietmathang.jsp");
		rd.forward(request, response);
	}

}

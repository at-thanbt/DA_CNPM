package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Tindang;
import model.bo.CheckBO;


/**
 * Servlet implementation class DA_showquanlytinchuadang
 */
@WebServlet("/DA_showquanlytinchuadang")
public class DA_showquanlytinchuadang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DA_showquanlytinchuadang() {
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
		ArrayList<Tindang> arrTD = new ArrayList<Tindang>();
		arrTD = checkBO.getTindang();
		request.setAttribute("arrTD", arrTD);
		RequestDispatcher rd = request.getRequestDispatcher("DA_quanlytinchuadang.jsp");
		rd.forward(request, response);
	}

}
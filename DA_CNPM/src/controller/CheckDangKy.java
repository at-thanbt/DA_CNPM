package controller;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.Account;
import model.bo.DangKyBO;

/**
 * Servlet implementation class CheckDangKy
 */
@WebServlet("/CheckDangKy")
public class CheckDangKy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckDangKy() {
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
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		String submit = request.getParameter("submit");
		DangKyBO dangKyBo = new DangKyBO();
		Account account = null;
		if (submit != null) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String phonenumber = request.getParameter("phonenumber");
			if (username.matches("^[a-zA-Z0-9]*$") == false) {
				response.sendRedirect(request.getContextPath()
						+ "/dangky.jsp?msg=0");
				return;
			}

			account = dangKyBo.getUserByUserName(username);
			if (account != null) {
				response.sendRedirect(request.getContextPath()
						+ "/dangky.jsp?msg=1");
				return;
			}

			// ma hoa md5
			MessageDigest msd;
			String passwordMd5 = "";
			try {
				msd = MessageDigest.getInstance("MD5");
				byte[] srcTextBytes = password.getBytes("UTF-8");
				byte[] enrTextBytes = msd.digest(srcTextBytes);
				BigInteger big = new BigInteger(1, enrTextBytes);
				passwordMd5 = big.toString(16);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}

			boolean check = dangKyBo.addAccount(username, passwordMd5, phonenumber,email);
			if (check) {
				response.sendRedirect(request.getContextPath()
						+ "/dangky.jsp?msg=2");
			} else {
				response.sendRedirect(request.getContextPath()
						+ "/dangky.jsp?msg=3");
				return;
			}
		} else {
			response.sendRedirect(request.getContextPath() + "/dangky.jsp");
		}
	}

}

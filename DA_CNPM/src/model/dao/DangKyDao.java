package model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.bean.Account;

public class DangKyDao {
	private Connection con = null;
	private CallableStatement cstmt = null;
	private ResultSet rs = null;
	BaseDAO bd = new BaseDAO();
	private Account account = null;

	public Account getUserByUserName(String username) {
		try {
			con = BaseDAO.getConnection();
			String query = "{CALL getAccountByUsername(?)}";
			cstmt = con.prepareCall(query);
			cstmt.setString(1, username);
			rs = cstmt.executeQuery();
			while (rs.next()) {
				account = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getBoolean(7));
			}
		} catch (SQLException e) {
			BaseDAO.closeConnection();
		}
		return account;
	}

	public boolean addAccount(String username, String passwordMd5, String phonenumber, String email) {
		int result = 0;
		try {

			String query = "{CALL addAccount(?,?,?,?)}";
			cstmt = con.prepareCall(query);
			cstmt.setString(1, username);
			cstmt.setString(2, passwordMd5);
			cstmt.setString(3, phonenumber);
			cstmt.setString(5, email);

			result = cstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDAO.closeConnection();
		}

		if (result > 0)
			return true;
		else
			return false;
	}
}

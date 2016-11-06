package model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dao.DataBase;
import model.bean.Account;

	public class AccountDao {
		private Connection con = null;
		private CallableStatement cstmt = null;
		private ResultSet rs = null;

		private ArrayList<Account> accounts = null;
		private Account account = null;
		DataBase db = new DataBase();

		public ArrayList<Account> getListAccount() {
			accounts = new ArrayList<Account>();
			try {
				con = DataBase.openConnection();
				String query = "{CALL getListAccount()}";
				cstmt = con.prepareCall(query);
				rs = cstmt.executeQuery();
				while (rs.next()) {
					account = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),
							rs.getString(5), rs.getBoolean(6));
					accounts.add(account);
				}
			} catch (SQLException e) {
				DataBase.closeConnection(this.con);
				DataBase.closePrepareStatement(cstmt);
				DataBase.closeResultSet(rs);
			}
			return accounts;
		}
		public boolean addAccount(String username, String password, String phoneNumber, String email, Boolean role) {
			int result = 0;
			try {
				con = DataBase.openConnection();
				String query = "{CALL addAccount(?,?,?,?,?)}";
				cstmt = con.prepareCall(query);
				cstmt.setString(1, username);
				cstmt.setString(2, password);
				cstmt.setString(3, phoneNumber);
				cstmt.setString(4, email);
				cstmt.setBoolean(5, role);

				result = cstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DataBase.closeConnection(this.con);
				DataBase.closePrepareStatement(cstmt);
				DataBase.closeResultSet(rs);
			}

			if (result > 0)
				return true;
			else
				return false;
		}

		public boolean delAccount(String idAccount) {

			int result = 0;
			try {
				con = DataBase.openConnection();
				String query = "{CALL delAccount(?)}";
				cstmt = con.prepareCall(query);
				cstmt.setString(1, idAccount);
				result = cstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DataBase.closeConnection(this.con);
				DataBase.closePrepareStatement(cstmt);
				DataBase.closeResultSet(rs);
			}

			if (result > 0)
				return true;
			else
				return false;
		}

		public Account getAccountDetail(String idAccount) {
			accounts = new ArrayList<Account>();
			try {
				con = DataBase.openConnection();
				String query = "{CALL getAccountDetail(?)}";
				cstmt = con.prepareCall(query);
				cstmt.setString(1, idAccount);
				rs = cstmt.executeQuery();
				while (rs.next()) {
					account = new Account(rs.getString(1),
							rs.getString(2), rs.getString(3), rs.getInt(4),
							rs.getString(5), rs.getBoolean(6));
				}
			} catch (SQLException e) {
				DataBase.closeConnection(this.con);
				DataBase.closePrepareStatement(cstmt);
				DataBase.closeResultSet(rs);
			}
			return account;
		}

	}

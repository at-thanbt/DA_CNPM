package model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Category;

public class CatDao {
	private Connection con = null;
	private CallableStatement cstmt = null;
	private ResultSet rs = null;

	private ArrayList<Category> categorys = null;
	private Category category = null;

	public ArrayList<Category> getListCat() {
		categorys = new ArrayList<Category>();
		try {
			con = DataBase.openConnection();
			String query = "{CALL getListCat()}";
			cstmt = con.prepareCall(query);
			rs = cstmt.executeQuery();
			while (rs.next()) {
				category = new Category(rs.getString(1), rs.getString(2));
				categorys.add(category);
			}
		} catch (SQLException e) {
			DataBase.closeConnection(this.con);
			DataBase.closePrepareStatement(cstmt);
			DataBase.closeResultSet(rs);
		}
		return categorys;
	}

	public boolean addCat(String nameCategory) {
		int result = 0;
		try {
			con = DataBase.openConnection();
			String query = "{CALL addCat(?)}";
			cstmt = con.prepareCall(query);
			cstmt.setString(1, nameCategory);
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

	public boolean delCat(String id) {
		int result = 0;
		try {
			con = DataBase.openConnection();
			String query = "{CALL delCat(?)}";
			cstmt = con.prepareCall(query);
			cstmt.setString(1, id);
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

	public Category getCatDetail(String idCat) {
		try {
			con = DataBase.openConnection();
			String query = "{CALL getCatDetail(?)}";
			cstmt = con.prepareCall(query);
			cstmt.setString(1, idCat);
			rs = cstmt.executeQuery();
			while (rs.next()) {
				category = new Category(rs.getString(1), rs.getString(2));
			}
		} catch (SQLException e) {
			DataBase.closeConnection(this.con);
			DataBase.closePrepareStatement(cstmt);
			DataBase.closeResultSet(rs);
		}

		return category;
	}
}

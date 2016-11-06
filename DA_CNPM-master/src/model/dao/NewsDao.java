package model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.News;

public class NewsDao {
	private Connection con = null;
	private CallableStatement cstmt = null;
	private ResultSet rs = null;

	private ArrayList<News> lisNew = null;
	private News news = null;

	public ArrayList<News> getListNews() {
		lisNew = new ArrayList<News>();

		try {
			con = DataBase.openConnection();
			String query = "{CALL getListNews()}";
			cstmt = con.prepareCall(query);
			rs = cstmt.executeQuery();
			while (rs.next()) {
				news = new News(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getBoolean(7), rs.getString(8), rs.getString(9), rs.getString(10));
				lisNew.add(news);
			}
		} catch (SQLException e) {
			DataBase.closeConnection(this.con);
			DataBase.closePrepareStatement(cstmt);
			DataBase.closeResultSet(rs);
		}

		return lisNew;
	}

	public boolean delNews(String id) {
		int result = 0;
		try {
			con = DataBase.openConnection();
			String query = "{CALL delNews(?)}";
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

	public News getNewsDetail(String idNews) {
		try {
			con = DataBase.openConnection();
			String query = "{CALL getBookingDetail(?)}";
			cstmt = con.prepareCall(query);
			cstmt.setString(1, idNews);
			System.out.println("id " + idNews);
			rs = cstmt.executeQuery();
			if (rs.next()) {
				news = new News(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getBoolean(7), rs.getString(8), rs.getString(9), rs.getString(10));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBase.closeConnection(this.con);
			DataBase.closePrepareStatement(cstmt);
			DataBase.closeResultSet(rs);
		}
		return news;
	}

	public boolean addNews(String idAccount, String title, String idCategory, String organization, boolean saleBuy,
			String cost, String photo, String address) {
		int result = 0;
		try {
			con = DataBase.openConnection();
			String query = "{CALL addNews(?,?,?,?,?,?,?,?)}";
			cstmt = con.prepareCall(query);
			cstmt.setString(1, idAccount);
			cstmt.setString(2, title);
			cstmt.setString(3, idCategory);
			cstmt.setString(4, organization);
			cstmt.setBoolean(5, saleBuy);
			cstmt.setString(6, cost);
			cstmt.setString(7, photo);
			cstmt.setString(8, address);

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

}

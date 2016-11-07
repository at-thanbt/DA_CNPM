package model.dao;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import jdk.internal.dynalink.beans.StaticClass;

public class BaseDAO {

	private static Connection con = null;
	static Statement st;
	static ResultSet rs;

	public static Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			String url = "jdbc:sqlserver://localhost\\SQL2008:1433;databaseName=DA_CNPM";

			con = DriverManager.getConnection(url, "sa", "gago267");
			st = con.createStatement();
		} catch (Exception e) {
			con = null;
			e.printStackTrace();
		}
		return con;
	}

	public static void closeConnection() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {

		}
	}

	public boolean isExcute(String sql) {
		getConnection();
		try {
			st.executeUpdate(sql);
			closeConnection();
			return true;
		} catch (SQLException e) {
			System.out.println(sql);
			closeConnection();
			return false;
		}

	}
}

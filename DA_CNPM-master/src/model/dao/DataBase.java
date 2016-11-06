package model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DataBase.java
 * 
 * Version 1.0
 * 
 * Date: August 13, 2015
 * 
 * Copyright
 * 
 * Modification Logs: DATE AUTHOR DESCRIPTION
 * -----------------------------------------------------------------------
 *November 7, 2015 Nhom2SVTT Create
 */

public class DataBase {

//	/*
//	 * databaseName : ten database
//	 */
	String databaseName = "DA_CNPM";
	String UserName = "sa";
	String PassWord = "buithithan";
	static Connection con;
	static Statement stm;
	ResultSet rs;

	/*
	 * ket noi toi database
	 */
	public static Connection openConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;databaseName=DA_CNPM",
					"sa", "123456");
			System.out.println("Ket Noi Thanh Cong Toi CSDL");
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			String url = "jdbc:sqlserver://localhost=1433;databaseName="
//					+databaseName+"?useUnicode=true&characterEncoding=UTF-8";
//			con = DriverManager.getConnection(url, UserName, PassWord);
//			System.out.println("ket noi thanh cong");
		} catch (ClassNotFoundException e) {
			System.out.println("ket noi loi");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("loi ket noi SQL");
		}
		try {
			stm = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	/*
	 * dong ket noi toi database
	 */
	public static void closeConnection() {
		try {
			stm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	/*
	 * thuc hien cau lenh select 
	 * du lieu tra ve kieu ResultSet neu that bai tra
	 * ve null
	 */
	public ResultSet getResultSet(String sql) {
		try {
			return stm.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("Loi truy van");
			return null;
		}
	}

	/*
	 * thuc hien cau lenh insert,update,delete 
	 * neu thanh cong ket qua tra ve la true 
	 * neu that bai ket qua tra ve la false
	 */
	public boolean updateData(String sql) {
		openConnection();
		Boolean temp = true;
		try {
			stm.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			temp = false;
		} finally {
			closeConnection();
		}
		return temp;
	}
	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.err.println("Can not close connection !");
			e.printStackTrace();
		}
	}

	public static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			System.err.println("Can not close ResultSet !");
			e.printStackTrace();
		}
	}

	public static void closePrepareStatement(PreparedStatement pstmt) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			System.err.println("Can not close PreparedStatement  !");
			e.printStackTrace();
		}
	}

	public static void closeCallableStatement(CallableStatement cstmt) {
		try {
			if (cstmt != null) {
				cstmt.close();
			}
		} catch (SQLException e) {
			System.err.println("Can not close CallableStatement  !");
			e.printStackTrace();
		}
	}
}

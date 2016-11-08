package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DoiMatKhauDAO {
	private Connection con = null;
	private Statement st = null;

	BaseDAO bd = new BaseDAO();

	public boolean checkdoi(String userName, String matkhaucu, String matkhaumoi1, String matkhaumoi2) {
		try {
			con = bd.getConnection();
			st = con.createStatement();
			String sql = "SELECT password  FROM Account  where username = '" + userName + "'";
			ResultSet rs = st.executeQuery(sql);
			String tam = "";
			while (rs.next()) {
				tam = rs.getString("password");
			}
			if (!(tam.equals(matkhaucu))) {
				return false;
			}
			con.close();
			st.close();
		} catch (Exception e) {
			System.out.print(e);
		}
		if ("".equals(matkhaucu) || "".equals(matkhaumoi1) || "".equals(matkhaumoi2)) {
			return false;
		}
		if (!(matkhaumoi1.equals(matkhaumoi2))) {
			return false;
		} else {
			try {
				con = bd.getConnection();
				st = con.createStatement();
				String sql;
				sql = "UPDATE Account SET password ='" + matkhaumoi1 + "' WHERE username='" + userName + "'";
				System.out.println(sql + "sql2");
				st.executeUpdate(sql);
				st.close();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.print(e);
			}
			return true;
		}
	}

}

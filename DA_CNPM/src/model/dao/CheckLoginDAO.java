package model.dao;

import java.sql.*;




public class CheckLoginDAO extends BaseDAO {

	public boolean isValidAccount(String userName, String password) throws ClassNotFoundException {
		try
		{
			Connection conn = this.getConnection();
			Statement st= conn.createStatement();
			String sql = "SELECT * FROM Account ";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				if(userName.equals(rs.getString("username"))&&password.equals(rs.getString("password")))
					return true;
			}
			return false;
		}catch(SQLException e)
		{System.out.println("Loi thao tac CSDL " +e.getMessage());
		}
		return false;
	}


	public static void main(String[] args) throws ClassNotFoundException
	{
		CheckLoginDAO ten = new CheckLoginDAO();
		if(ten.isValidAccount("admin", "admin"))
			System.out.println("true");
		else
			System.out.print("false");
	}
			
	
}

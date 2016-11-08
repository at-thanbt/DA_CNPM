package model.bo;

import model.dao.DoiMatKhauDAO;

public class DoiMatKhauBO {
    DoiMatKhauDAO mkDao = new DoiMatKhauDAO();
	public boolean checkdoi(String userName, String matkhaucu, String matkhaumoi1, String matkhaumoi2) {
		return mkDao.checkdoi(userName,matkhaucu,matkhaumoi1,matkhaumoi2);
	}
}

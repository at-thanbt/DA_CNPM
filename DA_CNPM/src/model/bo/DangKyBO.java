package model.bo;

import model.bean.Account;
import model.dao.DangKyDao;

public class DangKyBO {
	DangKyDao DangKyDao = new DangKyDao();

	public Account getUserByUserName(String username) {
		return DangKyDao.getUser(username);
	}

	public boolean addAccount(String idAccount,String username, String password, String phonenumber, String email,Boolean role) {
		return DangKyDao.addAccount(idAccount,username, password, phonenumber, email,role);
	}
}

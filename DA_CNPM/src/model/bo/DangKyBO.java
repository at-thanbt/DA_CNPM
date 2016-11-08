package model.bo;

import model.bean.Account;
import model.dao.DangKyDao;

public class DangKyBO {
	DangKyDao DangKyDao = new DangKyDao();

	public Account getUserByUserName(String username) {
		return DangKyDao.getUserByUserName(username);
	}

	public boolean addAccount(String idAccount,String username, String passwordMd5, String phonenumber, String email) {
		return DangKyDao.addAccount(idAccount,username, passwordMd5, phonenumber, email);
	}
}

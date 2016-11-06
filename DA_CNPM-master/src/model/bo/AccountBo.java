package model.bo;

import java.util.ArrayList;

import model.bean.Account;
import model.dao.AccountDao;

public class AccountBo {
	AccountDao AccountDAO = new AccountDao();

	public ArrayList<Account> getListAccount() {
		return AccountDAO.getListAccount();
	}

	public boolean addAccount(String username, String password,
			String phoneNumber,String email,Boolean role) {
		return AccountDAO.addAccount(username, password, phoneNumber,email,role);

	}

	public boolean delAccount(String id) {
		return AccountDAO.delAccount(id);
	}

	public Account getAccountDetail(String idAccount) {
		return AccountDAO.getAccountDetail(idAccount);
	}
}

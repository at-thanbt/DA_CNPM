package model.bo;

import java.util.ArrayList;

import model.bean.Category;
import model.dao.CatDao;

public class CategoryBo {
	CatDao catDAO = new CatDao();

	public ArrayList<Category> getListCat() {
		return catDAO.getListCat();
	}

	public boolean addCat(String nameCat) {
		return catDAO.addCat(nameCat);
	}

	public boolean delCat(String id) {
		return catDAO.delCat(id);
	}

	public Category getCatDetail(String idCat) {
		return catDAO.getCatDetail(idCat);
	}

}

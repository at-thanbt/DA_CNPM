package model.bo;

import java.util.ArrayList;

import model.bean.News;
import model.dao.NewsDao;

public class NewsBo {

	NewsDao newsDAO = new NewsDao();

	public ArrayList<News> getListBooking() {
		return newsDAO.getListNews();
	}

	public boolean addNews(String idAccount, String title, String idCategory, String organization, boolean saleBuy, String cost, String photo  ,String address) {
		return newsDAO
				.addNews(idAccount, title,idCategory,organization,saleBuy,cost,photo,address);
	}

	public boolean delNews(String id) {
		return newsDAO.delNews(id);
	}

	public News getNewsDetail(String idNews) {
		System.out.println("BO");
		return newsDAO.getNewsDetail(idNews);
	}

}

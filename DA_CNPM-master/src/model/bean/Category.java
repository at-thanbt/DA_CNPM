package model.bean;

public class Category {
	private String idCategory;
	private String nameCat;

	public Category(String idCategory, String nameCat) {
		super();
		this.idCategory = idCategory;
		this.nameCat = nameCat;
	}

	public Category() {
		super();
	}

	public String getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(String idCategory) {
		this.idCategory = idCategory;
	}

	public String getNameCat() {
		return nameCat;
	}

	public void setNameCat(String nameCat) {
		this.nameCat = nameCat;
	}

}

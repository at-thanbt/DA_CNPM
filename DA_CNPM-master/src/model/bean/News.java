package model.bean;

public class News {
	private String idNew;
	private String idAccount;
	private String title;
	private String content;
	private String idCategory;
	private String organization;
	private Boolean saleBuy;
	private String cost;
	private String photo;
	private String address;

	public News(String idNew, String idAccount, String title, String content, String idCategory, String organization,
			Boolean saleBuy, String cost, String photo, String address) {
		super();
		this.idNew = idNew;
		this.idAccount = idAccount;
		this.title = title;
		this.content = content;
		this.idCategory = idCategory;
		this.organization = organization;
		this.saleBuy = saleBuy;
		this.cost = cost;
		this.photo = photo;
		this.address = address;
	}

	public News() {
		super();
	}

	public String getIdNew() {
		return idNew;
	}

	public void setIdNew(String idNew) {
		this.idNew = idNew;
	}

	public String getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(String idCategory) {
		this.idCategory = idCategory;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public Boolean getSaleBuy() {
		return saleBuy;
	}

	public void setSaleBuy(Boolean saleBuy) {
		this.saleBuy = saleBuy;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

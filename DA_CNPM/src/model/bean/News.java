package model.bean;

public class News {
	private String idnew;
	private String idAccount;
	private String title;
	private String content;
	private String idcategory;
	private Boolean organization;
	private Boolean saleBuy;
	private String cost;
	private String photo;
	private String address;

	public News(String idnew, String idAccount, String title, String content, String idcategory, Boolean organization,
			Boolean saleBuy, String cost, String photo, String address) {
		super();
		this.idnew = idnew;
		this.idAccount = idAccount;
		this.title = title;
		this.content = content;
		this.idcategory = idcategory;
		this.organization = organization;
		this.saleBuy = saleBuy;
		this.cost = cost;
		this.photo = photo;
		this.address = address;
	}

	public News() {
		super();
	}

	public String getIdnew() {
		return idnew;
	}

	public void setIdnew(String idnew) {
		this.idnew = idnew;
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

	public String getIdcategory() {
		return idcategory;
	}

	public void setIdcategory(String idcategory) {
		this.idcategory = idcategory;
	}

	public Boolean getOrganization() {
		return organization;
	}

	public void setOrganization(Boolean organization) {
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

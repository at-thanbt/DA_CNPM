package model.bean;

public class Advertisement {
	private String idAdvert;
	private String nameAdvert;
	private String link;
	private String photo;
	private String idAccount;

	public Advertisement(String idAdvert, String nameAdvert, String link, String photo, String idAccount) {
		super();
		this.idAdvert = idAdvert;
		this.nameAdvert = nameAdvert;
		this.link = link;
		this.photo = photo;
		this.idAccount = idAccount;
	}

	public Advertisement() {
		super();
	}

	public String getIdAdvert() {
		return idAdvert;
	}

	public void setIdAdvert(String idAdvert) {
		this.idAdvert = idAdvert;
	}

	public String getNameAdvert() {
		return nameAdvert;
	}

	public void setNameAdvert(String nameAdvert) {
		this.nameAdvert = nameAdvert;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(String idAccount) {
		this.idAccount = idAccount;
	}
}

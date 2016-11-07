package model.bean;

public class CategoryDetail {
	private String idCatDetail;
	private String nameDetail;
	private String idCategory;

	public CategoryDetail(String idCatDetail, String nameDetail, String idCategory) {
		super();
		this.idCatDetail = idCatDetail;
		this.nameDetail = nameDetail;
		this.idCategory = idCategory;
	}

	public CategoryDetail() {
		super();
	}

	public String getIdCatDetail() {
		return idCatDetail;
	}

	public void setIdCatDetail(String idCatDetail) {
		this.idCatDetail = idCatDetail;
	}

	public String getNameDetail() {
		return nameDetail;
	}

	public void setNameDetail(String nameDetail) {
		this.nameDetail = nameDetail;
	}

	public String getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(String idCategory) {
		this.idCategory = idCategory;
	}

}

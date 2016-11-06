package model.bean;

public class CheckNew {
	private String idCheck;
	private String idNew;
	private Boolean status;

	public CheckNew(String idCheck, String idNew, Boolean status) {
		super();
		this.idCheck = idCheck;
		this.idNew = idNew;
		this.status = status;
	}

	public CheckNew() {
		super();
	}

	public String getIdCheck() {
		return idCheck;
	}

	public void setIdCheck(String idCheck) {
		this.idCheck = idCheck;
	}

	public String getIdNew() {
		return idNew;
	}

	public void setIdNew(String idNew) {
		this.idNew = idNew;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}

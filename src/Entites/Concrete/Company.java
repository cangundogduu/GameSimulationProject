package Entites.Concrete;

public class Company {
	private int id;
	private String companyName;
	private int companySale;
	
	
	public Company(int id, String companyName, int companySale) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.companySale = companySale;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getCompanySale() {
		return companySale;
	}
	public void setCompanySale(int companySale) {
		this.companySale = companySale;
	}
}

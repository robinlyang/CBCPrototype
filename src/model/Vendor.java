package model;

public class Vendor {
	//Attributes
	private boolean status = false;
	private String vendor = "";
	
	//Constructors
	public Vendor() {
		super();
	}
	public Vendor(boolean status, String vendor) {
		super();
		this.status = status;
		this.vendor = vendor;
	}
	
	//Getters and Setters
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
}

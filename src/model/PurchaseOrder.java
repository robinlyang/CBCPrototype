package model;

import java.util.ArrayList;
import java.util.Date;

public class PurchaseOrder {
	//Attributes
	private Vendor vendor;
	private Customer customer; 	//drop ship to
	private Date purchaseOrderDate;
	private String purchaseOrder;
	private double subTotal;
	private double total;
	private String memo;
	private ArrayList<Item> itemList;
	
	
	//Constructors
	public PurchaseOrder() {
		super();
	}

	public PurchaseOrder(Vendor vendor, Customer customer, Date purchaseOrderDate, String purchaseOrder,
			double subTotal, double total, String memo, ArrayList<Item> itemList) {
		super();
		this.vendor = vendor;
		this.customer = customer;
		this.purchaseOrderDate = purchaseOrderDate;
		this.purchaseOrder = purchaseOrder;
		this.subTotal = subTotal;
		this.total = total;
		this.memo = memo;
		this.itemList = itemList;
	}

	//Getters and Setters
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getPurchaseOrderDate() {
		return purchaseOrderDate;
	}
	public void setPurchaseOrderDate(Date purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}
	public String getPurchaseOrder() {
		return purchaseOrder;
	}
	public void setPurchaseOrder(String purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}

}

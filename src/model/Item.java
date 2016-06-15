package model;

public class Item {
	//Attributes
	private boolean status;
	private ItemType type;
	private String item;
	private String description;
	private String purchaseDescription;
	private double quantityOnHand;
	private double cost;
	private Vendor preferredVendor;
	private double price;
	private double grossPrice;
	private boolean amountIncludesTax;
	private double reorderMinimum;
	private boolean purchasedForResale;
	private Equipment equipment;     
	
	//Constructors
	public Item() {
		super();
	}
	
	public Item(boolean status, ItemType type, String item, String description, String purchaseDescription,
			double quantityOnHand, double cost, Vendor preferredVendor, double price, double grossPrice,
			boolean amountIncludesTax, double reorderMinimum, boolean purchasedForResale, Equipment equipment) {
		super();
		this.status = status;
		this.type = type;
		this.item = item;
		this.description = description;
		this.purchaseDescription = purchaseDescription;
		this.quantityOnHand = quantityOnHand;
		this.cost = cost;
		this.preferredVendor = preferredVendor;
		this.price = price;
		this.grossPrice = grossPrice;
		this.amountIncludesTax = amountIncludesTax;
		this.reorderMinimum = reorderMinimum;
		this.purchasedForResale = purchasedForResale;
		this.equipment = equipment;
	}
	
	//Getters and Setters
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public ItemType getType() {
		return type;
	}
	public void setType(ItemType type) {
		this.type = type;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPurchaseDescription() {
		return purchaseDescription;
	}
	public void setPurchaseDescription(String purchaseDescription) {
		this.purchaseDescription = purchaseDescription;
	}
	public double getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(double quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Vendor getPreferredVendor() {
		return preferredVendor;
	}
	public void setPreferredVendor(Vendor preferredVendor) {
		this.preferredVendor = preferredVendor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getGrossPrice() {
		return grossPrice;
	}
	public void setGrossPrice(double grossPrice) {
		this.grossPrice = grossPrice;
	}
	public boolean isAmountIncludesTax() {
		return amountIncludesTax;
	}
	public void setAmountIncludesTax(boolean amountIncludesTax) {
		this.amountIncludesTax = amountIncludesTax;
	}
	public double getReorderMinimum() {
		return reorderMinimum;
	}
	public void setReorderMinimum(double reorderMinimum) {
		this.reorderMinimum = reorderMinimum;
	}
	public boolean isPurchasedForResale() {
		return purchasedForResale;
	}
	public void setPurchasedForResale(boolean purchasedForResale) {
		this.purchasedForResale = purchasedForResale;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
}

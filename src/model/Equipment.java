package model;

import java.util.Date;

public class Equipment {
	//Attributes
	private Date issueingDate;
	private Date purchaseDate;
	private String equipmentMake;
	private String equipmentModel;
	private String serialNumber;
	private String equipment_ToolType;
	private String buildingLocation;
	private int quantity;
	private String remarks;
	private Date dateProcured;	
	
	//Constructors

	public Equipment() {
		super();
	}
	public Equipment(Date issueingDate, Date purchaseDate, String equipmentMake, String equipmentModel,
			String serialNumber, String equipment_ToolType, String buildingLocation, int quantity, String remarks,
			Date dateProcured) {
		super();
		this.issueingDate = issueingDate;
		this.purchaseDate = purchaseDate;
		this.equipmentMake = equipmentMake;
		this.equipmentModel = equipmentModel;
		this.serialNumber = serialNumber;
		this.equipment_ToolType = equipment_ToolType;
		this.buildingLocation = buildingLocation;
		this.quantity = quantity;
		this.remarks = remarks;
		this.dateProcured = dateProcured;
	}
	
	//Getters and Setters
	public Date getIssueingDate() {
		return issueingDate;
	}
	public void setIssueingDate(Date issueingDate) {
		this.issueingDate = issueingDate;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getEquipmentMake() {
		return equipmentMake;
	}
	public void setEquipmentMake(String equipmentMake) {
		this.equipmentMake = equipmentMake;
	}
	public String getEquipementModel() {
		return equipmentModel;
	}
	public void setEquipementModel(String equipementModel, String equipmentModel) {
		this.equipmentModel = equipmentModel;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getEquipment_ToolType() {
		return equipment_ToolType;
	}
	public void setEquipment_ToolType(String equipment_ToolType) {
		this.equipment_ToolType = equipment_ToolType;
	}
	public String getBuildingLocation() {
		return buildingLocation;
	}
	public void setBuildingLocation(String buildingLocation) {
		this.buildingLocation = buildingLocation;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getDateProcured() {
		return dateProcured;
	}
	public void setDateProcured(Date dateProcured) {
		this.dateProcured = dateProcured;
	}

}

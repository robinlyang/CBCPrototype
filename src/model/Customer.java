package model;

import java.util.Date;

public class Customer {
	//Attributes
	private boolean status; 			// 1 byte
	private String customer;			// 22 bytes
	private String currency;			// 22 bytes
	private double balance;				// 8 bytes
	private double totalBalance;		// 8 bytes
	private String company;				// 22 bytes
	private String title;				// 22 bytes			//Mr. Mrs. Miss
	private String firstName;			// 22 bytes	
	private String middleInitial;		// 22 bytes	
	private String lastName;			// 22 bytes	
	private String primaryContact;		// 22 bytes	
	private String mainPhone;			// 22 bytes	
	private String fax;					// 22 bytes	
	private String alternativePhone;	// 22 bytes	
	private String secondaryContact;	// 22 bytes	
	private String jobTitle;			// 22 bytes	
	private String mainEmail;			// 22 bytes	
	private String invoiceToOne;		// 22 bytes	
	private String invoiceToTwo;		// 22 bytes	
	private String invoiceToThree;		// 22 bytes	
	private String invoiceToFour;		// 22 bytes	
	private String invoiceToFive;		// 22 bytes	
	private String shipToOne;			// 22 bytes	
	private String shipToTwo;			// 22 bytes	
	private String shipToThree;			// 22 bytes	
	private String shipToFour;			// 22 bytes	
	private String shipToFive;			// 22 bytes	
	private String customerType;		// 22 bytes	
	private String terms;				// 22 bytes	
	private String rep;					// 22 bytes	
	private String salesTaxCode;		// 22 bytes	
	private String taxCountry;			// 22 bytes	
	private String businessNumber;		// 22 bytes	
	private String accountNumber;		// 22 bytes	
	private String creditLimit;			// 22 bytes	
	private String jobStatus;			// 22 bytes	
	private String jobType;				// 22 bytes	
	private String jobDescription;		// 22 bytes	
	here
	private Date startDate;				//TODO Find byte size of Date
	private Date projectedEnd;
	private Date endDate;
	
	//Constructors
	public Customer() {
		super();
	}

	public Customer(boolean status, String customer, String currency, double balance, double totalBalance,
			String company, String title, String firstName, String middleInitial, String lastName,
			String primaryContact, String mainPhone, String fax, String alternativePhone, String secondaryContact,
			String jobTitle, String mainEmail, String invoiceToOne, String invoiceToTwo, String invoiceToThree,
			String invoiceToFour, String invoiceToFive, String shipToOne, String shipToTwo, String shipToThree,
			String shipToFour, String shipToFive, String customerType, String terms, String rep, String salesTaxCode,
			String taxCountry, String businessNumber, String accountNumber, String creditLimit, String jobStatus,
			String jobType, String jobDescription, Date startDate, Date projectedEnd, Date endDate) {
		super();
		this.status = status;
		this.customer = customer;
		this.currency = currency;
		this.balance = balance;
		this.totalBalance = totalBalance;
		this.company = company;
		this.title = title;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.primaryContact = primaryContact;
		this.mainPhone = mainPhone;
		this.fax = fax;
		this.alternativePhone = alternativePhone;
		this.secondaryContact = secondaryContact;
		this.jobTitle = jobTitle;
		this.mainEmail = mainEmail;
		this.invoiceToOne = invoiceToOne;
		this.invoiceToTwo = invoiceToTwo;
		this.invoiceToThree = invoiceToThree;
		this.invoiceToFour = invoiceToFour;
		this.invoiceToFive = invoiceToFive;
		this.shipToOne = shipToOne;
		this.shipToTwo = shipToTwo;
		this.shipToThree = shipToThree;
		this.shipToFour = shipToFour;
		this.shipToFive = shipToFive;
		this.customerType = customerType;
		this.terms = terms;
		this.rep = rep;
		this.salesTaxCode = salesTaxCode;
		this.taxCountry = taxCountry;
		this.businessNumber = businessNumber;
		this.accountNumber = accountNumber;
		this.creditLimit = creditLimit;
		this.jobStatus = jobStatus;
		this.jobType = jobType;
		this.jobDescription = jobDescription;
		this.startDate = startDate;
		this.projectedEnd = projectedEnd;
		this.endDate = endDate;
	}
	
	//Getters and Setters	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	public String getMainPhone() {
		return mainPhone;
	}
	public void setMainPhone(String mainPhone) {
		this.mainPhone = mainPhone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getAlternativePhone() {
		return alternativePhone;
	}
	public void setAlternativePhone(String alternativePhone) {
		this.alternativePhone = alternativePhone;
	}
	public String getSecondaryContact() {
		return secondaryContact;
	}
	public void setSecondaryContact(String secondaryContact) {
		this.secondaryContact = secondaryContact;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getMainEmail() {
		return mainEmail;
	}
	public void setMainEmail(String mainEmail) {
		this.mainEmail = mainEmail;
	}
	public String getInvoiceToOne() {
		return invoiceToOne;
	}
	public void setInvoiceToOne(String invoiceToOne) {
		this.invoiceToOne = invoiceToOne;
	}
	public String getInvoiceToTwo() {
		return invoiceToTwo;
	}
	public void setInvoiceToTwo(String invoiceToTwo) {
		this.invoiceToTwo = invoiceToTwo;
	}
	public String getInvoiceToThree() {
		return invoiceToThree;
	}
	public void setInvoiceToThree(String invoiceToThree) {
		this.invoiceToThree = invoiceToThree;
	}
	public String getInvoiceToFour() {
		return invoiceToFour;
	}
	public void setInvoiceToFour(String invoiceToFour) {
		this.invoiceToFour = invoiceToFour;
	}
	public String getInvoiceToFive() {
		return invoiceToFive;
	}
	public void setInvoiceToFive(String invoiceToFive) {
		this.invoiceToFive = invoiceToFive;
	}
	public String getShipToOne() {
		return shipToOne;
	}
	public void setShipToOne(String shipToOne) {
		this.shipToOne = shipToOne;
	}
	public String getShipToTwo() {
		return shipToTwo;
	}
	public void setShipToTwo(String shipToTwo) {
		this.shipToTwo = shipToTwo;
	}
	public String getShipToThree() {
		return shipToThree;
	}
	public void setShipToThree(String shipToThree) {
		this.shipToThree = shipToThree;
	}
	public String getShipToFour() {
		return shipToFour;
	}
	public void setShipToFour(String shipToFour) {
		this.shipToFour = shipToFour;
	}
	public String getShipToFive() {
		return shipToFive;
	}
	public void setShipToFive(String shipToFive) {
		this.shipToFive = shipToFive;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public String getRep() {
		return rep;
	}
	public void setRep(String rep) {
		this.rep = rep;
	}
	public String getSalesTaxCode() {
		return salesTaxCode;
	}
	public void setSalesTaxCode(String salesTaxCode) {
		this.salesTaxCode = salesTaxCode;
	}
	public String getTaxCountry() {
		return taxCountry;
	}
	public void setTaxCountry(String taxCountry) {
		this.taxCountry = taxCountry;
	}
	public String getBusinessNumber() {
		return businessNumber;
	}
	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getProjectedEnd() {
		return projectedEnd;
	}
	public void setProjectedEnd(Date projectedEnd) {
		this.projectedEnd = projectedEnd;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	

}

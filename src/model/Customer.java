package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Customer {
	//Attributes
	private long customerID;			// 8 bytes			
	private boolean status; 			// 1 byte				9
	private String customer;			// 39 + 2 bytes			50
	private String currency;			// 3 + 2 bytes			55
	private double balance;				// 8 bytes				63
	private double totalBalance;		// 8 bytes				71
	private String company;				// 27 + 2 bytes			100
	private String title;				// 23 + 2 bytes			125		//Mr. Mrs. Miss
	private String firstName;			// 23 + 2 bytes			150
	private String middleInitial;		// 23 + 2 bytes			175
	private String lastName;			// 23 + 2 bytes			200
	private String primaryContact;		// 23 + 2 bytes			225
	private String mainPhone;			// 23 + 2 bytes			250
	private String fax;					// 23 + 2 bytes			275
	private String alternativePhone;	// 23 + 2 bytes			300
	private String secondaryContact;	// 23 + 2 bytes			325
	private String jobTitle;			// 23 + 2 bytes			350
	private String mainEmail;			// 23 + 2 bytes			375
	private String invoiceToOne;		// 23 + 2 bytes			400
	private String invoiceToTwo;		// 23 + 2 bytes			425
	private String invoiceToThree;		// 23 + 2 bytes			450
	private String invoiceToFour;		// 23 + 2 bytes			475
	private String invoiceToFive;		// 23 + 2 bytes			500
	private String shipToOne;			// 23 + 2 bytes			525
	private String shipToTwo;			// 23 + 2 bytes			550
	private String shipToThree;			// 23 + 2 bytes			575
	private String shipToFour;			// 23 + 2 bytes			600
	private String shipToFive;			// 23 + 2 bytes			625
	private String customerType;		// 23 + 2 bytes			650
	private String terms;				// 23 + 2 bytes			675
	private String rep;					// 23 + 2 bytes			700
	private String salesTaxCode;		// 23 + 2 bytes			725
	private String taxCountry;			// 23 + 2 bytes			750
	private String businessNumber;		// 23 + 2 bytes			775
	private String accountNumber;		// 23 + 2 bytes			800
	private String creditLimit;			// 23 + 2 bytes			825
	private String jobStatus;			// 23 + 2 bytes			850
	private String jobType;				// 23 + 2 bytes			875
	private String jobDescription;		// 23 + 2 bytes			900
	private Date startDate;				// 32 bytes				932
	private Date projectedEnd;			// 32 bytes				964
	private Date endDate;				// 32 bytes				996
	
	//Constructors
	/**
	 * Creates and instance of this object with default values.
	 */
	public Customer() 
	{
		super();
		this.status = true;
	}
	
	/**
	 * Creates an instance of a Customer object with a specified list of initial 
	 * values abed on the string input.
	 * @param line - Contains a complete set of client information.
	 */
	public Customer(String line)
	{
		StringTokenizer token = new StringTokenizer(line, ";");
		this.customerID = Long.parseLong(token.nextToken());
		this.status = Boolean.valueOf(token.nextToken());
		this.customer = token.nextToken();
		this.currency = token.nextToken();
		this.balance = Double.parseDouble(token.nextToken());
		this.totalBalance = Double.parseDouble(token.nextToken());
		this.company = token.nextToken();
		this.title = token.nextToken();
		this.firstName = token.nextToken();
		this.middleInitial = token.nextToken();
		this.lastName = token.nextToken();
		this.primaryContact = token.nextToken();
		this.mainPhone = token.nextToken();
		this.fax = token.nextToken();
		this.alternativePhone = token.nextToken();
		this.secondaryContact = token.nextToken();
		this.jobTitle  = token.nextToken();
		this.mainEmail = token.nextToken();
		this.invoiceToOne = token.nextToken();
		this.invoiceToTwo = token.nextToken();
		this.invoiceToThree = token.nextToken();
		this.invoiceToFour = token.nextToken();
		this.invoiceToFive = token.nextToken();
		this.shipToOne = token.nextToken();
		this.shipToTwo = token.nextToken();
		this.shipToThree = token.nextToken();
		this.shipToFour = token.nextToken();
		this.shipToFive = token.nextToken();
		this.customerType = token.nextToken();
		this.terms = token.nextToken();
		this.rep = token.nextToken();
		this.salesTaxCode = token.nextToken();
		this.taxCountry = token.nextToken();
		this.businessNumber = token.nextToken();
		this.accountNumber = token.nextToken();
		this.creditLimit = token.nextToken();
		this.jobStatus = token.nextToken();
		this.jobType = token.nextToken();
		this.jobDescription = token.nextToken();
		SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
		try 
		{
			this.startDate = formatter.parse(token.nextToken());
			this.projectedEnd = formatter.parse(token.nextToken());
			this.endDate = formatter.parse(token.nextToken());
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Creates an instance of a Customer object with a specified list of initial 
	 * values based on the string input.
	 * @param customerID - The customer's ID number
	 * @param status - The customer's status
	 * @param customer - The customer
	 * @param currency - The customer's currency
	 * @param balance - The customer's balance
	 * @param totalBalance - The customer's total balance
	 * @param company - The customer's company
	 * @param title - The customer's title
	 * @param firstName - The customer's first name
	 * @param middleInitial - The customer's middle initial
	 * @param lastName - The customer's last name
	 * @param primaryContact - The customer's primary contact
	 * @param mainPhone - The customer's main phone number
	 * @param fax - The customer's fax number
	 * @param alternativePhone - The customer's alternative phone number
	 * @param secondaryContact - The customer's secondary phone number
	 * @param jobTitle - The customer's job title
	 * @param mainEmail - The customer's main email
	 * @param invoiceToOne - The customer's invoice line one
	 * @param invoiceToTwo - The customer's invoice line two
	 * @param invoiceToThree - The customer's invoice line three
	 * @param invoiceToFour - The customer's invoice line four
	 * @param invoiceToFive - The customer's invoice line five
	 * @param shipToOne - The customer's ship line one 
	 * @param shipToTwo - The customer's ship line two
	 * @param shipToThree - The customer's ship line three
	 * @param shipToFour - The customer's ship line four
	 * @param shipToFive - The customer's ship line five
	 * @param customerType - The customer's type
	 * @param terms - The customer's terms
	 * @param rep - The customer's representative
	 * @param salesTaxCode - The customer's sales tax code
	 * @param taxCountry - The customer's tax country
	 * @param businessNumber - The customer's business number
	 * @param accountNumber - The customer's account number
	 * @param creditLimit - The customer's credit limit
	 * @param jobStatus - The customer's job status
	 * @param jobType - The customer's job type
	 * @param jobDescription - The customer's job description
	 * @param startDate - The customer's start date
	 * @param projectedEnd - The customer's projected end date
	 * @param endDate - The customer's end date
	 */
	public Customer(long customerID, boolean status, String customer, String currency, double balance, double totalBalance,
			String company, String title, String firstName, String middleInitial, String lastName,
			String primaryContact, String mainPhone, String fax, String alternativePhone, String secondaryContact,
			String jobTitle, String mainEmail, String invoiceToOne, String invoiceToTwo, String invoiceToThree,
			String invoiceToFour, String invoiceToFive, String shipToOne, String shipToTwo, String shipToThree,
			String shipToFour, String shipToFive, String customerType, String terms, String rep, String salesTaxCode,
			String taxCountry, String businessNumber, String accountNumber, String creditLimit, String jobStatus,
			String jobType, String jobDescription, Date startDate, Date projectedEnd, Date endDate) {
		super();
		this.customerID = customerID;
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
	public long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	
	

}

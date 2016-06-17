package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Customer;

public class CustomerBroker extends RandomAccessFile
{

	//Constants
	private static final String RANDOM_FILE = "res/customers.bin";
	private static final String INPUT_FILE = "res/customers.txt";
	private static final String MODE = "rwd";
	private static CustomerBroker customerBroker;
	private long highId;
	
	//Constructors
	/**
	 * Constructor is called only when the getBroker method is called.
	 * @throws FileNotFoundException - Throw when the RandomAccessFile 
	 * is not found on the path.
	 */
	public CustomerBroker() throws FileNotFoundException 
	{
		super(RANDOM_FILE, MODE);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Method controls generation of CustomerBroker reference by 
	 * checking to see if the object already exists in memory.  Part 
	 * of the Singleton Design pattern.
	 * @return A reference to the current existing broker or a newly 
	 * created broker of type CustomerBroker.
	 */
	public static CustomerBroker getBroker()
	{
		File file = new File("res/clients.bin");
		try	
		{
			if (file.exists())
			{
				if(customerBroker == null) 
				{
					customerBroker = new CustomerBroker();
				}
				customerBroker.findHighestCurrentId();
			}
			else
			{
				if(customerBroker == null)
				{
					customerBroker = new CustomerBroker();
				}
				customerBroker.loadCustomerBinaryFile();
				customerBroker.findHighestCurrentId();
			}
				
				
		}
		catch (FileNotFoundException e)
		{
			System.out.print("The File was not found");
		}
		return customerBroker;
	}

	//Operational Methods
	/**
	 * Method to search the Customer RandomAccessFile back end allowing a 
	 * search to be carried out based on customer attributes.
	 * @param o - an Object of type Customer containing the search value of
	 * the item to search for.
	 * @return a List of Customer objects matching the search criteria that 
	 * are passed on the GUI front end.  The List is originally created by 
	 * the back end as an ArrayList and returned as a List.
	 */
	public List search(Object o)
	{
		Customer customer = (Customer)o;
		ArrayList list = new ArrayList();
		if(customer.isStatus())
		{
			return searchStatus(list, customer.isStatus());
		}
		if(customer.getCustomer() != null)
		{
			return searchCustomer(list, customer.getCustomer());
		}
		if(customer.getCurrency() != null)
		{
			return searchCurrency(list, customer.getCurrency());
		}
		if((Double)customer.getBalance() != null)
		{
			return searchBalance(list, customer.getBalance());
		}
		if((Double)customer.getTotalBalance() != null)
		{
			return searchTotalBalance(list, customer.getTotalBalance());
		}
		if(customer.getCompany() != null)
		{
			return searchCompany(list, customer.getCompany());
		}
		if(customer.getTitle() != null)
		{
			return searchTitle(list, customer.getTitle());
		}
		if(customer.getFirstName() != null)
		{
			return searchFirstName(list, customer.getFirstName());
		}
		if(customer.getMiddleInitial() != null)
		{
			return searchMiddleInitial(list, customer.getMiddleInitial());
		}
		if(customer.getLastName() != null)
		{
			return searchLastName(list, customer.getLastName());
		}
		if(customer.getPrimaryContact() != null)
		{
			return searchPrimaryContact(list, customer.getPrimaryContact());
		}
		if(customer.getMainPhone() != null)
		{
			return searchMainPhone(list, customer.getMainPhone());
		}
		if(customer.getFax() != null)
		{
			return searchFax(list, customer.getFax());
		}
		if(customer.getAlternativePhone() != null)
		{
			return searchAlternativePhone(list, customer.getAlternativePhone());
		}
		if(customer.getSecondaryContact() != null)
		{
			return searchSecondaryContact(list, customer.getSecondaryContact());
		}
		if(customer.getJobTitle() != null)
		{
			return searchJobTitle(list, customer.getJobTitle());
		}
		if(customer.getMainEmail() != null)
		{
			return searchMainEmail(list, customer.getMainEmail());
		}
		if(customer.getInvoiceToOne() != null)
		{
			return searchInvoiceToOne(list, customer.getInvoiceToOne());
		}
		if(customer.getInvoiceToTwo() != null)
		{
			return searchInvoiceToTwo(list, customer.getInvoiceToTwo());
		}
		if(customer.getInvoiceToThree() != null)
		{
			return searchInvoiceToThree(list, customer.getInvoiceToThree());
		}
		if(customer.getInvoiceToFour() != null)
		{
			return searchInvoiceToFour(list, customer.getInvoiceToFour());
		}
		if(customer.getInvoiceToFive() != null)
		{
			return searchInvoiceToFive(list, customer.getInvoiceToFive());
		}
		if(customer.getShipToOne() != null)
		{
			return searchShipToOne(list, customer.getShipToOne());
		}
		if(customer.getShipToTwo() != null)
		{
			return searchShipToTwo(list, customer.getShipToTwo());
		}
		if(customer.getShipToThree() != null)
		{
			return searchShipToThree(list, customer.getShipToThree());
		}
		if(customer.getShipToFour() != null)
		{
			return searchShipToFour(list, customer.getShipToFour());
		}
		if(customer.getShipToFive() != null)
		{
			return searchShipToFive(list, customer.getShipToFive());
		}
		if(customer.getCustomerType() != null)
		{
			return searchCustomerType(list, customer.getCustomerType());
		}
		if(customer.getTerms() != null)
		{
			return searchTerms(list, customer.getTerms());
		}
		if(customer.getRep() != null)
		{
			return searchRep(list, customer.getRep());
		}
		if(customer.getSalesTaxCode() != null)
		{
			return searchSalesTaxCode(list, customer.getSalesTaxCode());
		}
		if(customer.getTaxCountry() != null)
		{
			return searchTaxCountry(list, customer.getTaxCountry());
		}
		if(customer.getBusinessNumber() != null)
		{
			return searchBusinessNumber(list, customer.getBusinessNumber());
		}
		if(customer.getAccountNumber() != null)
		{
			return searchAccountNumber(list, customer.getAccountNumber());
		}
		if(customer.getCreditLimit() != null)
		{
			return searchCreditLimit(list, customer.getCreditLimit());
		}
		if(customer.getJobStatus() != null)
		{
			return searchJobStatus(list, customer.getJobStatus());
		}
		if(customer.getJobType() != null)
		{
			return searchJobType(list, customer.getJobType());
		}
		if(customer.getJobDescription() != null)
		{
			return searchJobDescription(list, customer.getJobDescription());
		}
		if(customer.getStartDate() != null)
		{
			return searchStartDate(list, customer.getStartDate());
		}
		if(customer.getProjectedEnd() != null)
		{
			return searchProjectEnd(list, customer.getProjectedEnd());
		}
		if(customer.getEndDate() != null)
		{
			return searchEndDate(list, customer.getEndDate());
		}
				
		return list;
	}
	
	/**
	 * Method to add a new or modify a record to the customers binary file.
	 * @param o - an Object of type Customer containing all information about 
	 * a customer to be written to the customer's binary file called customer.bin.
	 * @return a boolean confirming that the customer record has been successfully 
	 * added or modified.
	 */
	public boolean persist(Object o)
	{
		Customer c = (Customer)o;
		try
		{
			if(c.getCustomerID() == 0L)
			{
				c.setCustomerID(++this.highId);
				seek(length());
				writeRecord(c);
				return true;
			}
			long byteOffset = findCustomerID(c.getCustomerID());
			if (byteOffset >= 0L)
			{
				seek(byteOffset);
				writeRecord(c);
				return true;
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
	/**
	 * Method to logically delete a record from the client binary file.
	 * @param o - an Object of type Customer containing all information about 
	 * a customer to be deleted from the customer binary file called customer.bin.
	 * @return a boolean confirming that the customer record has been successfully 
	 * deleted.
	 */
	public boolean remove(Object o)
	{
		Customer c = (Customer)o;
		try
		{
			long byteOffset = findCustomerID(c.getCustomerID());
			if(byteOffset > 0L)
			{
				seek(byteOffset);
				writeBoolean(false);
				return true;
			}
			return false;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * Method to release resources allocated to the broker and save all modified data. 
	 * NOTE if this method is called data may be lost.
	 */
	public void closeBroker()
	{
		try
		{
			customerBroker.close();
			customerBroker = null;
		}
		catch (IOException e)
		{
			System.out.println("Failed to close CustomerBroker properly");
			e.printStackTrace();
		}
	}
	
	/**
	 * Creates a RandomAccessFile as a data structure to store customer information 
	 * in a binary format.  This method is used only to create a database file if 
	 * no binary file for the customer's currently exists.
	 */
	private void loadCustomerBinaryFile() 
	{
		try
		{
			BufferedReader fin = new BufferedReader(new FileReader("res/customers.txt"));
			long customerID = 1L;
			String line = fin.readLine();
			while (line != null)
			{
				line = customerID++ + ";" + line;
				Customer c = new Customer(line);
				writeRecord(c);
				line = fin.readLine();
			}
			fin.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Writes a record to the RandomAccessFile given the position in file and the 
	 * customer object to write.  The strings for each customer are padded as follows: 
	 * 
	 * @param c - a Customer containing the customer's information
	 * @return A boolean indicating true if the record has been added correctly and 
	 * false if the record has not been added.
	 * @throws IOException When connection with the RandomAccessFile is lost.
	 */
	private boolean writeRecord(Customer c) throws IOException
	{
		
		return true;
	}

	/**
	 * A method to determine the byte offset of a client record stored in the 
	 * random access file.
	 * @param customerID - the ID of the customer record being located.
	 * @return the byte offset from the beginning of the client file.
	 */
	private long findCustomerID(long customerID) 
	{
		try
		{
			seek(0L);
			for (long i = 0L; i < length(); i += 996)
			{
				seek(i);
				Customer c = readRecord();
				if((c.getCustomerID() == customerID) && (c.isStatus()))
				{
					seek(i);
					return getFilePointer();
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return -1L;
	}

	private Customer readRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchEndDate(ArrayList list, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchProjectEnd(ArrayList list, Date projectedEnd) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchStartDate(ArrayList list, Date startDate) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchJobDescription(ArrayList list, String jobDescription) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchJobType(ArrayList list, String jobType) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchJobStatus(ArrayList list, String jobStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchCreditLimit(ArrayList list, String creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchAccountNumber(ArrayList list, String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchBusinessNumber(ArrayList list, String businessNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchTaxCountry(ArrayList list, String taxCountry) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchSalesTaxCode(ArrayList list, String salesTaxCode) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchRep(ArrayList list, String rep) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchTerms(ArrayList list, String terms) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchCustomerType(ArrayList list, String customerType) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchShipToFive(ArrayList list, String shipToFive) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchShipToFour(ArrayList list, String shipToFour) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchShipToThree(ArrayList list, String shipToThree) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchShipToTwo(ArrayList list, String shipToTwo) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchShipToOne(ArrayList list, String shipToOne) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchInvoiceToFive(ArrayList list, String invoiceToFive) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchInvoiceToFour(ArrayList list, String invoiceToFour) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchInvoiceToThree(ArrayList list, String invoiceToThree) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchInvoiceToTwo(ArrayList list, String invoiceToTwo) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchInvoiceToOne(ArrayList list, String invoiceToOne) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchMainEmail(ArrayList list, String mainEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchJobTitle(ArrayList list, String jobTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchSecondaryContact(ArrayList list, String secondaryContact) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchAlternativePhone(ArrayList list, String alternativePhone) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchFax(ArrayList list, String fax) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchMainPhone(ArrayList list, String mainPhone) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchPrimaryContact(ArrayList list, String primaryContact) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchMiddleInitial(ArrayList list, String middleInitial) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchLastName(ArrayList list, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchFirstName(ArrayList list, String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchTitle(ArrayList list, String title) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchCompany(ArrayList list, String company) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchTotalBalance(ArrayList list, double totalBalance) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchBalance(ArrayList list, double balance) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchCurrency(ArrayList list, String currency) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchCustomer(ArrayList list, String customer) {
		// TODO Auto-generated method stub
		return null;
	}

	private List searchStatus(ArrayList list, boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	private void findHighestCurrentId() {
		// TODO Auto-generated method stub
		
	}
}

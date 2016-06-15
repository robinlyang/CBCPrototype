package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.List;

public class CustomerBroker extends RandomAccessFile
{

	//Constants
	private static final String RANDOM_FILE = "res/customers.bin";
	private static final String INPUT_FILE = "res/customers.txt";
	private static final String MODE = "rwd";
	private static CustomerBroker customerBroker;
	private long highId;
	
	//Constructors
	public CustomerBroker() throws FileNotFoundException 
	{
		super(RANDOM_FILE, MODE);
		// TODO Auto-generated constructor stub
	}
	
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
	public List search(Object o)
	{
		return null;
		
	}
	
	private void loadCustomerBinaryFile() {
		// TODO Auto-generated method stub
		
	}

	private void findHighestCurrentId() {
		// TODO Auto-generated method stub
		
	}
}

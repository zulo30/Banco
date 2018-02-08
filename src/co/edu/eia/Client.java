package co.edu.eia;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Client {
	
	private String name;
	private String lastname;
	private String id;
	private String address;
	private Account[] accounts;
	
	//methods
	
	private boolean addNewAccountToTheArray(Account a) {
		if(accounts== null) {
			accounts = new Account[1];
			}
		else{
			accounts =Arrays.copyOf(accounts, accounts.length+1);
			}
			accounts[accounts.length-1]= a;
			return true ; 
	}
	public String openNewAccount(String type, String num,  float initialDeposit) throws ETypeNotValid{
		if( type.compareTo("corriente") == 0){
			MonetaryAccount a = new MonetaryAccount(initialDeposit,num);
			addNewAccountToTheArray(a);
			return num;
			
		}else if( type.compareTo("ahorros") == 0) {
			SavingsAccount a = new SavingsAccount(initialDeposit,num);
			addNewAccountToTheArray(a);
			return num;
		}else
			throw new ETypeNotValid();
		
	}
	public String openNewAccount(String type, float initialDeposit) throws ETypeNotValid{
		String num =generateAccountNumber();
		if( type.compareTo("corriente") == 0){
			MonetaryAccount a = new MonetaryAccount(initialDeposit,num);
			addNewAccountToTheArray(a);
			return num;
			
		}else if( type.compareTo("ahorros") == 0) {
			SavingsAccount a = new SavingsAccount(initialDeposit,num);
			addNewAccountToTheArray(a);
			return num;
		}else
			throw new ETypeNotValid();
		
	}
	public String openNewAccount(String type) throws ETypeNotValid{
		String num =generateAccountNumber();
		if( type.compareTo("corriente") == 0){
			MonetaryAccount a = new MonetaryAccount(num);
			addNewAccountToTheArray(a);
			return num;
			
		}else if( type.compareTo("ahorros") == 0) {
			SavingsAccount a = new SavingsAccount(num);
			addNewAccountToTheArray(a);
			return num;
		}else
			throw new ETypeNotValid();
		
	}
	public String openNewAccount(String type,String num) throws ETypeNotValid{
		if( type.compareTo("corriente") == 0){
			MonetaryAccount a = new MonetaryAccount(num);
			addNewAccountToTheArray(a);
			return num;
			
		}else if( type.compareTo("ahorros") == 0) {
			SavingsAccount a = new SavingsAccount(num);
			addNewAccountToTheArray(a);
			return num;
		}else
			throw new ETypeNotValid();
		
	}
	
	private  String generateAccountNumber(){
		Date dNow = new Date( );
		String ft = new SimpleDateFormat ("ddhhmmssSS").format(dNow);
		//int id = Integer.parseInt(ft);
		return ft;
	}
	private int findElementInArray( String p,Account[] accounts) {
		int i = 0;
		while ( i < accounts.length && accounts[i].getNumber().compareTo(p) != 0) {
			i++;
		}
		if(i == (accounts.length)) {return -1;}else{return i;}
	}
	//Constructor
	public Client(String name, String lastname, String id, String address) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.id = id;
		this.address = address;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public Account getAccount(String a) {
		int k =findElementInArray( a, accounts);
		return accounts[k];
		
	}
	

}

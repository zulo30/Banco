package co.edu.eia;

import java.util.Arrays;

public class Bank {
	private String[] client;
	private Client[] clientArray;

	

	//constructor 
	public Bank() {
		super();
	}
	
	//methods
	private boolean addNewClientToTheArray(Client c) {
		if(clientArray == null) {
			clientArray = new Client[1];
			}
		else{
			clientArray =Arrays.copyOf(clientArray, clientArray.length+1);
			}
			clientArray[clientArray.length-1]= c;
			return true ; 
	}
	
	private boolean addNewClientIDToTheArrayOfIDs(String c) {
		if(client == null) {
			client = new String[1];
			}
		else{
			client =Arrays.copyOf(client, client.length+1);
			}
			client[client.length-1]= c;
			return true ; 
	}
	
	public Client createNewClient(String n, String ln, String id, String ad){
		Client c = new Client(n, ln, id, ad);
		addNewClientIDToTheArrayOfIDs(id);
		addNewClientToTheArray(c);
		return c; 
	}
	
	private int findElementInArray( String p,String[] array) {
		int i = 0;
		while ( i < array.length && array[i].compareTo(p) != 0) {
			i++;
		}
		if(i == (array.length)) {return -1;}else{return i;}
	}
	
	public Client getClient( String id) {
		int k=findElementInArray(id, client);
		if(k== -1) {return null;}
		return clientArray[k];
	}
	
	
	public Account getAccount(String id,String num) throws EAccountfound, EClientDoesnotExist{
		Client c = getClient(id);
		Account[] a = c.getAccounts();
		if(c == null){ throw new EClientDoesnotExist();}
		else {
			int i =0;
			while(i<a.length && a[i].getNumber().compareTo(num)!=0) {
				i++;	
			}
			if (i>=a.length) {throw new EAccountfound();}	
			else 
				return a[i];
		}
	}
	
	
	
}

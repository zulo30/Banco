package co.edu.eia;

public class Main {
	public static void main(String[] args) throws ETypeNotValid {
		Bank b = new Bank();
		b.createNewClient("John", "Doe","2222222","Universidad EIA sede Las Plamas");
		System.out.println(b.createNewClient("Jane", "Doe","1111111","main st. Av.51").getName());
		System.out.println(b.getClient("1111111").openNewAccount("corriente", 100));
		System.out.println(b.getClient("2222222").getName());
		System.out.println(b.getClient("2222222").openNewAccount("ahorros", 100));
		
	}
}

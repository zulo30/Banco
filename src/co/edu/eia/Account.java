package co.edu.eia;




public abstract class Account {
//fields
	private float balance;
	private String number;
	private boolean isActivated;
// methods 
	public void deposit(float v ) throws ENegativeValue,EAccountDeactivated  {
		if (! isActivated) {
			throw new EAccountDeactivated();
		}	
		if (v>0) 
			balance += v;
		else
			throw new ENegativeValue();
	}
	public void withdraw(float v ) throws ENegativeValue, EValueGreaterThanBalance, EAccountDeactivated {
		if (! isActivated) {
			throw new EAccountDeactivated();
		}	
		if (v>0) 
			if (v<=balance)
				balance -= v;
			else
				throw new EValueGreaterThanBalance();
		else
			throw new ENegativeValue();
	}
	public void blockAccount() {
		isActivated = false; 
	}
	
	
//getters 
	public float getBalance() {
		return balance;
	}
	public String getNumber() {
		return number;
	}
//constructor 
	public Account(float balance,String number ) {
		super();
		this.balance = balance;
		this.number = number;
		isActivated = true;
		
	}
	public Account(String number) {
		super();
		this.balance = 0;
		this.number = number;
		isActivated = true;
	}
	
	
}

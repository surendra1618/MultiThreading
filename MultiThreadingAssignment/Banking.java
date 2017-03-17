	
public class Banking {
	double balance;
	float interest;
	void insert_input(double amount){
		this.balance=amount;
	}

	void deposit(double amount) {
		balance = balance + amount;
System.out.println("Amount deposited today is:"+balance);
	}

	void withdraw(double amount){
		if(balance<amount){
			System.out.println("Insufficient funds...");
		}else {
		balance=balance-amount;
		System.out.println("Withdrawn amount today is:"+balance);
		
	}
	

	}
}
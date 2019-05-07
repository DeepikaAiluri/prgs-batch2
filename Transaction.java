package bankTransactions;

public class Transaction {

	
	

	int depositingAmt;
	int withdrawingAmt;
	
	int existingAmt;
	int balance;
	
	public  void deposit(){
		
		
		balance=existingAmt+depositingAmt;
		
		System.out.println("Your amount is deposited.Your Account balance is"+ balance);
		
		existingAmt=existingAmt+depositingAmt;
		
		
		
	}
	
	public  void withDrawl() {
		
		balance=existingAmt-withdrawingAmt;
		
		System.out.println("After the Withdrawl your remaining balance is"+balance);
		
		existingAmt=existingAmt-withdrawingAmt;
		
	}
	
	
	
	
	
	
}

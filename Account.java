package bankTransactions;

public class Account {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to ourbank");
		
		
		Transaction a1=new Transaction();
		Transaction a2=new Transaction();
		
		a1.depositingAmt=1500;              a2.depositingAmt=2000;
		
		a1.deposit();                       a2.deposit();
		
        a1.withdrawingAmt= 50;              a2.withdrawingAmt=10;
        
        a1.withDrawl();                      a2.withDrawl();
        
        a1.depositingAmt=100;                a2.withdrawingAmt=50;
		   
        
        a1.deposit();                         a2.withDrawl();
        
        
        a1.depositingAmt=5;                  a2.depositingAmt=1005;
        
        a1.deposit();                        a2.deposit();
        
        a1.withdrawingAmt=1;                 a2.withdrawingAmt=12;
        
        a1.withDrawl();                      a2.withDrawl();
		
		
		
		
		                                        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

		

	

	}

}

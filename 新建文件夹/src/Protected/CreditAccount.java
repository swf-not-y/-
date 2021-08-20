package Protected;

public class CreditAccount extends SuperAccount {
	private double credit;
	
	public CreditAccount(){
		
	}

	public CreditAccount(String actno,double balance,double credit){
		/*
		this.actno = actno;
		this.balance = balance;
		*/
		super(actno,balance);
		this.credit = credit;
			
		}
	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}
	
	
}

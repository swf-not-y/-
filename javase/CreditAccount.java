
public class CreditAccount extends Account {
	private double credit;
	public CreditAccount(double credit) {
		super();
		this.credit = credit;
	}
	public CreditAccount() {
		super();
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	
}

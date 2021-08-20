package Protected;

public class Supertext02 {
	public static void main(String[] args){
		CreditAccount ca1 = new CreditAccount();
		System.out.println(ca1.getActno() + "," + ca1.getBalance() + "," 
		+ ca1.getCredit());
		CreditAccount ca2 = new CreditAccount("1234",10000.0,0.98);
		System.out.println(ca2.getActno() + "," + ca2.getBalance() + "," 
				+ ca2.getCredit());
	}
}

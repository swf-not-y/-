//’Àªß¿‡
public class Account {
	//’À∫≈
	private String actno;
	//”‡∂Ó
	private double balance;
	
	public Account(){
		
	}
	
	public Account(String s){
		actno = s;
	}
	
	public Account(double d){
		balance = d;
	}
	
	public Account(String s, double d){
		actno = s;
		balance = d;
		
	}
	
	public String getactno(){
		return actno;
	}
	
	public double getbalance(){
		return balance;
	}
	/*public void setactno(String actno){
		this.actno = actno;
	}
	
	public void setbalance(double b){
		this.balance = b;
	}*/
}

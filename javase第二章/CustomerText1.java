
public class CustomerText1 {
	public static void main(String[] args){
		Customer c1 = new Customer();
		c1.name = "����";
		System.out.println(c1.name);
		c1.shopping();
		c1.pay(100);
		//Customer.dosome();
		Customer c2 = new Customer();
		c2.name = "����";
		c2.shopping();
		c2.pay(200);

	}
}

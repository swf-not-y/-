
public class AccountText {
	public static void main(String[] args){
		Account act1 = new Account();
		
		Account act2 = new Account("张三");
		
		Account act3 = new Account(100000);
		
		Account act4 = new Account("李四",100);
		
		System.out.println("账号："+act1.getactno());
		System.out.println("金额："+act1.getbalance());
		System.out.println("账号："+act2.getactno());
		System.out.println("金额："+act3.getbalance());
		System.out.println("账号："+act4.getactno());
		System.out.println("金额："+act4.getbalance());
	}
}

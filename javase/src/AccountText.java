
public class AccountText {
	public static void main(String[] args){
		Account act1 = new Account();
		
		Account act2 = new Account("����");
		
		Account act3 = new Account(100000);
		
		Account act4 = new Account("����",100);
		
		System.out.println("�˺ţ�"+act1.getactno());
		System.out.println("��"+act1.getbalance());
		System.out.println("�˺ţ�"+act2.getactno());
		System.out.println("��"+act3.getbalance());
		System.out.println("�˺ţ�"+act4.getactno());
		System.out.println("��"+act4.getbalance());
	}
}

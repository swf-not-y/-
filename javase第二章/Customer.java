
public class Customer {
	String name;
	int money;
	public Customer(){
		
	}
	
	public void shopping(){
		System.out.println(this.name+"�ڹ���");//thisָ��ǰ����ִ�������Ϊ�Ķ���
	}
	
	public void pay(int money){
		System.out.println(name+"��Ҫ֧��"+money+"Ԫ");
	}
	/*public static void dosome(){
		System.out.println(name);//��Ϊname��ʵ��������ʹ��name�����á�����.����
		//���÷�������static���ͣ������໥ì��
	}*/
	
	public static void doother(String name){
		Customer c = new Customer();
		System.out.println(c.name); 
	}
	
	public static void main(String[] args){
		Customer.doother("С��");
	}
}


public class Customer {
	String name;
	int money;
	public Customer(){
		
	}
	
	public void shopping(){
		System.out.println(this.name+"在购物");//this指向当前正在执行这个行为的对象
	}
	
	public void pay(int money){
		System.out.println(name+"需要支付"+money+"元");
	}
	/*public static void dosome(){
		System.out.println(name);//因为name是实例变量，使用name必须用“引用.”，
		//而该方法属于static类型，两者相互矛盾
	}*/
	
	public static void doother(String name){
		Customer c = new Customer();
		System.out.println(c.name); 
	}
	
	public static void main(String[] args){
		Customer.doother("小米");
	}
}

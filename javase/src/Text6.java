
public class Text6 {
	public static void main(String[] args){
		User1 u = new User1(20);
		add(u);
		System.out.println("age-->"+u.age);
	}
	
	public static void add(User1 u){
		u.age++;
		System.out.println("add-->"+u.age);
	}
}



package Protected;

public class SuperText {
	public static void main(String[] args){
		new B();
	}
}

class A{
	/*
	public A(){
		System.out.println("A¿‡");
	}
	*/
}

class B extends A{
	public B(){
		super();
		System.out.println("B¿‡");
	}
}
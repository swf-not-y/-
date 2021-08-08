
public class Method2 {
	public static void main(String[] args){
		sum(10,20);
		Method3.cenfa(29,43);
	}
	public static void sum(int x,int y){
		int c = x + y;
		System.out.println(c);
	}
}

class Method3{
	public static void cenfa(int x, int y){
		int c = x*y;
		System.out.println(c);
	}
}
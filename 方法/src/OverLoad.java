
public class OverLoad {
	public static void main(String[] args){
		U.p(11);
		U.p(11.0);
	}
}
class U{
	public static void p(int d){
		System.out.println(d);
	}
	public static void p(double a){
		System.out.println(a);
	}
}
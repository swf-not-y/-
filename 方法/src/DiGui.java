//��1��n֮������ֵĺ�
public class DiGui {
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("������һ������");
		int n = s.nextInt();
		int b = sum(n);
		int c = JieChen(n);
		System.out.println(b);
		System.out.println(c);
		

	}
	public static int sum(int n){
		if (n==1){
			return n;
		}
		else{
			return n + sum(n-1);
		}
	}
	public static int JieChen(int n){
		if (n == 1){
			return n;
		}
		else{
			return n*JieChen(n-1);
		}
	}
}

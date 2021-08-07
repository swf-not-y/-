
public class Input {
	public static void main(String[] args){
		boolean b = true;
		while(b){
			java.util.Scanner s=new java.util.Scanner(System.in);//接受键盘信息
			System.out.print("请输入你的年龄：");
			int a = s.nextInt();
			System.out.println(a);
			if (a<0 || a>120){
				System.out.println("您输入的年龄不符合实际。");
			}
			else if (a<16){
				System.out.println("少年");
			}
			else if (a<30){
				System.out.println("青年");
			}
			else if (a<65){
				System.out.println("中年");
			}
			else if (a<120){
				System.out.println("老年");
			}
			else if (a==-1){
				break;
			}
		}

	}
}

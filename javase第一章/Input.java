
public class Input {
	public static void main(String[] args){
		boolean b = true;
		while(b){
			java.util.Scanner s=new java.util.Scanner(System.in);//���ܼ�����Ϣ
			System.out.print("������������䣺");
			int a = s.nextInt();
			System.out.println(a);
			if (a<0 || a>120){
				System.out.println("����������䲻����ʵ�ʡ�");
			}
			else if (a<16){
				System.out.println("����");
			}
			else if (a<30){
				System.out.println("����");
			}
			else if (a<65){
				System.out.println("����");
			}
			else if (a<120){
				System.out.println("����");
			}
			else if (a==-1){
				break;
			}
		}

	}
}


public class Switch {
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("���������ڼ���");
		String dataofweek = s.next();
		switch(dataofweek){
		case "����һ":
			System.out.println(1);//����case��ֻ����int����string��������
			break;
		case "���ڶ�":
			System.out.println(2);
			break;
		}
	}
}


public class Switch {
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入星期几：");
		String dataofweek = s.next();
		switch(dataofweek){
		case "星期一":
			System.out.println(1);//其中case中只能是int或者string数据类型
			break;
		case "星期二":
			System.out.println(2);
			break;
		}
	}
}

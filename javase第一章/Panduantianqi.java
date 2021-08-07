
public class Panduantianqi {
	public static void main(String[] args){
		System.out.println("欢迎登录天气系统。");
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("请输入当前天气状况（1表示下雨，0表示晴天）：");
		int weather = s.nextInt();
		System.out.print("请输入您的性别（1为男，0为女）：");
		int sex = s.nextInt();
		if (weather == 1){
			System.out.println("请带伞。");
			if (sex == 1){
				System.out.println("带一把大黑伞。");
			}
			else if (sex == 0){
				System.out.println("请带一把小花伞。");
			}

		}
		else if (weather == 0){
			System.out.print("请输入天气温度：");
			float temperature = s.nextInt();
			if (temperature > 30){
				if (sex == 1){
					System.out.println("请带墨镜。");
				}
				else if (sex == 0){
					System.out.println("擦防晒霜。");
				}
			}
			else{
				System.out.println("很舒服。");
			}
			
		}
	}
}


public class Panduantianqi {
	public static void main(String[] args){
		System.out.println("��ӭ��¼����ϵͳ��");
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.print("�����뵱ǰ����״����1��ʾ���꣬0��ʾ���죩��");
		int weather = s.nextInt();
		System.out.print("�����������Ա�1Ϊ�У�0ΪŮ����");
		int sex = s.nextInt();
		if (weather == 1){
			System.out.println("���ɡ��");
			if (sex == 1){
				System.out.println("��һ�Ѵ��ɡ��");
			}
			else if (sex == 0){
				System.out.println("���һ��С��ɡ��");
			}

		}
		else if (weather == 0){
			System.out.print("�����������¶ȣ�");
			float temperature = s.nextInt();
			if (temperature > 30){
				if (sex == 1){
					System.out.println("���ī����");
				}
				else if (sex == 0){
					System.out.println("����ɹ˪��");
				}
			}
			else{
				System.out.println("�������");
			}
			
		}
	}
}

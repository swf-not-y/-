
public class ChineseText {
	public static void main(String[] args){
		Chinese zhangshang = new Chinese("12344","����");
		System.out.println(zhangshang.id + "," + zhangshang.name + "," + Chinese.country);
		
		Chinese lisi = new Chinese("12345","����");
		System.out.println(lisi.id + "," + lisi.name + "," + Chinese.country);

	}
}


public class ChineseText {
	public static void main(String[] args){
		Chinese zhangshang = new Chinese("12344","张三");
		System.out.println(zhangshang.id + "," + zhangshang.name + "," + Chinese.country);
		
		Chinese lisi = new Chinese("12345","李四");
		System.out.println(lisi.id + "," + lisi.name + "," + Chinese.country);

	}
}


public class ZhengXing {
	public static void main(String[] args){
		int a = 0x10;
		//long b = 2147483648;java中一般将数字直接当成int类型，  
		//要想使用long,则需要在数据之后加一个L
		long b = 2147483648L;
		int c = 10;
		c = (int)b;
		byte d = 50;
		//byte e = 200;
		//当一个值没有超过byte类型的范围它不报错，但是其并不符合语法
		//System.out.println(e);
		System.out.println(d);
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
	}
}

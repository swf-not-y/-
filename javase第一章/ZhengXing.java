
public class ZhengXing {
	public static void main(String[] args){
		int a = 0x10;
		//long b = 2147483648;java��һ�㽫����ֱ�ӵ���int���ͣ�  
		//Ҫ��ʹ��long,����Ҫ������֮���һ��L
		long b = 2147483648L;
		int c = 10;
		c = (int)b;
		byte d = 50;
		//byte e = 200;
		//��һ��ֵû�г���byte���͵ķ�Χ�������������䲢�������﷨
		//System.out.println(e);
		System.out.println(d);
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
	}
}

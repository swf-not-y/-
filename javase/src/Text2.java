
public class Text2 {
	public static void main(String[] args){
		Computer huashuo = new Computer();
		huashuo.brand = "华硕";
		huashuo.style = "ssd";
		huashuo.color = "red";
		Student zhanshang = new Student();
		zhanshang.number = 123;
		zhanshang.name = "张三";
		zhanshang.notepad = huashuo;
		System.out.println(zhanshang.name);
		System.out.println(zhanshang.notepad.style);

}

 public static class Computer{
	String brand;//品牌
	String style;
	String color;
 }
 
public static class Student{
	int number;
	String name;
	Computer notepad;
	}
}
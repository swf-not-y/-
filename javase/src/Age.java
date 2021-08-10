public class Age{
	public char[] getAge;
	private int age;
	public void setaAge(int a){
		if (a<0 || a>120){
			return;
		}
		else{
			age = a;
		}
	}
	
	public int getAge(){
		return age;
	}
}

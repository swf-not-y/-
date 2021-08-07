package ื๗าต;

public class For {
	public static void main(String[] args){
		int i,j;
		for(i=1;i<=100;i++){
			if (i==1||i==2){
				System.out.println(i);
				continue;
			}
			else{
				for(j=2;j<=i;j++){
					if (i%j == 0){
						break;
					}
					else if (j==i-1){
						System.out.println(i);
					}
					
				}
			}
		}
			
	}
}

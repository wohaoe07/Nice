package nice;

import java.util.Scanner;

public class App2 {
	public static int main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		if(a==1||a==2) {
			b=1;
		}else {
			b=(a-1)+(a-2);
		}
		return b;
	}
	

}

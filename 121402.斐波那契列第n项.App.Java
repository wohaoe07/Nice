package nice;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = fib(a);
		System.out.println("斐波那契数列的第n项为：" + b);
 
	}
 
	public static int fib(int a) {
		int b = 0;
		if (a>=1&&a<=40) {
			if (a == 1 || a == 2) {
				b = 1;
			} else {
				b = fib(a - 1) + fib(a - 2);
			}
		}
			
		return b;
		
	}
 


}

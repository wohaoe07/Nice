package nice;

import java.util.Scanner;

public class App2 {
	public static int main(String[] args) {
		int i = 1;
int sum = 0;

    while (i <= 100){
        if (i % 2 == 1){
            sum = sum + i;
        }
        i++;
    }
    System.out.println("sum = "+sum);

	}
	

}

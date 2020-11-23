package pac;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int user_num=scanner.nextInt();
            System.out.println("R("+(int)(Math.random()*100)+","+(int)(Math.random() * 100)+")");
        }
    }
}

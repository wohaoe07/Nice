package pac;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int arrgs[][]=new int[10][10];
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int value = scanner.nextInt();
        arrgs[row][column]=value;
        for (int i = 0; i < arrgs.length; i++) {
            for (int j = 0; j < arrgs.length; j++) {
                System.out.print(arrgs[i][j]+" ");
            }
            System.out.println();
        }

    }
}

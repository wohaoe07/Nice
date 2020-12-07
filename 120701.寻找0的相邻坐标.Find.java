
public class Find {
 void findZero(int array2[] []){
	 for (int row = 0; row < array2.length; row++) {
		for (int column = 0; column < array2.length; column++) {
			if (array2[row][column] == 0) {
				System.out.println("R_zero("+column+","+row+")");
				return;
			}
		}
	}
	 
 }
 
 void findLeft(int array2[] []){
	 for (int row = 0; row < array2.length; row++) {
			for (int column = 0; column < array2.length; column++) {
				if (array2[row][column] == 10) {
					System.out.println("R_Left("+column+","+row+")");
					return;
				}
			}
		}
 }
 
 void findRight(int array2[] []){
	 for (int row = 0; row < array2.length; row++) {
			for (int column = 0; column < array2.length; column++) {
				if (array2[row][column] == 12) {
					System.out.println("R_Right("+column+","+row+")");
					return;
				}
			}
		}
 }
 
 void findUp(int array2[] []){
	 for (int row = 0; row < array2.length; row++) {
			for (int column = 0; column < array2.length; column++) {
				if (array2[row][column] == 5) {
					System.out.println("R_UP("+column+","+row+")");
					return;
				}
			}
		}
 }
 
 
 void findDown(int array2[] []){
	 for (int row = 0; row < array2.length; row++) {
			for (int column = 0; column < array2.length; column++) {
				if (array2[row][column] == 11) {
					System.out.println("R_Down("+column+","+row+")");
					return;
				}
			}
		}
 }
}


public class App {
	public static void main(String[] args) {
		int array2[] []={
						{1,2,3,4,5,6},
						{7,8,9,10,0,12},
						{8,8,9,10,11,12},
						{7,8,3,10,11,12},
						{88,66,92,102,151,999}				
		};
		new Find().findZero(array2);
		new Find().findLeft(array2);
		new Find().findRight(array2);
		new Find().findUp(array2);
		new Find().findDown(array2);
	}

}

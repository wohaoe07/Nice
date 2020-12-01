package pac;

public class App implements R{
    public static void main(String[] args) {
        System.out.println(R.girl_filePath);
        System.out.println(R.boy_filePath);
        for (int i = 0; i < R.array2d.length; i++) {
            for (int j = 0; j < R.array2d[i].length; j++){
                System.out.println(R.array2d[i][j]);
            }
        }
    }
}

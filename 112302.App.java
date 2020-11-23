package pac;

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        int arr[][]={
                {5,6},
                {300,500},
                {999, 666},
                {7,0}
        };
        while (true){
            Thread.sleep(1000);
            System.out.println("一秒过去了");
            int rad = (int)(Math.random()*10%4);
            System.out.println(arr[rad][0]+","+arr[rad][1]);
        }
    }
}

package nice;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		System.out.print("请输入年份");

		int year;

		Scanner scanner = new Scanner(System.in);

		year = scanner.nextInt();

		if(year>3200||year<-3200){

		System.out.println("年份有误！");

		}
		if (year>0) {
			if(year%4==0&&year%100!=0||year%400==0){

				System.out.println(year+"是闰年");

				}else{

				System.out.println(year+"不是闰年");

					}
			
		}else {
			if (year%4==-1&&year%100!=-1||year%400==-1) {
				
				System.out.println(year+"是闰年");
				
			}else{
				
				System.out.println(year+"不是闰年");
				
				}
			}
		
		}
	}

 



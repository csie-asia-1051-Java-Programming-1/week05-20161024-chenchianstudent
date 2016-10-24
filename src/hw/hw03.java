package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入n");
		double n=scn.nextDouble();
		double n1=Math.ceil(Math.log(10000)/Math.log(n));
		System.out.println(n1);
		
		
		
		
	}


}

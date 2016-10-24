package hw;
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入一正整數");
		int n=scn.nextInt();
		int m=0;
		int sum=0;
		while(sum<n){
			
			sum=sum+m;
			m++;
			if(sum>=n){
			System.out.print(m-1);
			}
			else{
			if(sum>=n){
			System.out.print(m);	
			}	
			}
		}
		
		
		
		
		
		
		
	}


}

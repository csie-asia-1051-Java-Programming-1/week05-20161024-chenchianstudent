package ex;
import java.util.Scanner;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021007 陳麒安
 */

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a[]={5,6,7,4,9,11,15,13};
		for(int i=0;i<=a.length-1;i++){
			for(int j=0;j<=a.length-i-1;j++){
			if(a[j+1]>a[j]){
				int t=a[j+1];
				a[j+1]=a[j];
				a[j]=t;
			}
			
			}
			
		}
		System.out.print(a[i]);
		
	}
	
}

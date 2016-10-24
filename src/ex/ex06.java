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
		System.out.print("總共有幾人");
		int n=scn.nextInt();
		int data[]=new int[n];
		System.out.print("請輸入學號");	
		for(int i=0;i<data.length;i++){
		int num=scn.nextInt();
		data[i]=num;
		}
		
		for(int i=0;i<data.length-1;i++){
			for(int j=0;j<data.length-1-i;j++){
			if(data[j+1]>data[j]){
				int t=data[j+1];
				data[j+1]=data[j];
				data[j]=t;
				
			}
			
			}
			
		}
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+"\t");}
		
	}
	
}

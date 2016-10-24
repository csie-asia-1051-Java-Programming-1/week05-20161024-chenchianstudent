package ex;
import java.util.Random;
import java.util.Scanner;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 105021007 陳麒安
 */

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Scanner scn=new Scanner(System.in);
		int data[][]=new int[10][10];
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
				data[i][j] =rnd.nextInt(10);
				System.out.print("["+i+"]["+j+"]="+data[i][j]+"\t");
				
			}
			System.out.println();
		}
		System.out.println("轉換後");
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
				
			System.out.print("["+i+"]["+j+"]="+data[j][i]+"\t");
			
			}System.out.println();	
			}
		
		
		
		
				
	}

}

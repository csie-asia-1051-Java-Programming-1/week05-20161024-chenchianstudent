package ex;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
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
		Random n;
		int h=10;
		int h1=10;
	
		for(int i=0;i<h;i++){
			for(int j=0;j<h1;j++){int v1 =rnd.nextInt(10);
				System.out.print("["+i+"]["+j+"]="+v1+"\t");
				
			}
			System.out.println();
		}
		System.out.println("轉換後");
		for(int i=0;i<h1;i++){
		for(int j=0;j<h;j++){int v1 =rnd.nextInt(10);
		System.out.print("["+i+"]["+j+"]="+v1+"\t");
			
		}System.out.println();	
		}
		
		
		
		
				
	}

}

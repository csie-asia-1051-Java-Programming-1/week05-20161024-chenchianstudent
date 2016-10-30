package hw;
import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//有一 n x n的矩陣(1＜n＜21)，輸入 n 後，試以程式繪出此一方陣，方陣結構如下，例如 n=5 時：
	Scanner scn=new Scanner(System.in);
	System.out.print("請輸入n");
	int n=scn.nextInt();
	int data[][]=new int[n][n];
	int a;
	int b;
	int c=1;
	
	if(n>21){
		System.out.print("請重新輸入");
		}
	else{
	if(n<=0){
		System.out.print("請重新輸入");	
		}
	for(int i=0;i<n;i++){
		a=i;b=0;
		for(int j=0;j<i+1;j++){
		data[i][0]=c;
		a--;
		b++;
		c++;
		System.out.print(data[i][0]);
		}
		System.out.println();
	}
	for(int i=n;i<=0;i++){
		
		for(int j=n;j<=0;j--){
			a=j;b=0;	
	    data[0][i]=c;
		a--;
		b++;
		c++;
		System.out.print(data[i][0]);
		}
		System.out.println();
	}
	
		
		}
	}
	
		
		}
		
	
	


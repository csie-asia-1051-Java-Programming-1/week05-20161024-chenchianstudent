package hw;
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//讓使用者輸入一正整數n，計算1/(1*2)+1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果
	Scanner scn=new Scanner(System.in);
	System.out.print("請輸入n");
	int n=scn.nextInt();
	double sum=0;
	for(float i=1;i<=n;i++){
		float a=1/((2*i-1)*(2*i));
		
		sum=sum+a;
		
		
	}
	System.out.print(sum);
	
	
	}

}

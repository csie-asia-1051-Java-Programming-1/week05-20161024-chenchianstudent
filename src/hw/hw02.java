package hw;
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���ϥΪ̿�J�@�����n�A��X1+2+3+�K+m<=n���̤j���m=?
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�@�����");
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

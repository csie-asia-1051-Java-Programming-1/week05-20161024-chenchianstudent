package hw;
import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���@ n x n���x�}(1��n��21)�A��J n ��A�եH�{��ø�X���@��}�A��}���c�p�U�A�Ҧp n=5 �ɡG
	Scanner scn=new Scanner(System.in);
	System.out.print("�п�Jn");
	int n=scn.nextInt();
	int data[][]=new int[n][n];
	int a;
	int b;
	int c=1;
	
	if(n>21){
		System.out.print("�Э��s��J");
		}
	else{
	if(n<=0){
		System.out.print("�Э��s��J");	
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
		
	
	


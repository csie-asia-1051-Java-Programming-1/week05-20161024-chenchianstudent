package hw;
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���ϥΪ̿�J�@�����n�A�p��1/(1*2)+1/(3*4)+1/(5*6)+�K+1/[(2n-1)*(2n)]�ÿ�X���G
	Scanner scn=new Scanner(System.in);
	System.out.print("�п�Jn");
	int n=scn.nextInt();
	double sum=0;
	for(float i=1;i<=n;i++){
		float a=1/((2*i-1)*(2*i));
		
		sum=sum+a;
		
		
	}
	System.out.print(sum);
	
	
	}

}

package Mine;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enetr a number");
		int n=s.nextInt();
		
		int sum=0;
		int mul=1;
		int a=n;
		int rem=0;
		while(a>0) {
			rem=a%10;
			sum=sum+rem;
			mul=mul*rem;
			a/=10;
			}
		if(sum==mul) {
			System.out.println("This is spy number");
			
		}
		else {
			System.out.println("This is not spy number");
			
		}
		
		

	}

}

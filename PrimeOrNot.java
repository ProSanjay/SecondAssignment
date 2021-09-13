package fullStack;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(number==0 || number==1) {
    	System.out.println("it is not a prime number");
    }
    boolean flag=true;
    for(int i=2;i<=number/2;i++) {
    	if(number%i==0) {
    		System.out.println("it is not a prime number");
    		flag=false;
    		break;
    	}
    }
    if(flag) {
    	System.out.println("it is a prime number.");
    }
	}

}

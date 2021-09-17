package fullStack;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	System.out.println("Enter number:");
	int number=sc.nextInt();
	for(int i=1;i<=number;i++) {
		sum=sum+i;
	}
	System.out.println("sum of first "+number+" number is: "+sum);

	}

}

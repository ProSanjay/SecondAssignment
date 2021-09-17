package Package1;

import java.util.Scanner;

public class TernaryMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter two number:");
		   int a=sc.nextInt();
		   int b=sc.nextInt();
		   int max=a>b?a:b;
		   System.out.println("Maximum:"+max);
	}

}

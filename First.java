package basic;

import java.util.Scanner;

public class First extends Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		    System.out.println("Enter two number:");
		    Scanner sc=new Scanner(System.in);
		    int first=sc.nextInt();
		    int second=sc.nextInt();
		    int sum= sum(first, second);
		    System.out.println(sum);
	}

}

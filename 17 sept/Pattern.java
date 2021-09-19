package basic;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter number:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=1;i<=a;i++) {
    	for(int j=1;j<=i;j++) {
    		System.out.print(" * ");
    	}
    	System.out.println();
    }
	}

}

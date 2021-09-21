package java21septAssignment;
import java.util.Scanner;
public class PiryamidalPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
	int length=sc.nextInt();
	int temp=length;
	for(int i=1;i<=length;i++) {
		for(int j=1;j<=i+length-1;j++) {
	     if(j>=temp) {
	    	 System.out.print("*");
	     }else {
	    	System.out.print(" ");
	     }
			
		}
		System.out.println();
		temp--;
	}
	sc.close();

	}

}

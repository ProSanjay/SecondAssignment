package java21septAssignment;
import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements:");
		int element[]=new int[5];
		for(int i=0;i<element.length;i++) {
			element[i]=sc.nextInt();
		}
		System.out.println("Enter number that to be replaced:");
       int number=sc.nextInt();
       for(int i=0;i<element.length;i++) {
    	   if(element[i]==number) {
    		   element[i]=0;
    		   break;
    	   }
       }
       for(int c:element) {
    	   System.out.println(c);
       }
       sc.close();
	}

}

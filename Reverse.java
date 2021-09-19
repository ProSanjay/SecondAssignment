package basic;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);	
      System.out.println("Enter value:");
      int a=sc.nextInt();
      int semp=0;
      while(a>0) {
    	  semp=semp*10+a%10;
    	  a=a/10;
      }
      System.out.println("After reversing:"+semp);

	}

}

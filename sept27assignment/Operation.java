package sept27assignment;
import java.util.Scanner;
public class Operation {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two number:");
      int first=sc.nextInt();
      int second=sc.nextInt();
      System.out.print("Enter operation:");
      String operation=sc.next();
      if(operation.equals("add")) {
    	  int add=add(first,second);
    	  System.out.println("sum:"+add);
      }else if(operation.equals("multiply")) {
    	  int multiply=multiply(first,second);
    	  System.out.println("multiplication:"+multiply);
      }else {
    	  System.out.println("enter correct choice");
      }
      
	}
	public static int add(int a,int b) {
		   return a+b;
		 }
		 public static int multiply(int a,int b) {
			   return a*b;
			 }
}

package basic;
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    B b=new B();
    System.out.println("Enter two number:");
    Scanner sc=new Scanner(System.in);
    int first=sc.nextInt();
    int second=sc.nextInt();
    int sum= b.sum(first, second);
    System.out.println(sum);
	}

}

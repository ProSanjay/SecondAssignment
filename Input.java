package basic;
import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  //explicit conversion
  float f=sc.nextFloat();
  int a=(int)f;
  System.out.println(a);
  //implicit conversion
  int b=sc.nextInt();
  float f1=b;
  System.out.println(f1);
	}

}

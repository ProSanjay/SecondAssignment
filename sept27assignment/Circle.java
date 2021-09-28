package sept27assignment;
import java.util.Scanner;
public class Circle {
	static double PIE=22/7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Scanner sc=new Scanner(System.in);		
		System.out.println("Enter radius:");
		int radius=sc.nextInt();
	   double area=area(radius);
		double circumference=circumference(radius);
		System.out.println("Area of circle:"+area);
		System.out.println("Circumference of circle:"+circumference);

	}
	private static double area(int radius) {
	  
		return PIE*radius*radius;
	}
	private static double circumference(int radius) {
	
		return 2*PIE*radius;
	}

}

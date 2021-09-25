package sept23javaAssignment;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter students details:");
     Student[] student=new Student[5];
     student[0]=new Student();
     student[1]=new Student();
     student[2]=new Student();
     student[3]=new Student();
     student[4]=new Student();
     Scanner sc=new Scanner(System.in);
 
       for(int i=0;i<5;i++) {
    	   System.out.print("Enter student name");
	    student[i].setStudentName(sc.nextLine());
	    System.out.println();
	    System.out.print("Enter father");
	    student[i].setfatherName(sc.nextLine());
	    System.out.println("roll");
	    student[i].setRollNumber(sc.nextInt());
	    System.out.println();
	    System.out.print("cousres");
	    student[i].setCourse(sc.nextLine());
	    System.out.println();
	    System.out.print("duration");
	    student[i].setDuration(sc.nextInt());
             }
         for(Student st:student) {
        	 System.out.println(st.getStudentName());
        	System.out.println(st.getfatherName()); 
        	System.out.println(st.getRollNumber()); 
        	 System.out.println(st.getCourse());
        	 System.out.println(st.getDuration());
         }
     
     sc.close();
     
	}

}

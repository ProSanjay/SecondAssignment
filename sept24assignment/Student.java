package sept24assignment;

public class Student {
	private String studentName;
	private String fatherName;
	private int rollNumber;
	private String course;
	private int duration;
  public Student(String studentName,String fatherName,int rollNumber,String course,int duration){
	  this.studentName=studentName;
	  this.fatherName=fatherName;
	  this.rollNumber=rollNumber;
	  this.course=course;
	  this.duration=duration;
  }
  public void show() {
	  System.out.println("Student name:"+studentName);
	  System.out.println("Father name:"+fatherName);
	  System.out.println("Roll Number:"+rollNumber);
	  System.out.println("Course:"+course);
	  System.out.println("Course Duration:"+duration);
  }
}

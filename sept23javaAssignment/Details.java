package sept23javaAssignment;

public class Details {

	public static void main(String[] args) {
	Student sanjay=new Student();
     sanjay.setStudentName("Sanjay");
     sanjay.setfatherName("Kalyan Singh");
     sanjay.setRollNumber(58);
     sanjay.setCourse("BCA");
     sanjay.setDuration(3);
     Student sumit=new Student();
     sumit.setStudentName("Sumit");
     sumit.setfatherName("Kalyan Singh");
     sumit.setRollNumber(45);
     sumit.setCourse("10th");
     sumit.setDuration(3);
     Student manoj=new Student();
     manoj.setStudentName("Manoj");
     manoj.setfatherName("Vikash");
     manoj.setRollNumber(78);
     manoj.setCourse("BCA");
     manoj.setDuration(3);
     Student prem=new Student();
     prem.setStudentName("Prem");
     prem.setfatherName("Sanjay Singh");
     prem.setRollNumber(58);
     prem.setCourse("BCA");
     prem.setDuration(3);
     Student sonu=new Student();
     sonu.setStudentName("sonu");
     sonu.setfatherName("sonu Singh");
     sonu.setRollNumber(8);
     sonu.setCourse("BCA");
     sonu.setDuration(3);
      System.out.println("Details of first student:");
      System.out.println(sanjay.getStudentName());
      System.out.println(sanjay.getfatherName());
      System.out.println(sanjay.getRollNumber());
      System.out.println(sanjay.getCourse());
      System.out.println(sanjay.getDuration());
      System.out.println("Details of second student:");
      System.out.println(sumit.getStudentName());
      System.out.println(sumit.getfatherName());
      System.out.println(sumit.getRollNumber());
      System.out.println(sumit.getCourse());
      System.out.println(sumit.getDuration());
      System.out.println("Details of third student:");
      System.out.println(manoj.getStudentName());
      System.out.println(manoj.getfatherName());
      System.out.println(manoj.getRollNumber());
      System.out.println(manoj.getCourse());
      System.out.println(manoj.getDuration());
      System.out.println("Details of fourth student:");
      System.out.println(prem.getStudentName());
      System.out.println(prem.getfatherName());
      System.out.println(prem.getRollNumber());
      System.out.println(prem.getCourse());
      System.out.println(prem.getDuration());
      System.out.println("Details of fifth student:");
      System.out.println(sonu.getStudentName());
      System.out.println(sonu.getfatherName());
      System.out.println(sonu.getRollNumber());
      System.out.println(sonu.getCourse());
      System.out.println(sonu.getDuration());

	}

}

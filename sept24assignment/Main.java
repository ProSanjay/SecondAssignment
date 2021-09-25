package sept24assignment;

public class Main {

	public static void main(String[] args) {
    Student sanjay=new Student("sanjay","kalyan singh",59,"BCA",4);
    Student sumit=new Student("sumit","kalyan singh",49,"10th",1);
    Student vikash=new Student("vikash","manoj",89,"B.tech",4);
    Student manoj=new Student("manoj","sanjay",29,"BCA",4);
    Student suraj=new Student("suraj","prem chopra",99,"B.sc",4);
    System.out.println("Details of first student:");
    sanjay.show();
    System.out.println("Details of second student:");
    sumit.show();
    System.out.println("Details of third student:");
    vikash.show();
    System.out.println("Details of fourth student:");
    manoj.show();
    System.out.println("Details of fifth student:");
    suraj.show();
	}

}

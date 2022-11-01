package Interface;

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetStudent_Details2 s = new GetStudent_Details2();
		s.getStudentId();
		s.getStudentName();
		s.getStudentCourse();
		s.getStudentAddress();
	}

}
interface Student
{
	public static final int sid = 100;
	public static final String sname = "saikishore";
	public static final String scourse = "JAVA";
	public static final String saddress = "CHENNAI";
	
	
	abstract void getStudentId();
	abstract void getStudentName();
	abstract void getStudentCourse();
	abstract void getStudentAddress();
}
abstract class GetStudent_Details1 implements Student
{
	
	public void getStudentId() {
		System.out.println(Student.sid);
	}
	public void getStudentName() {
		System.out.println(Student.sname);
	}
	
	
}
class GetStudent_Details2 extends GetStudent_Details1
{
	public void getStudentCourse() {
		System.out.println(Student.scourse);
	}
	public void getStudentAddress() {
		System.out.println(Student.saddress);
	}
}
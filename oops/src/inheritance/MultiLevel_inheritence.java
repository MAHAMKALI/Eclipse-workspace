package inheritance;

public class MultiLevel_inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e = new Employees(10,"SALES","CHENNAI","RAJESH",2000.00f);
		e.Department_id();
		e.Department_name();
		e.Location_name();
		e.Employee_name();
		e.Employee_sal();
	}

}
class Departments
{
	int did;
	String dname;
	Departments(int did,String dname){
		this.did=did;
		this.dname=dname;
	}
	void Department_id() {
		System.out.println(did);
	}
	void Department_name() {
		System.out.println(dname);
	}
}
class Locations extends Departments
{
	String loc;
	Locations(int did, String dname,String loc) {
		super(did, dname);
		// TODO Auto-generated constructor stub
		this.loc = loc;
	}
	void Location_name() {
		System.out.println(loc);
	}
	
}
class Employees extends Locations
{
	String ename;
	float esal;
	Employees(int did, String dname, String loc,String ename,float esal) {
		super(did, dname, loc);
		// TODO Auto-generated constructor stub
		this.ename=ename;
		this.esal=esal;
	}
	void Employee_name() {
		System.out.println(ename);
	}
	void Employee_sal() {
		System.out.println(esal);
	}
	
}
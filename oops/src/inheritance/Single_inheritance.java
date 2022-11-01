package inheritance;

public class Single_inheritance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInfo e = new EmployeeInfo(10,"MARKETING","KISHORE",2300.00f);
		e.Department_id();
		e.Department_name();
		e.Employee_name();
		e.Employee_sal();
	}

}
class DepartmentsInfo
{
	int did;
	String dname; 
	DepartmentsInfo(int did,String dname){
		this.did = did;
		this.dname=dname;
	}
	void Department_id() {
		System.out.println(did);
	}
	void Department_name() {
		System.out.println(dname);
	}
}

class EmployeeInfo extends DepartmentsInfo
{
	String ename;
	float esal;
	EmployeeInfo(int did, String dname,String ename,float esal) {
		super(did, dname);
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
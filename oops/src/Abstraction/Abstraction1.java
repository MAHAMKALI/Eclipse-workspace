package Abstraction;

public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("sai");
		p.setAge(25);
		p.setSalary(200.00f);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getSalary());
		
	}

}
abstract class Employee
{
	String ename;
	int age;
	float salary;
	void setName(String s) {
		ename=s;
	}
	void setAge(int a) {
		age = a;
	}
	abstract void setSalary(float f);
	abstract String getName();
	abstract int getAge();
	abstract float getSalary();
}
class Person extends Employee
{
	public void setSalary(float f) {
		super.salary = f;
	}
	public String getName() {
		return super.ename;
	}
	
	public int getAge() {
		return super.age;
	}
	public float getSalary() {
		return super.salary;
	}
}
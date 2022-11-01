package Interface;

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		GrandParent gp  = new Child();
		Parent p = new Child();
		gp = c.Choose(gp);
		p =c.Choose(p);
		gp.get_name();
		gp.get_age();
		p.get_name();
		p.get_age();
	}

}

interface GrandParent
{
	abstract void get_name();
	abstract void get_age();
	
}
interface Parent 
{
	abstract void get_name();
	abstract void get_age();
}
class Child implements GrandParent,Parent
{
	public void get_name() {
		
	}
	public void get_age() {
		
	}
	public GrandParent Choose(GrandParent gp) {
		return new GrandParent() 
		{
			public void get_name()
			{
				System.out.println("Grandfather");
			}
			public void get_age() {
				System.out.println("100");
			}
		};
	}
	public Parent Choose(Parent p) {
		return new Parent() 
		{
			public void get_name()
			{
				System.out.println("father");
			}
			public void get_age() {
				System.out.println("50");
			}
		};
	}
}
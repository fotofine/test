package toString;

public class Person {

	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person()
	{
		
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	public void println()
	{
		System.out.println("This is a test");
	}
}

class Student
{
	private String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}

class Encapsulation
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.setName("Shruti");
		System.out.println(s.getName());
	}
}
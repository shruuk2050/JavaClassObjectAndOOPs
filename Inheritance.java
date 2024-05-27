class Employee
{
	float salary = 40000;
}
class Inheritance extends Employee
{
	int bonus = 10000;
	public static void main(String args[])
	{
		Inheritance i = new Inheritance();
		System.out.println("Salary is : " + i.salary);
		System.out.println("Bonus is : " + i.bonus);
	}
}
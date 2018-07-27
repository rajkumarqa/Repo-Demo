package OtherTests;

import java.util.ArrayList;

public class Employee {
	
	String name;
	int age;
	String dept;
	
	public Employee(String name,int age, String dept)
	{
		this.name=name;
		this.age=age;
		this.dept=dept;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee e1= new Employee("Raj", 30, "QA");
		Employee e2= new Employee("prabha", 20,"Dev");
		Employee e3= new Employee("Mani", 26, "admin");
		Employee e4= new Employee("Mani", 26, "admin");
		*/
		
		ArrayList<Employee> arr=new ArrayList<Employee>();
		
		arr.add(new Employee("Raj", 30, "QA"));
		arr.add(new Employee("prabha", 20,"Dev"));
		arr.add(new Employee("Mani", 26, "admin"));
		arr.add(new Employee("Mani", 26, "admin"));
		arr.add(new Employee("kumar", 30, "QA"));
		arr.add(new Employee("arun", 30, "HR"));
		
		for(int i=0;i<arr.size();i++)
			
		{
			System.out.println(arr.get(i).name+" "+arr.get(i).age+" "+arr.get(i).dept);
		}
		
		
		
		
		
		
	}

}

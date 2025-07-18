import java.util.stream.Collectors;
import java.util.*;
class Employee{
	private int id;
    private String name;
    private String department;
    private double salary;
    private int age;

    public Employee(int id, String name, String department, double salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", age="
				+ age + "]";
	}
	
    
}
public class Play {
public static void main(String[]args){

List<Employee> list = Arrays.asList(
	    new Employee(1, "Alice", "HR", 50000, 30),
	    new Employee(2, "Bob", "IT", 70000, 28),
	    new Employee(3, "Charlie", "IT", 80000, 35),
	    new Employee(4, "David", "Sales", 40000, 25),
	    new Employee(5, "Eve", "HR", 55000, 32),
	    new Employee(6, "Frank", "IT", 75000, 29)
	);

//XXXXXXXXXXXXXXXXXXXXXXXXXXXX
	Map<String,List<String>> emp = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toList())));
//System.out.println(emp);
//XXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXX
DoubleSummaryStatistics sol = list.stream().mapToDouble(Employee::getSalary).summaryStatistics();
//XXXXXXXXXXXXXXXX     


}
}
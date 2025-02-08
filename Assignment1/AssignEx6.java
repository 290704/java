package Assignment1;
class Employee{
	String name;
	String jobTitle;
	double salary;
	
	Employee(String name,String jobTitle,double salary){
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	
	double calculateSalaryIncrease(double percentage) {
		return (salary*percentage)/percentage;
	}
	
	void  updateSalary(double percentage) {
		double increase=calculateSalaryIncrease(percentage);
		this.salary+=increase;
		System.out.println("salary increment successfully:"+this.salary);
	}
	void employeeDetail() {
		System.out.println("Employee Name:"+name);
		System.out.println("Employee jobTitle:"+jobTitle);
		System.out.println("Employee salary:"+salary);
		
	}
}
public class AssignEx6 {
	public static void main(String args[]) {
		Employee emp=new Employee("Priya","Software Engineer",35000d);
		emp.employeeDetail();
		emp.updateSalary(10);
		
		
		
		
	}
}

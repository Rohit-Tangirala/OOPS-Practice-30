package Basicjava;

public class EmployeeSalaries {

	String name;
	int empid;
	long salary;
	 void displaydetails() {
		  System.out.print("Employee name is :" + name);
		  System.out.println("Employee id is:" +empid );
		  System.out.println("Salary of the employee is : " + salary);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EmployeeSalaries emp1 = new EmployeeSalaries();
         emp1.name = "Rakesh Kumar";
         emp1.empid = 92;
         emp1.salary = 12000;
        emp1.displaydetails();
	}

}

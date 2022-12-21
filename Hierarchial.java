import java.util.Scanner;
// Base class
class Employee{
	String name;
	int age;
	double mobile;
	String address;
	double salary;
	// Method for inputting details
	void InputDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("Enter Age");
		age = sc.nextInt();
		System.out.println("Enter Mobile");
		mobile = sc.nextDouble();
		System.out.println("Enter Address");
		address = sc.next();
		System.out.println("Enter Salary");
		salary = sc.nextDouble();
	}
	// Method for Displaying details
	void DisplayDetails(){
		System.out.println("Name:"+ name);
		System.out.println("Age:"+ age);
		System.out.println("Mobile:"+ mobile);
		System.out.println("Address:"+ address);
	}
	// Method for printing salary
	void getSalary(){
		System.out.println("Salary:" + salary);
	}
}
// Sub class 1 for employee
class Officer extends Employee{
	String specialisation;
	// Method for setting specialisation of officer
	void setSpecialisation(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Specialisation of Officer:");
		specialisation = sc.nextLine();
	}
	// Method for printing specialisation of officer
	void getSpecialisation(){
		System.out.println("Specialisation:"+ specialisation);
	}

}
// Sub class 2 for Manager
class Manager extends Employee{
	String department;
	// Method for setting department of Manager
	void setDepartment(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department of Manager:");
		department = sc.nextLine();
	}
	// Method for printing department of officer
	void getDepartment(){
		System.out.println("Department:"+ department);
	}
}
// Main Class
class Hierarchial{
	public static void main(String [] args){
		// Objects for Officer and manager
		Officer o = new Officer();
		Manager m = new Manager();
		System.out.println("Enter officer Details:");
		o.InputDetails();
		o.setSpecialisation();
		System.out.println("Enter Manager Details:");
		m.InputDetails();
		m.setDepartment();
		// Display all details
		System.out.println("Officer Details: \n =================");
		o.DisplayDetails();
		o.getSalary();
		o.getSpecialisation();
		System.out.println("Manager Details: \n =================");
		m.DisplayDetails();
		m.getSalary();
		m.getDepartment();
	}

}

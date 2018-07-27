import java.util.*;

public class EmployeeTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		// Taking Input
		System.out.println("Enter the id");
		int id = scanner.nextInt();

		System.out.println("Enter the name");
		String name = scanner.next();

		System.out.println("Enter the monthlyBasic");
		int monthlyBasic = scanner.nextInt();

		Employee employee = new Employee();

		int annualBasic = employee.getAnnualBasic(monthlyBasic);
		System.out.println("Annual Basic is " + annualBasic);

		// Calling function for Calculating
		int hra = employee.getHra();
		int medicalAllowance = employee.getMedicalallowance();
		int conveyanceAllowance = employee.getConveyanceallowance();
		int monthlyGrossSalary = employee.getMonthlyGrossSalary();
		System.out.println("Monthly Gross Salary is " + monthlyGrossSalary);

		int annualGrossSalary = employee.getAnnualGrossSalary(monthlyGrossSalary);
		System.out.println("Annual Gross Salary is " + annualGrossSalary);

		int monthlyDeductions = employee.getMonthlyDeductions();
		System.out.println("Monthly Deduction is " + monthlyDeductions);

		int monthlytakeHome = employee.getMonthlyTakeHome(monthlyGrossSalary, monthlyDeductions);
		System.out.println("Monthly Take Home is " + monthlytakeHome);
	}
}

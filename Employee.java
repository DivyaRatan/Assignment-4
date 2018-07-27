
public class Employee {
	int id;
	String name;
	int monthlyBasic;
	int hra = monthlyBasic / 2;
	static final int medicalAllowance = 1250;
	static final int conveyanceAllowance = 800;
	float PFRate;

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

	public int getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(int monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}

	public int getHra() {
		return hra;
	}

	public static int getMedicalallowance() {
		return medicalAllowance;
	}

	public static int getConveyanceallowance() {
		return conveyanceAllowance;
	}

	public float getPFRate() {
		return PFRate;
	}

	public void setPFRate(float pFRate) {
		PFRate = pFRate;
	}

	public int getAnnualBasic(int monthlyBasic) {// Function for Calculating Annual Basic Salary
		int AnnualBasic = (12 * monthlyBasic);
		return AnnualBasic;
	}

	public int getMonthlyGrossSalary() {// Function for Calculating Monthly Gross Salary
		int MonthlyGrossSalary = monthlyBasic + hra + medicalAllowance + conveyanceAllowance;
		return MonthlyGrossSalary;
	}

	public int getAnnualGrossSalary(int MonthlyGrossSalary) {// Function for Calculating Annual Gross Salary
		int AnnualGrossSalary = (12 * MonthlyGrossSalary);
		return AnnualGrossSalary;
	}

	public int getMonthlyDeductions() {// Function for calculating Monthly Deduction
		int PF;
		if ((monthlyBasic / 10) < 6500) {
			PF = (monthlyBasic / 10);
		} else
			PF = 6500;
		int ESIC;
		if (monthlyBasic <= 5000) {
			ESIC = (475 * monthlyBasic) / 10000;
		} else
			ESIC = 0;
		int ProfTax;
		Employee emp = new Employee();
		int monthlyGrossSalary = emp.getMonthlyGrossSalary();
		if (monthlyGrossSalary <= 10000) {
			ProfTax = 50;
		} else
			ProfTax = 100;
		int MonthlyDeductions = PF + ESIC + ProfTax;
		return MonthlyDeductions;
	}

	public int getMonthlyTakeHome(int MonthlyGrossSalary, int MonthlyDeductions) {// Function for Calculating Monthly
																					// Take Home
		int MonthlyTakeHome = MonthlyGrossSalary - MonthlyDeductions;
		return MonthlyTakeHome;
	}

	public int getAnnualTakeHome(int MonthlyTakeHome) {// Function for Calculating Annual Take Home
		int AnnualTakeHome = (12 * MonthlyTakeHome);
		return AnnualTakeHome;
	}

}

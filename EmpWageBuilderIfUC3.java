
public class EmpWageBuilderIfUC3 {

	public static void main(String[] args) {
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		double empcheck = Math.floor(Math.random() *10) % 3;
		if (empcheck == 2)
			empHrs = 8;
		else if (empcheck == 1)
			empHrs = 4;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}

}

/**
 * Student name: Alessandra Prunzel Kittlaus
 * Student Number: 041096703
 * Course: CST8284_331
 * Assignment: LAB_06 
 * Date: November, 19.
 * Professor: Islam Gomaa
 * Description: The "BasePlusCommissionProgrammer" class extends the
 * "CommissionProgrammer" class. It represents programmers who are paid based on
 * commission, with an additional base salary.
 */

public class BasePlusCommissionProgrammer extends CommissionProgrammer {

	private double baseSalary; // base salary per week

	/**
	 * Constructor
	 * 
	 * @param firstName            The first name of the base plus commission
	 *                             programmer.
	 * @param lastName             The last name of the base plus commission
	 *                             programmer.
	 * @param socialSecurityNumber The social security number of the base plus
	 *                             commission programmer.
	 * @param month                The hire month of the base plus commission
	 *                             programmer.
	 * @param year                 The hire year of the base plus commission
	 *                             programmer.
	 * @param grossSales           The gross weekly sales of the base plus
	 *                             commission programmer.
	 * @param commissionRate       The commission rate for the base plus commission
	 *                             programmer.
	 * @param baseSalary           The base salary per week for the base plus
	 *                             commission programmer.
	 * @throws IllegalArgumentException If base salary is less than 0.0.
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month,
			int year, double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, month, year, grossSales, commissionRate);

		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	/**@param baseSalary The new base salary.
	 * @throws IllegalArgumentException If base salary is less than 0.0.
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

	/** @return The base salary. */
	public double getBaseSalary() {
		return baseSalary;
	}

	/**
	 * Calculates and returns the payment amount for the base plus commission
	 * programmer.
	 * @return The calculated payment amount.
	 */
	@Override
	public double getPaymentAmount() {

		return getBaseSalary() + super.getPaymentAmount();
	}

	/**
	 * @return A string representation of the BasePlusCommissionProgrammer object.
	 */
	@Override
	public String toString() {
		
		return String.format("Base-plus Commission Programmer: %s %s%n"
				+ "Social Security number: %s%n"
				+ "Gross Sale: $%,.2f;"
				+ " Comission rate: $%,.2f;"
				+ " Base Salary: $%,.2f",
				super.getFirstName(), super.getLastName(),
				super.getSocialSecurityNumber(),
				super.getGrossSales(), super.getCommissionRate(), getBaseSalary());
	}

}

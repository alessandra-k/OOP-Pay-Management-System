/**
 * Student name: Alessandra Prunzel Kittlaus
 * Student Number: 041096703
 * Course: CST8284_331
 * Assignment: LAB_06 
 * Date: November, 19.
 * Professor: Islam Gomaa
 * Description: The "SalariedProgrammer" class is a concrete class that extends
 * the abstract class "Programmer". It represents regular salaried programmers
 */

public class SalariedProgrammer extends Programmer {

	private double weeklySalary;

	 /** Constructor
	 * @param firstName            The first name of the salaried programmer.
	 * @param lastName             The last name of the salaried programmer.
	 * @param socialSecurityNumber The social security number of the salaried
	 *                             programmer.
	 * @param month                The hire month of the salaried programmer.
	 * @param year                 The hire year of the salaried programmer.
	 * @param weeklySalary         The weekly salary of the salaried programmer.
	 * @throws IllegalArgumentException If weekly salary is less than 0.0.
	 */
	public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

	/**@param weeklySalary The new salaried programmer weekly salary.
	 * @throws IllegalArgumentException If weekly salary is less than 0.0.
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

	/** @return The weekly salary. */
	public double getWeeklySalary() {
		return weeklySalary;
	}

	/** @return The calculated payment amount. */
	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}

	/** @return A string representation of the SalariedProgrammer object. */
	@Override
	public String toString() {
	    return String.format("Salaried Programmer: %s"
	    		+ "Weekly Salary: $%,.2f%n"
	    		+ "Payment Due: $%,.2f%n",
	            super.toString(), getWeeklySalary(), getPaymentAmount());
	}
}

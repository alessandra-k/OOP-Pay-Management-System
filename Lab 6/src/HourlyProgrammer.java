/**
 * Student name: Alessandra Prunzel Kittlaus
 * Student Number: 041096703
 * Course: CST8284_331
 * Assignment: LAB_06 
 * Date: November, 19.
 * Professor: Islam Gomaa
 * Description: The "HourlyProgrammer" class extends the "Programmer" class and
 * represents programmers who are paid on an hourly basis.
 */

public class HourlyProgrammer extends Programmer {

	private double wage; // wage per hour
	private double hours; // hours worked for week

	/** Constructor
	 * @param firstName            The first name of the hourly programmer.
	 * @param lastName             The last name of the hourly programmer.
	 * @param socialSecurityNumber The social security number of the hourly
	 *                             programmer.
	 * @param month                The hire month of the hourly programmer.
	 * @param year                 The hire year of the hourly programmer.
	 * @param wage                 The hourly wage of the hourly programmer.
	 * @param hours                The hours worked for the week by the hourly
	 *                             programmer.
	 * @throws IllegalArgumentException If hourly wage is less than 0.0 or if hours
	 *                                  worked is less than 0.0 or greater than
	 *                                  168.0.
	 */
	public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	}

	/**@param wage sets new hourly wage.
	 * @throws IllegalArgumentException If hourly wage is less than 0.0. */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	}

	/**@return The hourly wage. */
	public double getWage() {
		return wage;
	}

	/**@param hours set new hours worked.
	 * @throws IllegalArgumentException If hours worked is less than 0.0 or greater
	 *                                  than 168.0.  */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	}

	/**@return The hours worked. */
	public double getHours() {
		return hours;
	}

	/**Calculates and returns the payment amount for the hourly programmer. If the
	 * hours worked are less than or equal to 40, there is no overtime. Otherwise,
	 * overtime is calculated at 1.5 times the hourly wage.
	 * @return The calculated payment amount.
	 */
	@Override
	public double getPaymentAmount() {
		if (getHours() <= 40) { // no overtime
			return getWage() * getHours();
		} else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

	/**@return A string representation of the HourlyProgrammer
	 *         object. */
	@Override
	public String toString() {
		return String.format("Hourly Programmer: %s"
				+ "Hourly wage: $%.2f"
				+ " hours worked: %.2f%n;"
				+ "Payment Due: $%,.2f%n", 
				super.toString(), getWage(), getHours(),
				getPaymentAmount());
	}

}

/**
 * Student name: Alessandra Prunzel Kittlaus
 * Student Number: 041096703
 * Course: CST8284_331
 * Assignment: LAB_06 
 * Date: November, 19.
 * Professor: Islam Gomaa
 * Description: The "CommissionProgrammer" class extends the "Programmer" class
 * and represents programmers who are paid based on commission.
 */

public class CommissionProgrammer extends Programmer {

	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

	/** Constructor
	 * @param firstName            The first name of the commission programmer.
	 * @param lastName             The last name of the commission programmer.
	 * @param socialSecurityNumber The social security number of the commission
	 *                             programmer.
	 * @param month                The hire month of the commission programmer.
	 * @param year                 The hire year of the commission programmer.
	 * @param grossSales           The gross weekly sales of the commission
	 *                             programmer.
	 * @param commissionRate       The commission rate for the commission
	 *                             programmer.
	 * @throws IllegalArgumentException If commission rate is not between 0.0 and
	 *                                  1.0, or if gross sales is less than 0.0.
	 */
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year,
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	/**@param grossSales Sets a new gross sales amount.
	 * @throws IllegalArgumentException If gross sales is less than 0.0.
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	}

	/** @return The gross sales amount. */
	public double getGrossSales() {
		return grossSales;
	}

	/**@param Sets the new commission rate.
	 * @throws IllegalArgumentException If commission rate is not between 0.0 and
	 *                                  1.0.
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	}

	/** @return The commission rate. */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * Calculates the payment amount for the commission programmer.
	 * @return The calculated payment amount.
	 */
	@Override
	public double getPaymentAmount() {
		return getCommissionRate() * getGrossSales();
	}

	/**
	 * @return A string representation of the CommissionProgrammer object.
	 */
	@Override
	public String toString() {
		return String.format(
				"Comission Programmer: %s"
				+ "Gross Sales: $%,.2f;"
				+ " Comission rate: %,.2f%n"
				+ "Payment Due: $%,.2f%n",
				super.toString(),
				getGrossSales(), getCommissionRate(),
				getPaymentAmount());
	}

}

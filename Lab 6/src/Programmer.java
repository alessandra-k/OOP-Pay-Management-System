/**
 * Student name: Alessandra Prunzel Kittlaus
 * Student Number: 041096703
 * Course: CST8284_331
 * Assignment: LAB_06 
 * Date: November, 19.
 * Professor: Islam Gomaa
 * Description: The abstract class "Programmer" represents a generic programmer
 * and implements the "Payme" interface. It provides common attributes such as
 * name, social security number, and hire date for programmers. Subclasses are
 * expected to implement the "getPaymentAmount" method for calculating payment.
 */


public abstract class Programmer implements Payme {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private int month;
	private int year;

	/**Constructor
	 * @param first The first name of the programmer.
	 * @param last  The last name of the programmer.
	 * @param ssn   The social security number of the programmer.
	 * @param month The hire month of the programmer.
	 * @param year  The hire year of the programmer.
	 */
	public Programmer(String first, String last, String ssn, int month, int year) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		this.month = month;
		this.year = year;
	}

	/** @return The first name of the programmer. */
	public String getFirstName() {
		return firstName;
	}

	/** @param firstName - The new first name of the programmer. */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/** @return The last name of the programmer. */
	public String getLastName() {
		return lastName;
	}

	/** @param lastName - The new last name of the programmer. */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/** @return The social security number of the programmer. */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/** @param socialSecurityNumber - The new social security number of the programmer. */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/** @return The hire month of the programmer. */
	public int getMonth() {
		return month;
	}

	/** @param month - The new hire month of the programmer. */
	public void setMonth(int month) {
		this.month = month;
	}

	/** @return The hire year of the programmer. */
	public int getYear() {
		return year;
	}

	/** @param year - The new hire year of the programmer. */
	public void setYear(int year) {
		this.year = year;
	}

    /**
     * Returns a string representation of each programmer, including first name,
     * last name, and social security number.
     * @return A string representation of each programmer.
     */
	@Override
	public String toString() {
		return String.format("%s %s%nSocial Security number: %s%n", getFirstName(), getLastName(),
				getSocialSecurityNumber());
	}

    /**
     * Abstract method to be implemented by subclasses for calculating the payment amount.
     * @return The calculated payment amount.
     */
	public abstract double getPaymentAmount();

}

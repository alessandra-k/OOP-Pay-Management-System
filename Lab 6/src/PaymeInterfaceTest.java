/**
 * Student name: Alessandra Prunzel Kittlaus
 * Student Number: 041096703
 * Course: CST8284_331
 * Assignment: LAB_06 
 * Date: November, 19.
 * Professor: Islam Gomaa
 * Description: The "PaymeInterfaceTest" class serves as a test class for the
 * "Payme" interface and its implementations. It demonstrates polymorphic
 * behavior by processing payments for both invoices and various types of
 * programmers
 */

public class PaymeInterfaceTest {

	public static void main(String[] args) {

		Payme[] payme = new Payme[6];

		payme[0] = new Invoice("22776", "brakes", 3, 300.00);
		payme[1] = new Invoice("33442", "gear", 5, 90.99);
		payme[2] = new SalariedProgrammer("Chioma", "Chidima", "345-67-0001", 0, 0, 320.00);
		payme[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 0, 0, 18.95, 40.00);
		payme[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 0, 0, 16500, 0.44);
		payme[5] = new BasePlusCommissionProgrammer("Alessandra", "Prunzel Kittlaus", "102-34-5888", 0, 0, 1200, 0.44,
				720.00);

		System.out.println("Payment for Invoices and Programmers are processed polymorphically:\n");

		// for-each looping
		// Iterate through each Payme element and display payment details
		for (Payme currentPayme : payme) {
			// output currentPayme and its appropriate payment amount
			System.out.printf("%s \n", currentPayme.toString());

			// Check if the currentPayme is an instance of BasePlusCommissionProgrammer
			if (currentPayme instanceof BasePlusCommissionProgrammer) {

				// downcast Payme reference to BasePlusCommissioProgrammer reference
				BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;

				// Increase base salary by 5%
				double oldBaseSalary = programmer.getBaseSalary();
				programmer.setBaseSalary(oldBaseSalary * 1.05);
				System.out.printf("New base salary with 5%% increase is: $%,.2f%n" + "Payment due: $%,.2f",
						programmer.getBaseSalary(), programmer.getPaymentAmount());
			}

		}
	}
}

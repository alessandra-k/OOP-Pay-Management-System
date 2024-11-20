# OOP Pay Management System

This project demonstrates the use of **Object-Oriented Programming (OOP)** principles in Java to build a payroll system. The system calculates payments for various types of objects (invoices and programmers) in a polymorphic manner using interfaces, abstract classes, and inheritance.

---

## Objective

1. Create a **hierarchy of programmer classes** using inheritance and polymorphism.
2. Use the `Payme` interface to standardize the calculation of payment amounts for all classes implementing the interface.
3. Process different objects **polymorphically** using a common interface and dynamically determine their payment amounts.
4. Demonstrate polymorphic behavior by processing both unrelated classes (`Invoice`) and related subclasses (`Programmer` hierarchy).

---

## Key Features

- Calculates payments for invoices and multiple types of programmers.
- Uses **dynamic method dispatch** to handle polymorphic behavior during runtime.
- Processes special cases, such as increasing the base salary of `BasePlusCommissionProgrammer` by 5% before payment calculation.
- Outputs detailed payment information for all objects.

---

## Technologies Used

- **Programming Language**: Java
- **Concepts**: Interfaces, Abstract Classes, Inheritance, Polymorphism
- **Design Pattern**: Polymorphic Behavior Implementation
- **Testing**: Console-based output
- **Development Environment**: Eclipse

---

## Key Concepts

### Abstract Classes
- The `Programmer` class is abstract and provides common attributes such as name, social security number, and hire date.
- Contains an abstract method `getPaymentAmount()` that each subclass must override.

### Interfaces
- The `Payme` interface defines a contract for calculating payment amounts.
- Both `Invoice` (unrelated class) and `Programmer` (abstract superclass) implement `Payme`.

### Inheritance
- Subclasses (`SalariedProgrammer`, `HourlyProgrammer`, `CommissionProgrammer`, and `BasePlusCommissionProgrammer`) inherit from the `Programmer` class and override its methods to calculate payments.

### Polymorphism
- Objects of unrelated (`Invoice`) and related (`Programmer` subclasses) types are processed uniformly through the `Payme` interface.

### Encapsulation
- Each class uses private fields and public getters and setters to manage data, ensuring integrity.

---

## Dynamic Behavior

In the `PaymeInterfaceTest` class:
1. **Stores Objects**: An array of `Payme` references holds objects of both unrelated (`Invoice`) and related (`Programmer` subclasses) types.
2. **Iterates Over Array**: The program iterates through the array, dynamically calling the appropriate `getPaymentAmount()` method for each object.
3. **Special Case Handling**: If the object is a `BasePlusCommissionProgrammer`, the base salary is increased by 5%, and the updated payment amount is displayed.

---

## Sample Output:
Payment for Invoices and Programmers are processed polymorphically:

invoice: 
part number: 22776 (brakes) 
quantity: 3 
price per item: $300.00
payment due:: $900.00
 
invoice: 
part number: 33442 (gear) 
quantity: 5 
price per item: $90.99
payment due:: $454.95
 
Salaried Programmer: Chioma Chidima
Social Security number: 345-67-0001
Weekly Salary: $320.00
Payment Due: $320.00
 
Hourly Programmer: Amara Chukwu
Social Security number: 234-56-7770
Hourly wage: $18.95 hours worked: 40.00
;Payment Due: $758.00
 
Comission Programmer: Peter Goodman
Social Security number: 123-45-6999
Gross Sales: $16,500.00; Comission rate: 0.44
Payment Due: $7,260.00
 
Base-plus Commission Programmer: Alessandra Prunzel Kittlaus
Social Security number: 102-34-5888
Gross Sale: $1,200.00; Comission rate: $0.44; Base Salary: $720.00 
New base salary with 5% increase is: $756.00
Payment due: $1,284.00

## Author
👩‍💻 Alessandra Prunzel Kittlaus

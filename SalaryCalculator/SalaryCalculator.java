/**
 * The SalaryCalculator program implements an application that
 * calculates  salary increase, tax, bonus and Total Salary of
 * an employee.
 *
 * @author S.Çapar
 * @version 1.0, 10/04/2022
 * @since 1.0
 */
public class SalaryCalculator {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Employee alex = new Employee("Alex", 12000.0, 58, 1982);
        System.out.println(alex.toString());
        Employee mary = new Employee("Mary", 4500.0, 120, 2015);
        System.out.println(mary.toString());
    }
}

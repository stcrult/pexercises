public class Employee {
    String name;
    Double salary;
    int workHours;
    int hireYear;
    double tax = 0;
    double bonus = 0;
    int currYear = 2021;
    double salaryIncrease = 0;
    double totalSalary = 0;

    public Employee(String name, Double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        raiseSalary();
        calculateTax();
        calculateBonus();
        calculateTotalSalary();
    }

    public void calculateTax() {
        if (salary + salaryIncrease > 1000) tax = (salary + salaryIncrease) * 0.03;
    }

    public void calculateBonus() {
        if (workHours > 40) bonus = (workHours - 40) * 30;
    }

    public void raiseSalary(){
        int difference = currYear - hireYear;
        double ratio;
        if (difference < 10)  ratio = 0.05;
        else if (difference < 20) ratio = 0.10;
        else ratio = 0.15;
        salaryIncrease = salary * ratio;
    }

    public void calculateTotalSalary() {
        totalSalary = salary + salaryIncrease + bonus - tax;
    }

    @Override
    public String toString() {
        return  "Name            = " + name  + "\n" +
                "Salary          = " + salary + "\n" +
                "Hire Year       = " + hireYear + "\n" +
                "Work Hours      = " + workHours + "\n" +
                "Salary Increase = " + salaryIncrease + "\n" +
                "Tax             = " + tax + "\n" +
                "Bonus           = " + bonus + "\n" +
                "Total Salary    = " + totalSalary + "\n";
    }
}

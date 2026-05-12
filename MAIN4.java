
abstract class employee {
    String name;
    int id;

     employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class fullTimeEmployee extends employee {
    double monthlySalary;

    fullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary() {
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

class partTimeEmployee extends employee {
    double salary;
    int hoursPerWeek;

    partTimeEmployee(String name, int id, double salary, int hoursPerWeek) {
        super(name, id);
        this.salary = salary;
        this.hoursPerWeek = hoursPerWeek;
    }

    void calculateSalary() {
        System.out.println("Monthly Salary: " + salary);
    }
}

public class MAIN4{
    public static void main(String[] args) {
          fullTimeEmployee f1 = new fullTimeEmployee("vineet", 1, 50000.0);
          partTimeEmployee f2 = new partTimeEmployee("Janat", 2, 20000.0, 40);

          f1.displayDetails();
          f1.calculateSalary();

          f2.displayDetails();
          f2.calculateSalary();
    }
}

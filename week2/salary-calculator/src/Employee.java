public class Employee {

    String name;
    double salary;
    int workHours;
    int yearStarted;
    double tax;
    double bonus;
    double payRaise;
    int currentYear = 2021;
    int yearsWorked = (currentYear - yearStarted);

    Employee(String name, double salary, int workHours, int yearStarted) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.yearStarted = yearStarted;
    }

    public void tax() {
        if (salary > 1000) {
            tax = (salary * 0.03);
        } else {
            tax = 0;
        }
    }

    public void bonus() {
        if (workHours >= 40) {
            bonus = ((workHours - 40) * 30);
        } else {
            bonus = 0;
        }
    }

    public void sleep() {
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void payRaise() {
        if (yearsWorked < 10) {
            payRaise = (salary * ( (double) 5 /100 ));

        } else if (yearsWorked > 9 && yearsWorked < 20) {
            payRaise = (salary * ( (double) 10 /100 ));

        } else if (yearsWorked >= 20) {
            payRaise = (salary * ( (double) 15 /100 ));
        }
    }


    public void printInfo() {
        tax();
        payRaise();
        bonus();

        System.out.println("Name: " + name);
        sleep();
        System.out.println("Salary: " + salary);
        sleep();
        System.out.println("Hours have been worked: " + workHours);
        sleep();
        System.out.println("Starting year: " + yearStarted);
        sleep();
        System.out.println("Tax: " + tax);
        sleep();
        System.out.println("Bonus: " + bonus);
        sleep();
        System.out.println("Pay raise: " + payRaise);
        sleep();
        System.out.println("Salary with tax & bonuses: " + (salary + bonus + tax));
        sleep();
        System.out.println("Total salary: " + (salary + bonus + tax + payRaise));
    }
}
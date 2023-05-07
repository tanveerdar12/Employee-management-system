import java.util.Scanner;

//Program for Employee Management System.
public class Employee {
    String employeeID;
    String employeeName;
    int salary;
    int age;
    int bonus;

    public void getEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID");
        employeeID = sc.next();

        System.out.println("Enter employee name");
        employeeName = sc.next();

        System.out.println("Enter salary");
        salary = sc.nextInt();

        System.out.println("Enter employee age");
        age = sc.nextInt();
    }

    public void showEmployee() {
        System.out.println("The employee name  is: " +employeeName +"  with employee id:"+ employeeID);
        System.out.println("The age of " + employeeName + " is "+ age);
        System.out.println("The salary  of employee "+ employeeName +" is "+ salary);

    }

    public void addBonus() {
        if (age > 40) {
            bonus = 5000;
        } else {
            bonus = 1000;
        }
        System.out.println("The bonus for " + employeeName + " is:  " + bonus);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* Employee e1 = new Employee();
        e1.getEmployee();
        e1.showEmployee();
        e1.addBonus();

        Employee e2 = new Employee();
        e2.getEmployee();
        e2.showEmployee();
        e2.addBonus();   */

            Employee e[] = new Employee[4];
        for (int i = 1; i < 4; i++) {
            e[i] = new Employee();
            e[i].getEmployee();
        }

        System.out.println("******The data entered is as below*********");

        for(int i=1; i<4;i++){
            e[i].showEmployee();
            e[i].addBonus();
            System.out.println(" ");
        }

    }
}
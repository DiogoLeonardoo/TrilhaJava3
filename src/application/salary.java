package application;
import java.util.Scanner;
import entities.salaryEntities;


public class salary {
        public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        salaryEntities salary = new salaryEntities();

        System.out.println("What's your name?");
        salary.name = scanner.nextLine();

        System.out.println("What's your gross salary?");
        salary.grossSalary = scanner.nextDouble();

        System.out.println("What's your tax?");
        salary.tax = scanner.nextDouble();

        System.out.println("Employee: " + salary.name + ", $ " + salary.netSalary());
       

        

        }
}

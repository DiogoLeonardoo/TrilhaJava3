package entities;

public class salaryEntities {
        
        public String name;
        public double grossSalary;
        public double tax;

        public double netSalary() {
            double newSalary = grossSalary + (grossSalary*tax);
            return newSalary;
        }
}

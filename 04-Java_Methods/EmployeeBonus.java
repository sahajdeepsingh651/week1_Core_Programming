import java.util.Random;
public class EmpBonus {
    public static double[][] generateempdata(int numemp) {
        Random random = new Random();
        double[][] data = new double[numemp][2];
        for (int i = 0; i < numemp; i++) {
            data[i][0] = 10000 + random.nextInt(90000);
            data[i][1] = 1 + random.nextInt(10);
        }
        return data;
    }
    public static double[][] calcnewsal(double[][] emp) {
        double[][] updatedData = new double[emp.length][2];

        for (int i = 0; i < emp.length; i++) {
            double salary = emp[i][0];
            double years = emp[i][1];
            double bonus = (years > 5) ? 0.05 * salary : 0.02 * salary;
            updatedData[i][0] = salary + bonus;
            updatedData[i][1] = bonus;
        }
        return updatedData;
    }
    public static void displaySalaryDetails(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.printf("%-10s %-15s %-10s %-15s %-10s\n", "Emp ID", "Old Salary", "Years", "New Salary", "Bonus");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];

            System.out.printf("%-10d %-15.2f %-10.0f %-15.2f %-10.2f\n",
                    (i + 1), oldData[i][0], oldData[i][1], newData[i][0], newData[i][1]);
        }
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-10s %-15.2f %-10.2f\n",
                "Total", totalOldSalary, "", totalNewSalary, totalBonus);
    }
    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employees = generateempdata(numEmployees);
        double[][] updatedSalaries = calcnewsal(employees);
        displaySalaryDetails(employees, updatedSalaries);
    }
}


package Employee;

import Employee.Boss;
import Employee.CleaningService;
import Employee.Employee;
import Employee.EmployeeData;
import Employee.Manager;
import Employee.Security;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeData data = new EmployeeData();

        Boss boss = new Boss(1, "Ridho", "belum menikah",8);
        data.addEmployee(boss);

        Manager manager = new Manager(2, "Akbar", "menikah",0);
        data.addEmployee(manager);

        CleaningService cleaningService = new CleaningService(3, "Epan", "menikah",1);
        data.addEmployee(cleaningService);

        Security security = new Security(4, "Gojex", "belum menikah",0);
        data.addEmployee(security);

        System.out.print("Masukkan NIP: ");
        int nip = input.nextInt();

        System.out.print("Masukkan jam kerja: ");
        double jamKerja = input.nextDouble();

        Employee employee = data.getEmployeeByNip(nip);
        if (employee != null) {
            employee.setJamKerja(jamKerja);
            employee.hitungGaji();
            System.out.println(employee.toString());
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
}

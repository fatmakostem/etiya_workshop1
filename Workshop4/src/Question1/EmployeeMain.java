package Question1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        List<Employee> employees = employeeManager.getAll();


        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setFirstName("Şevval");
        employee1.setLastName("Dağaşan");
        employee1.setEmail("sevval@hotmail.com");
        employee1.setPassword("456123");
        employee1.setDepartment("Analysis");


        employeeManager.add(employee1);

        for (Employee employee : employees) {
            System.out.println("Kayıt olan çalışanın Adı ve Soyadı : " +
                    employee.getFirstName() + " " + employee.getLastName());
            System.out.println("Email bilgisi : " + employee.getEmail());
            System.out.println("Departmanı : " + employee.getDepartment());
            System.out.println("Sisteme kayıt tarihi : " + employee.getCreatedDate());
        }

        System.out.println("-----------------------------------");
        System.out.println("UPDATE İŞLEMİ\n");

        //employee1.setId(2);
        employee1.setDepartment("Development");
        employeeManager.update(employee1);
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " departmanı: " +employee1.getDepartment() );
        System.out.println("Güncelleme tarihi : " + employee1.getUpdatedDate());


        /* System.out.println("---------------------------------");
        System.out.println("DELETE İŞLEMİ\n");

        employeeManager.delete(2);
        for (Employee employee : employees)
        {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " Departman: " +employee.getDepartment()
                    + " id: " + employee.getId());
        } */






    }
}


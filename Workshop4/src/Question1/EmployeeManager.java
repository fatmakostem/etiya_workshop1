package Question1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager(){
        employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.setFirstName("Melodi");
        employee.setLastName("Bayraktar");
        employee.setEmail("melodi@hotmail.com");
        employee.setPassword("1234");
        employee.setDepartment("Quality");
        employee.setCreatedDate(LocalDateTime.now());

        employees.add(employee);
    }

    public List<Employee> getAll(){
        return employees;
    }

    public void add(Employee employee){
        employee.setCreatedDate(LocalDateTime.now());
        employees.add(employee);
    }

    //update işlemi
    public void update(Employee employee){
        for (Employee updateStudent : employees){
            if (updateStudent.getId()==employee.getId())
            {
                updateStudent.setDepartment(employee.getDepartment());
                employee.setUpdatedDate(LocalDateTime.now());
            }
        }
    }

    //delete işlemi
    public void delete(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id)
            {
                iterator.remove();
                employee.setDeletedDate(LocalDateTime.now());
                System.out.println( "FirstName: "+   employee.getFirstName() + " LastName: "+ employee.getLastName()  + " Silinme saati: " + employee.getDeletedDate()
                        + " Silinen çalışan: " + employee.getFirstName() + employee.getId());
            }
        }
    }

}

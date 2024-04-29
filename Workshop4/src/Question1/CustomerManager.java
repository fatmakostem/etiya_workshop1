package Question1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers;

    public CustomerManager(){
        customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Ceylin");
        customer.setLastName("Sayman");
        customer.setEmail("ceylin@hotmail.com");
        customer.setPassword("12345");
        customer.setPhoneNumber("78945623");
        customer.setAdddress("Edremit/Balıkesir");
        customer.setCreatedDate(LocalDateTime.now());

        customers.add(customer);
    }

    public List<Customer> getAll(){
        return customers;
    }

    public void add(Customer customer){
        customer.setCreatedDate(LocalDateTime.now());
        customers.add(customer);
    }

    //update işlemi
    public void update(Customer customer){
        for (Customer updateStudent : customers){
            if (updateStudent.getId()==customer.getId())
            {
                updateStudent.setPhoneNumber(customer.getPhoneNumber());
                customer.setUpdatedDate(LocalDateTime.now());
            }
        }
    }

    //delete işlemi
    public void delete(int id) {
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getId() == id)
            {
                iterator.remove();
                customer.setDeletedDate(LocalDateTime.now());
                System.out.println( "FirstName: "+   customer.getFirstName() + " LastName: "+ customer.getLastName()  + " Silinme saati: " + customer.getDeletedDate()
                        + " Silinen çalışan: " + customer.getFirstName());
            }
        }
    }

}

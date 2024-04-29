package Question1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        List<Customer> customers = customerManager.getAll();


        Customer customer1 = new Customer();
        customer1.setId(2);
        customer1.setFirstName("Mustafa");
        customer1.setLastName("Özbey");
        customer1.setEmail("mustafa@hotmail.com");
        customer1.setPassword("369852");
        customer1.setPhoneNumber("Analysis");
        customer1.setAdddress("Ankara");


        customerManager.add(customer1);

        for (Customer customer : customers) {
            System.out.println("Kayıt olan Müşterinin Adı ve Soyadı : " +
                    customer.getFirstName() + " " + customer.getLastName());
            System.out.println("Email bilgisi : " + customer.getEmail());
            System.out.println("Telefon Numarası : " + customer.getPhoneNumber());
            System.out.println("Sisteme kayıt tarihi : " + customer.getCreatedDate());
        }

        System.out.println("-----------------------------------");
        System.out.println("UPDATE İŞLEMİ\n");

        //employee1.setId(2);
        customer1.setAdddress("İstanbul");
        customerManager.update(customer1);
        System.out.println(customer1.getFirstName() + " " + customer1.getLastName() + " adresi: " +customer1.getAdddress() );
        System.out.println("Güncelleme tarihi : " + customer1.getUpdatedDate());


        System.out.println("---------------------------------");
        System.out.println("DELETE İŞLEMİ\n");

        /* customerManager.delete(2);
        for (Customer customer : customers)
        {
            System.out.println(customer.getFirstName() +" " + customer.getLastName() + " Address: " +customer.getAdddress() + " Telefon No: " + customer.getPhoneNumber()
                    + " id: " + customer.getId());
        }  */






    }
}


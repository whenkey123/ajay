package impl;

import com.cg.homeloan.entities.Admin;
import com.cg.homeloan.entities.Customer;
import com.cg.homeloan.entities.User;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        UserRepositoryImpl userRepository = new UserRepositoryImpl();
        AdminRepositoryImpl adminRepository = new AdminRepositoryImpl();
        CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
        userRepository.em.getTransaction().begin();
        User customer1 = userRepository.addNewUser(new User("VENKATpassword@123", "Customer"));
        User customer2 = userRepository.addNewUser(new User("AJAYpassword@123", "Customer"));
        User admin1 = userRepository.addNewUser(new User("ADMINpassword@123", "Admin"));
        userRepository.em.getTransaction().commit();
        /* Customer Block */
        customerRepository.em.getTransaction().begin();
        customerRepository.addCustomer(new Customer(customer1.getUserId(), "Venkat", "9160917765", "venkat@gmail.com", LocalDate.now(), "Male", "Indian", "1234-1234-1234-1234", "BBDC2FED"));
        customerRepository.addCustomer(new Customer(customer2.getUserId(), "Ajay", "9876543210", "ajay@gmail.com", LocalDate.now(), "Male", "Indian", "4321-1234-1234-1234", "TXDC2FHD"));
        customerRepository.em.getTransaction().commit();
        /* Admin Block */
        adminRepository.em.getTransaction().begin();
        adminRepository.addAdmin(new Admin(admin1.getUserId(), ",ADMIN", "RCPM"));
        adminRepository.em.getTransaction().commit();
    }
}

package impl;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;


import com.cg.homeloan.repository.*;
import com.cg.homeloan.entities.Customer;
import com.cg.homeloan.exception.CustomerNotFoundException;

@SuppressWarnings("unused")
public class CustomerRepositoryImpl implements ICustomerRepository {

    public EntityManager em;

    public CustomerRepositoryImpl() {
        em = JPAUtil.getEntityManager();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        if (customer == null)
            return null;
        em.persist(customer);
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        if (customer == null) {
            return null;
        }
        em.merge(customer);
        return customer;

    }

    @Override
    public Customer viewCustomer(int custId) throws CustomerNotFoundException {
        Customer customer = em.find(Customer.class, custId);
        if (customer == null) {
            throw new CustomerNotFoundException("Customer Not Found");
        }
        return customer;
    }

    @Override
    public Customer deleteCustomer(Customer customer) throws CustomerNotFoundException {
        if (!em.contains(customer)) {
            throw new CustomerNotFoundException("Customer Not Found");
        }
        em.remove(customer);
        return customer;
    }

    @Override
    public List<Customer> viewAllCustomers() {
        String retrieveAllCustomersSQL = "SELECT cust FROM Customer cust";
        TypedQuery<Customer> query = em.createQuery(retrieveAllCustomersSQL, Customer.class);
        return query.getResultList();
    }

    @Override
    public List<Customer> viewCustomerList(LocalDate dateOfApplication) {
        TypedQuery<Customer> q = em.createQuery("SELECT C FROM CUSTOMER C where C.DATEOFBIRTH=:bDate",
                Customer.class);
        q.setParameter("bDate", dateOfApplication);
        return q.getResultList();
    }


    public void beginTransaction() {
        em.getTransaction().begin();
    }

    public void commitTransaction() {
        em.getTransaction().commit();
    }


}

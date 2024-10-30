package java15.dao.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java15.config.HibernateConfig;
import java15.dao.CustomerDao;
import java15.metods.Customer;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    EntityManagerFactory entityManagerFactory = HibernateConfig.getEntityManager();

    @Override
    public String addCustomer(Customer customer) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Customer successfully added.";
    }

    @Override
    public String getCustomerById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Customer customer = entityManager.find(Customer.class, id);
        entityManager.close();
        return customer != null ? customer.toString() : "Customer not found.";
    }

    @Override
    public int updateCustomerPhoneNumber(Long id, int phoneNumber) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Customer customer = entityManager.find(Customer.class, id);
        if (customer != null) {
            customer.setPhone_Number(phoneNumber);
            entityManager.merge(customer);
            entityManager.getTransaction().commit();
            entityManager.close();
            return 1;
        } else {
            entityManager.close();
            return 0;
        }

    }

    @Override
    public String deleteCustomer(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Customer customer = entityManager.find(Customer.class, id);
        if (customer != null) {
            entityManager.remove(customer);
            entityManager.getTransaction().commit();
            entityManager.close();
            return "Customer deleted successfully.";
        } else {
            entityManager.close();
            return "Customer not found.";
        }
    }

    @Override
    public List<Customer> sortCustomersByName(String ascOrDesc) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String queryStr = "select c from Customer c order by c.firstName " +
                ("asc".equalsIgnoreCase(ascOrDesc) ? "ASC" : "DESC");
        TypedQuery<Customer> query = entityManager.createQuery(queryStr, Customer.class);
        List<Customer> customers = query.getResultList();
        entityManager.close();
        return customers;

    }
}

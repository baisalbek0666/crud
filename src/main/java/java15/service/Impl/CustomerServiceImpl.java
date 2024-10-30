package java15.service.Impl;

import jakarta.persistence.EntityManager;
import java15.dao.CustomerDao;
import java15.dao.Impl.CustomerDaoImpl;
import java15.metods.Customer;
import java15.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerDao customerDao = new CustomerDaoImpl();

    @Override
    public String addCustomer(Customer customer) {
        return customerDao.addCustomer(customer) ;
    }

    @Override
    public String getCustomerById(Long id) {
        return customerDao.getCustomerById(id) ;
    }

    @Override
    public int updateCustomerPhoneNumber(Long id, int phoneNumber) {
        return customerDao.updateCustomerPhoneNumber(id, phoneNumber);
    }

    @Override
    public String deleteCustomer(Long id) {
        return customerDao.deleteCustomer(id);
    }



    @Override
    public List<Customer> sortCustomersByName(String ascOrDesc) {
        return customerDao.sortCustomersByName(ascOrDesc);
    }
}

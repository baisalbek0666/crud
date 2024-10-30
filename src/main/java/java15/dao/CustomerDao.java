package java15.dao;

import java15.metods.Customer;

import java.util.List;

public interface CustomerDao {
    String addCustomer(Customer customer);
    String getCustomerById(Long id);
    int updateCustomerPhoneNumber(Long id, int phoneNumber);
    String deleteCustomer (Long id);

    List<Customer> sortCustomersByName (String ascOrDesc);


}

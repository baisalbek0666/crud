package java15.service;

import java15.metods.Customer;

import java.util.List;

public interface CustomerService {
    String addCustomer(Customer customer);
    String getCustomerById(Long id);
    int updateCustomerPhoneNumber(Long id, int phoneNumber);
    String deleteCustomer (Long id);

    List<Customer> sortCustomersByName (String ascOrDesc);


}

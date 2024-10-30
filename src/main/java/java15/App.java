package java15;


import java15.metods.Customer;
import java15.service.CustomerService;
import java15.service.Impl.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
       //   HibernateConfig.getEntityManager();
        CustomerService customerService = new  CustomerServiceImpl();

//        Customer customer1 = new Customer("Атай", "Абдразаков", 555300200);
//        Customer customer2 = new Customer("Байсалбек", "Толомушов", 700444300);
//        Customer customer3 = new Customer("Анарбек", "Рысбеков", 700444300);
//        Customer customer4 = new Customer("Нурсултан", "Токтобаев", 700444300);
//        Customer customer5 = new Customer("Нуридин", "Толонбеков", 700444300);
//        System.out.println(customerService.addCustomer(customer1));
//        System.out.println(customerService.addCustomer(customer2));
//        System.out.println(customerService.addCustomer(customer3));
//        System.out.println(customerService.addCustomer(customer4));
//        System.out.println(customerService.addCustomer(customer5));

//        System.out.println(customerService.getCustomerById(1L));
//
//          System.out.println(customerService.updateCustomerPhoneNumber(1L, 555300400));
//
//         System.out.println(customerService.deleteCustomer(2L));
//
           System.out.println("Аты боюнча сортто: " + customerService.sortCustomersByName("desc"));
    }
}





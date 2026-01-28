import config.AppConfig;
import entity.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CustomerService;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService customerService = (CustomerService) appContext.getBean("customerService");

        // Используем правильные имена методов
        customerService.saveCustomer(new Customer("Jean", "Dupont"));
        customerService.saveCustomer(new Customer("Marie", "Martin"));
        customerService.saveCustomer(new Customer("Pierre", "Durand"));

        System.out.println();
        System.out.println("=== Tous les customers ===");
        for (Customer c : customerService.getAllCustomers()) {
            System.out.println(c);
        }

        System.out.println();
        System.out.println("Customer id=1: " + customerService.getCustomerById(1L));
        System.out.println("Nombre de customers: " + customerService.countCustomers());

        customerService.deleteCustomer(2L);

        System.out.println();
        System.out.println("=== Après suppression ===");
        for (Customer c : customerService.getAllCustomers()) {
            System.out.println(c);
        }

        appContext.close();
    }
}
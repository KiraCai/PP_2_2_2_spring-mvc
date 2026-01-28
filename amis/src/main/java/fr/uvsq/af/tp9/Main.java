package fr.uvsq.af.tp9;

import fr.uvsq.af.tp9.config.AppConfig;
import fr.uvsq.af.tp9.controller.CustomerController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerController controller = ctx.getBean(CustomerController.class);

        controller.saveCustomer("Jean", "dupont@gmail.com", "Paris");
        controller.saveCustomer("Marie", "marie@gmail.com", "Versailles");
        controller.saveCustomer("Pierre", "pierre@gmail.com", "Lyon");

        controller.displayAllCustomers();
        controller.displayCustomerById(1L);
        controller.displayCustomerByName("marie");
        controller.countCustomers();

        controller.deleteCustomer(2L);

        System.out.println("=== Après suppression ===");
        controller.displayAllCustomers();

        ctx.close();
    }
}

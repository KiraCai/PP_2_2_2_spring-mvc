import controller.CustomerController;
import controller.LoginController;
import config.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        LoginController controllerL = ctx.getBean(LoginController.class);
        controllerL.creerLogin(1, "admin", "admin123");
        controllerL.creerLogin(2, "user", "user456");
        System.out.println();
        controllerL.afficherTousLogins();
        System.out.println();
        controllerL.verifierLogin("admin", "admin123");
        controllerL.verifierLogin("admin", "wrong");


        CustomerController controller = ctx.getBean(CustomerController.class);
        controller.displayAllCustomers();
        System.out.println();
        controller.countCustomers();
        System.out.println();
        controller.saveCustomer(4, "Sophie Be", "sophie@email.com", "Toulouse");
        System.out.println();
        controller.displayCustomerById(1);
        controller.displayCustomerById(99);
        System.out.println();
        controller.displayCustomerByName("Marie Mar");
        controller.displayCustomerByName("Incnnu");
        System.out.println();
        controller.countCustomers();
        System.out.println();
        controller.deleteCustomer(2);
        System.out.println();
        controller.displayAllCustomers();
        controller.countCustomers();
    }
}

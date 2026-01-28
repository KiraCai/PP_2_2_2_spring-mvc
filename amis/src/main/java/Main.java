import controller.LoginController;
import config.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        LoginController controller = ctx.getBean(LoginController.class);
        controller.creerLogin(1, "admin", "admin123");
        controller.creerLogin(2, "user", "user456");
        System.out.println();
        controller.afficherTousLogins();
        System.out.println();
        controller.verifierLogin("admin", "admin123");
        controller.verifierLogin("admin", "wrong");
    }
}

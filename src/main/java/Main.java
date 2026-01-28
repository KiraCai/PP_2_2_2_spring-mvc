import entity.Region;
import entity.RegionConfig;
import entity.Ville;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RegionConfig.class);
        Region r = ctx.getBean(Region.class);
        r.affiche();
    }
}

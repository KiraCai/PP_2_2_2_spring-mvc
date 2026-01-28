import entity.Region;
import entity.RegionConfig;
import entity.Ville;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RegionConfig.class);

        // 3) Modification: в main меняем Lille -> Bordeaux
        Ville cap = ctx.getBean("capitaleRegion", Ville.class);
        cap.setNom("Bordeaux");

        Region r = ctx.getBean(Region.class);
        r.affiche();
    }
}

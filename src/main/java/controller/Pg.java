package controller;

import entity.MagasinEnLigne;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Configure;
import service.IFournisseurDeQuestions;
import service.ServiceGestionQuestionnaire;

public class Pg {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        //ServiceGestionQuestionnaire serviceGestionQuestionnaire =
        //        (ServiceGestionQuestionnaire) context.getBean("ServQ");
        //serviceGestionQuestionnaire.genereQuestionnaire();
        /*IFournisseurDeQuestions service =
                (IFournisseurDeQuestions) context.getBean("titi");

        Configure conf = (Configure) context.getBean("choixEnvironnemnt");
        conf.affiche();

        service.genereQuestionnaire();*/


        MagasinEnLigne magasin = (MagasinEnLigne) context.getBean("magasin");
        magasin.affiche();
    }
}

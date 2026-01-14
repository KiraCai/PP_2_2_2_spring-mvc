package service;

import entity.Questions;

public class ServiceGestionQuestionnaire {
    private Questions lesQuestions;
    public void genereQuestionnaire() {
        System.out.println(lesQuestions.popLesQuestions());
    }
    public void setLesQuestions(Questions lesQuestions) {
        this.lesQuestions = lesQuestions;
    }
}

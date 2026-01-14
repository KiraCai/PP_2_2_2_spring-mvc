package service;

import entity.Questions;

public class FournisseurDeQuestions implements IFournisseurDeQuestions {

    private Questions lesQuestions;
    public void setLesQuestions(Questions lesQuestions) {
        this.lesQuestions = lesQuestions;
    }
    @Override
    public void genereQuestionnaire() {
        System.out.println(lesQuestions.popLesQuestions());
    }
}

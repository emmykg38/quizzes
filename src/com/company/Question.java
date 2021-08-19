package com.company;

import java.util.ArrayList;

public abstract class Question {


    /* fields */

    private ArrayList<String> question = new ArrayList<>();
    private ArrayList<String> correctAnswer = new ArrayList<>();
    private ArrayList<String> userResponse = new ArrayList<>();




    //METHODS


    //constructor
    public Question(ArrayList<String> question, ArrayList<String> correctAnswer, ArrayList<String> userResponse) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.userResponse = userResponse;
    }

    //empty constructor
    public Question() {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.userResponse = userResponse;
    }


    public ArrayList<String> getQuestion() {
        return question;
    }

    public void setQuestion(ArrayList<String> question) {
        this.question = question;
    }

    public ArrayList<String> getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(ArrayList<String> userResponse) {
        this.userResponse = userResponse;
    }

    public ArrayList<String> getCorrectAnswer() {
        return correctAnswer;
    }
}

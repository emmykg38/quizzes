package com.company;

import java.util.HashMap;

public class MultipleChoice extends Question {

    //fields
    HashMap<String, String> multipleChoice = new HashMap<>();


    //constructor
    public MultipleChoice(HashMap <String, String> multipleChoice) {
        super();
        this.multipleChoice = multipleChoice;
    }


    public HashMap<String, String> getMultipleChoice() {
        return multipleChoice;
    }

    public void setMultipleChoice(HashMap<String, String> multipleChoice) {
        this.multipleChoice = multipleChoice;
    }
}

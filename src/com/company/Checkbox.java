package com.company;

import java.util.HashMap;

public class Checkbox extends Question {

    //fields
    HashMap<String, Boolean> checkbox = new HashMap<>();


    //constructor
    public Checkbox(HashMap<String, Boolean> checkbox) {
        this.checkbox = checkbox;
    }


    //getters setters
    public HashMap<String, Boolean> getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(HashMap<String, Boolean> checkbox) {
        this.checkbox = checkbox;
    }
}

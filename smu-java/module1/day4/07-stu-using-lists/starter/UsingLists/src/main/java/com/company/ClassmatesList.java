package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClassmatesList {
    private List<Classmate> ClassmatesList = new ArrayList<>();

    public void add(Classmate classmate) {
        ClassmatesList.add(classmate);
    }
    public Classmate get(int index) {
        return ClassmatesList.get(index);
    }
    public List<Classmate> getAll() {
        return ClassmatesList;
    }

}


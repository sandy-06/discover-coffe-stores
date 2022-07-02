package com.company;

public class TeamLead extends Developer{
    public void planSprint() {
        System.out.println(this.getName() + " says: We have to commit to 42 points! (TeamLead method)");
    }

    public void assignWork(Developer dev) {
        System.out.println(this.name + " says: This work is for you, " + dev.getName() +"! (TeamLead method)");
    }
}


package com.company;

public class Developer {
    protected String name;
    protected double salary;
    protected int experiencePoints;

    public void estimateStoryPoints() {
        System.out.println(this.name + " says: I believe that is a 3. (dev method)");
        experiencePoints++;
    }

    public void checkInCode() {
        System.out.println(this.name + " types: git add -A; git commit -m 'something'; git push (dev method)");
        experiencePoints = experiencePoints + 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
}


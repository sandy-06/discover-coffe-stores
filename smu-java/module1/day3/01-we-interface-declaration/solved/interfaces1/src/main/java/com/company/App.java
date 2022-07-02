package com.company;

public class App {
    public static void main(String[] args) {
        SchoolRecord dansRecord = new SchoolRecord();
        Storable fanniesRecord = new SchoolRecord();
        SchoolRecord martasRecord = new SchoolRecord();

        dansRecord.storeData();
        dansRecord.retrieveData();

        fanniesRecord.storeData();
        fanniesRecord.retrieveData();

        saveAllMyWork(dansRecord);
        saveAllMyWork(fanniesRecord);
        saveAllMyWork(martasRecord);

    }
    public static void saveAllMyWork(Storable storable){
        System.out.println("Saving work!!!");
        storable.storeData();
        System.out.println(storable.getMetadata());
    }
}

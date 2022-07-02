package com.company;

public class SchoolRecord implements Storable, Auditable, SecureStorable {

    public void runAudit() {
        System.out.println("Running a school record audit");
    }

    public void sendAuditToState() {
        System.out.println("Sending a school record audit to the state");

    }

    public void storeData() {
        System.out.println("Storing a school record");

    }

    public void retrieveData() {
        System.out.println("Retrieving a school record");

    }
    public String getMetadata() {
        return "Here is the metadata for a school record.";
    }



    
    public void encryptAndStoreData() {
        System.out.println("storing data securely!");
    }
}
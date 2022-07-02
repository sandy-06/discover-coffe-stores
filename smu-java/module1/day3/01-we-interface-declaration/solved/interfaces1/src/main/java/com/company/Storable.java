package com.company;

public interface Storable {
    void storeData();
    void retrieveData();
    default String getMetadata() {
        return "Metadata generation not supported!";
    };
}

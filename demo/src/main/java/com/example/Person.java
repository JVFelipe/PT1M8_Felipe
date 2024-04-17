package com.example;

/**
 * @author Juan Felipe Vallejo Quintero
     * Person class to save person information
     */
public abstract class Person {
    String name;
    String identifier;

    /**
     * "Getter" to get the name of the person
     * @return the name of the person
     */
    public String getName() {
        return name;
    }
    /**
     * "Setter" to set the name of the person
     * @param name the new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * "Getter" to get the identifier of the person
     * @return the id of the person
     */
    public String getIdentifier() {
        return identifier;
    }
    /**
     * "Setter" to set the id of the person
     * @param identifier the new id of the person
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}

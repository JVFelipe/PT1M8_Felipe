package com.example;


/**
 * @author Juan Felipe Vallejo Quintero
 * Guest class which extends Person and represents a guest
 */
public class Guest extends Person {
    String nationality;
/**
 * @param super(name,identifier) of the class Person
 * @param nationality Nationality of the person
 */
    public Guest(String name, String identifier, String nationality) {
    super(name, identifier);
    this.nationality = nationality;
}
    /**
     * "Getter" to retrieve the nationatility of the guest
     * @return the nationality of the guest
     */
    public String getNationality() {
        return nationality;
    }
    /**
     * "Setter" to set the nationality of the guest
     * @param nationality the new nationality of the guest
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
}

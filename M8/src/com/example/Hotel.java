package com.example;
/**
 * @author Juan Felipe Vallejo Quintero
     * Hotel class to save hotel information
     */
public class Hotel {

    String name;
    String address;
    String web;
    String category;

    /**
     * 
     * @param name Name of the hotel
     * @param address Adress of the hotel
     * @param web Website of the hotel
     * @param category Category (stars) of the hotel
     */
    public Hotel(String name, String address, String web, String category) {
        this.name = name;
        this.address = address;
        this.web = web;
        this.category = category;
    }

    /**
     * "Getter" to get the name of the hotel
     * @return the name of the hotel
     */
    public String getName() {
        return name;
    }

    /**
     * "Setter" to set the name of the hotel
     * @param name the new name of the hotel
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * "Getter" to get the adress of the hotel
     * @return return the adress of the hotel
     */
    public String getAddress() {
        return address;
    }
    /**
     * "Setter" to set the adress of the hotel
     * @param address the new adress of the hotel
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * "Getter" to get the website of the hotel
     * @return the new website of the hotel
     */
    public String getWeb() {
        return web;
    }
    /**
     * "Setter" to set the website of the hotel
     * @param web the new website of the hotel
     */
    public void setWeb(String web) {
        this.web = web;
    }
    /**
     * "Getter" to get the category of the hotel
     * @return the new category of the hotel
     */
    public String getCategory() {
        return category;
    }
    /**
     * "Setter" to set the category of the hotel
     * @param category the new category of the hotel
     */
    public void setCategory(String category) {
        this.category = category;
    }

}

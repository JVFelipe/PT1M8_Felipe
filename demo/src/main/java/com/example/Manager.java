package com.example;

import java.util.Date;
/**
 * @author Juan Felipe Vallejo Quintero
 * Manager class which extends Person and represents a manager
 */
public class Manager extends Person {
    Date startDate;
    int experience;
    /**
     * 
     * @param startDate start date of the manager
     * @param experience experience level of the manager
     */
    public Manager(Date startDate, int experience) {
        this.startDate = startDate;
        this.experience = experience;
    }
    /**
     * "Getter" to retrieve the start date of the manager's tenure
     * @return the start date of the manager's tenure
     */
    public Date getStartDate() {
        return startDate;
    }
    /**
     * "Setter" to set the start date of the manager's tenure
     * @param startDate the new start date of the manager's tenure
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    /**
     * "Getter" to retrieve the experience level of the manager
     * @return the experience level of the manager
     */
    public int getExperience() {
        return experience;
    }
    /**
     * "Setter" to set the experience level of the manager
     * @param experience the new experience level of the manager
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.people;

/**
 *
 * @author Iwa Stojnowa
 */
public class PersonData {
   
    private int ID;    
    private String FULL_NAME;    
    private String PIN;
    private String EMAIL;

    /**
     * @return the EMAIL
     */
    public String getEMAIL() {
        return EMAIL;
    }

    /**
     * @param EMAIL the EMAIL to set
     */
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    /**
     * @return the PIN
     */
    public String getPIN() {
        return PIN;
    }

    /**
     * @param PIN the PIN to set
     */
    public void setPIN(String PIN) {
        this.PIN = PIN;
    }


    /**
     * @return the FULL_NAME
     */
    public String getFULL_NAME() {
        return FULL_NAME;
    }

    /**
     * @param FULL_NAME the FULL_NAME to set
     */
    public void setFULL_NAME(String FULL_NAME) {
        this.FULL_NAME = FULL_NAME;
    }


    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**    
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
   
}

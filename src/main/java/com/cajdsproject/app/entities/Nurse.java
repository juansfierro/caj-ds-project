package com.cajdsproject.app.entities;

/**
 * 
 * Nurse: Employee that takes vitals of Patient
 */
public class Nurse extends Employee {

    /**
     * Creates Nurse object with specified data.
     * @param id
     * @param name
     * @param dateOfBirth
     */
    public Nurse(String id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }
}

package com.cajdsproject.app.entities;

/**
 * Secretary: Employee that registers patients and assigns doctors.
 */
public class Secretary extends Employee {
    /**
     * Creates Secretary object with specified data.
     * @param id
     * @param name
     * @param dateOfBirth
     */
    public Secretary(String id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }
    
}

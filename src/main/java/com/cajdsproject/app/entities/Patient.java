package com.cajdsproject.app.entities;

/**
 * 
 * Patient class. Inherits from Person
 */
public class Patient extends Person {
    /**
     * Creates Patient object class with specified data.
     * @param id
     * @param name
     * @param dateOfBirth
     */
    public Patient(String id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }
}
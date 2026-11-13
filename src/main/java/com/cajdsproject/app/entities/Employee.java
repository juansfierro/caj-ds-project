package com.cajdsproject.app.entities;

/**
 * 
 * Employee type for all members of staff. Inherits from Person class.
 */
public abstract class Employee extends Person {
    /**
     * Creates Employee object with specified data.
     * @param id
     * @param name
     * @param dateOfBirth
     */
    protected Employee(String id, String name, String dateOfBirth) {
        super(id, name, dateOfBirth);
    }
}

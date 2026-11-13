package com.cajdsproject.app.entities;

/**
 * 
 * Person type from which all human entities inherit from.
 */
public abstract class Person {
    private final String id;
    private String name;
    private String dateOfBirth;

    /**
     * Creates Person object with specified data.
     * @param id
     * @param name
     * @param dateOfBirth
     */
    protected Person(String id, String name, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns the Person's unique ID
     */
    public String getId() {
        return this.id;
    }

    /**
     * Returns the Person's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the Person's date of birth.
     */
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * Update the Person's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Update the Person's date of birth.
     */
    public void setDateOfBirth(String DOB) {
        this.dateOfBirth = DOB;
    }
}
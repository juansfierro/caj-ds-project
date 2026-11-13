package com.cajdsproject.app.entities;

/**
 * 
 * Doctor: Employee that is assigned to patients and has a special Specialty field.
 */
public class Doctor extends Employee{
    private String specialty;

    /**
     * Creates Doctor object with specififed data.
     * @param id
     * @param name
     * @param dateOfBirth
     * @param specialty - Oftalmologo general o pediatrico, Neurooftalmologo, Retinologo
     */
    public Doctor(String id, String name, String dateOfBirth, String specialty) {
        super(id, name, dateOfBirth);
        this.specialty = specialty;
    }

    /**
     * Returns the doctor's medical specialty.
     */
    public String getSpecialty() {
        return this.specialty;
    }

    /**
     * Updates the doctor's medical specialty.
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}

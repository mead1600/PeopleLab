package com.company;

public class Teacher extends Person {
    // Fields
    private String subject, title;

    // Constructor
    public Teacher(String firstName, String familyName, String subject, String title)
    {
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
    }

    // Methods

    // Getters
    public String getSubject()
    {
        return subject;
    }
    public String getTitle() {
        return title;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return "Title. FamilyName "
     */

    public String toString()
    {
        return title + ". " + getFamilyName();
    }
}


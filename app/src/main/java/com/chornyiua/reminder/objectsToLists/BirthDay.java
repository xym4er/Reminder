package com.chornyiua.reminder.objectsToLists;

/**
 * Created by ChornyiUA on 03.12.2015.
 */
public class BirthDay {
    private long date;
    private long timeBefore;
    private String name;
    private String surname;
    private String description;

    public BirthDay(long date, String name) {
        this.date = date;
        this.name = name;
        surname = "";
        description = "";
        timeBefore = 0;
    }

    public long getDate() {
        return date;
    }

    public long getTimeBefore() {
        return timeBefore;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setTimeBefore(long timeBefore) {
        this.timeBefore = timeBefore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

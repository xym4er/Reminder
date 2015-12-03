package com.chornyiua.reminder.objectsToLists;

/**
 * Created by ChornyiUA on 03.12.2015.
 */
public class Note {
    private String name;
    private long date;
    private String description;

    public Note(String name, long date) {
        this.name = name;
        this.date = date;
        description = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {

        return name;
    }

    public long getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}

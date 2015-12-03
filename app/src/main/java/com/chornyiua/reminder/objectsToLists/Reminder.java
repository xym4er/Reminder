package com.chornyiua.reminder.objectsToLists;

/**
 * Created by ChornyiUA on 03.12.2015.
 */
public class Reminder {
    private String name;
    private long date;
    private long duration;
    private long timeBefore;
    private String description;

    public Reminder(String name, long date) {
        this.name = name;
        this.date = date;
        duration = 0;
        description = "";
        timeBefore = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setDuration(long duration) {
        this.duration = duration;
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

    public long getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }
}

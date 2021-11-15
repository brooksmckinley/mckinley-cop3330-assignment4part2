/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.models;

public class Item {

    private static Integer lastID = 0;
    private final int id;
    private String description;
    private String dueDate;
    private boolean completed;

    public Item(String description, String dueDate, boolean completed) {
        this.id = lastID++;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public Item(int id, String description, String dueDate, boolean completed) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public int getID() {
        /*
        == PSEUDOCODE ==
        return id;
         */
        return this.id;
    }

    public String getDescription() {
        /*
        == PSEUDOCODE ==
        return description;
         */
        return this.description;
    }

    public String getDueDate() {
        /*
        == PSEUDOCODE ==
        return dueDate;
         */
        return this.dueDate;
    }

    public boolean getCompleted() {
        /*
        == PSEUDOCODE ==
        return completed;
         */
        return this.completed;
    }

    public void setDescription(String newDescription) {
        /*
        == PSEUDOCODE ==
        description = newDescription;
         */
    }

    public void setDueDate(String newDueDate) {
        /*
        == PSEUDOCODE ==
        dueDate = newDueDate;
         */
    }

    public void setCompleted(boolean newCompleted) {
        /*
        == PSEUDOCODE ==
        completed = newCompleted;
         */
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.models;

import java.util.ArrayList;

public class AppModel {

    private ArrayList<List> toDoLists;
    private int currentList;

    public AppModel() {

    }

    public void addList(List toAdd) {
        /*
        == PSEUDOCODE ==
        todoLists.add(new List())
         */
    }

    public void removeList(int index) {
        /*
        == PSEUDOCODE ==
        toDoLists.remove(index)
         */
    }

    public List getList(int index) {
        /*
        == PSEUDOCODE ==
        toDoLists.get(index)
         */
        return null;
    }

    public void setCurrentList(int newList) {
        /*
        == PSEUDOCODE ==
        this.currentList = newList;
         */
    }

    public List getCurrentList() {
        /*
        == PSEUDOCODE ==
        toDoLists.get(this.currentList);
         */
        return null;
    }

    public void saveAllLists() {
        /*
        == PSEUDOCODE ==
        for (list in toDoLists) {
            list.saveList()
        }
        */
    }
}

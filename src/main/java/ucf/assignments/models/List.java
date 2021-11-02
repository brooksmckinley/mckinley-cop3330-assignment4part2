/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.models;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

public class List {
    private boolean modified;
    private String title;
    private File file;
    private ArrayList<Item> items;

    public List() {

    }

    public void addItem(Item toAdd) {
        /*
        == PSEUDOCODE ==
        items.add(toAdd);
        modified = true;
         */
    }

    public Item getItem(int id) {
        /*
        == PSUEDOCODE ==
        index = getItemIndex(id);
        items.get(index);
         */
        return null;
    }

    public void setItem(int id, Item replacement) {
        /*
        == PSEUDOCODE ==
        index = getItemIndex(id);
        items.set(index, replacement);
        modified = true;
         */
    }

    public void setFile(File newFile) {
        /*
        == PSEUDOCODE ==
        this.file = newFile;
         */
    }

    public void removeItem(int id) {
        /*
        == PSEUDOCODE ==
        index = getItemIndex(id);
        items.remove(index);
        modified = true;
         */
    }

    public void saveList() {
        /*
        == PSEUDOCODE ==
        if (file == null) {
            throw Exception indicating no file exists;
        }
        serialized = this.serialize();
        file.writeString(serialized);
        this.modified = false;
         */
    }

    public static List loadList(Path filePath) {
        /*
        == PSEUDOCODE ==
        fileString = readFile(filePath);
        return deserialize(fileString);
         */
        return null;
    }

    public static List[] loadLists(Path[] filePaths) {
        /*
        == PSUEDOCODE ==
        for (path in filePaths) {
            result[i] = loadList(path);
        }
        return result;
         */
        return null;
    }

    public static ArrayList<Item> getAllItems() {
        /*
        == PSUEDOCODE ==
        return items;
         */
        return null;
    }

    public static ArrayList<Item> getIncompleteItems() {
        /*
        == PSUEDOCODE ==
        for (item in items) {
            if (item.completed is false) {
                result.add(item)
            }
        }
        return result;
         */
        return null;
    }

    public static ArrayList<Item> getCompletedItems() {
        /*
        == PSEUDOCODE ==
        for (item in items) {
            if (item.completed is true) {
                result.add(item)
            }
        }
        return result;
         */
        return null;
    }

    public boolean getModified() {
        /*
        == PSEUDOCODE ==
        return modified;
         */
        return false;
    }

    public String getTitle() {
        /*
        == PSEUDOCODE ==
        return title;
         */
        return "";
    }

    public void setModified() {
        /*
        == PSEUDOCODE ==
        modified = true;
         */
    }

    public void setTitle(String newTitle) {
        /*
        == PSEUDOCODE ==
        title = newTitle;
         */
    }

    private int getItemIndex(int id) {
        /*
        == PSEUDOCODE ==
        for (item at index i in items) {
            if (item.id == id) {
                return i;
            }
        }
        return -1;
         */
        return 0;
    }

    private String serialize() {
        /*
        == PSEUDOCODE ==
        for (item in items) {
            result += id + | + description + | + dueDate + | + completed + \n;
        }
        return result;
         */
        return "";
    }

    private List deserialize(String input) {
        /*
        == PSEUDOCODE ==
        for (line in input) {
            if (first line) {
                title = line
            } else {
                records = input.split('|');
                throw Exception if records.length != 4
                id = records[0];
                description = records[1];
                dueDate = records[2];
                completed = records[3];
                list.add(new Item(id, description, dueDate, completed));
            }
        }
        return new List(list);
         */
        return null;
    }

}

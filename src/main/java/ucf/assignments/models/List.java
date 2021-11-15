/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.models;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

public class List {
    private File file;
    private ArrayList<Item> items;

    public List(File file) {
        this.file = file;
        this.items = new ArrayList<>();
    }

    public List() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item toAdd) {
        /*
        == PSEUDOCODE ==
        items.add(toAdd);
         */
        this.items.add(toAdd);
    }

    public Item getItem(int id) {
        /*
        == PSUEDOCODE ==
        index = getItemIndex(id);
        if (index != -1)
            items.get(index);
        else return null;
         */
        int index = getItemIndex(id);
        if (index == -1) {
            return null;
        } else {
            return items.get(index);
        }
    }

    public void setItem(int id, Item replacement) {
        /*
        == PSEUDOCODE ==
        index = getItemIndex(id);
        items.set(index, replacement);
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
         */
        int index = getItemIndex(id);
        items.remove(index);
    }

    public void clearList() {
        /*
        == PSEUDOCODE ==
        for (item in items) {
            items.remove(item);
        }
         */
        items.clear();
    }

    public void saveList() {
        /*
        == PSEUDOCODE ==
        if (file == null) {
            throw Exception indicating no file exists;
        }
        serialized = this.serialize();
        file.writeString(serialized);
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

    public ArrayList<Item> getAllItems() {
        /*
        == PSUEDOCODE ==
        return items;
         */
        return this.items;
    }

    public ArrayList<Item> getIncompleteItems() {
        /*
        == PSUEDOCODE ==
        for (item in items) {
            if (item.completed is false) {
                result.add(item)
            }
        }
        return result;
         */
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : this.items) {
            if (!item.getCompleted()) {
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList<Item> getCompletedItems() {
        /*
        == PSEUDOCODE ==
        for (item in items) {
            if (item.completed is true) {
                result.add(item)
            }
        }
        return result;
         */
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : this.items) {
            if (!item.getCompleted()) {
                result.add(item);
            }
        }
        return result;
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
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getID() == id) {
                return i;
            }
        }
        return -1;
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

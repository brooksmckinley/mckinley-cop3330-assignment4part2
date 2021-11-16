/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class List {
    private ArrayList<Item> items;

    // ASCII Record separator, convenient and underrated
    private static String RECORD_SEPARATOR = "\u001E";

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

    public void saveList(File file) throws IOException {
        /*
        == PSEUDOCODE ==
        serialized = this.serialize();
        file.writeString(serialized);
         */
        String serialized = this.serialize();
        Files.writeString(file.toPath(), serialized);

    }

    public static List loadList(File file) {
        /*
        == PSEUDOCODE ==
        fileString = readFile(filePath);
        return deserialize(fileString);
         */
        try {
            String fileString = Files.readString(file.toPath());
            return deserialize(fileString);
        } catch (IOException error) {
            error.printStackTrace();
            // Unable to read, open blank list
            return new List();
        }
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
            if (item.getCompleted()) {
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
            result += id + RS + description + RS + dueDate + RS + completed + \n;
        }
        return result;
         */
        StringBuilder result = new StringBuilder();
        for (Item item : items) {
            result.append(item.getID())
                    .append(RECORD_SEPARATOR)
                    .append(item.getDescription())
                    .append(RECORD_SEPARATOR)
                    .append(item.getDueDate())
                    .append(RECORD_SEPARATOR)
                    .append(item.getCompleted())
                    .append('\n');
        }
        return result.toString();
    }

    private static List deserialize(String input) {
        /*
        == PSEUDOCODE ==
        for (line in input) {
            records = input.split('|');
            error if records.length != 4
            id = records[0];
            description = records[1];
            dueDate = records[2];
            completed = records[3];
            list.add(new Item(id, description, dueDate, completed));
        }
        return new List(list);
         */
        List result = new List();

        for (String line : input.split("\n")) {
            // Split at ASCII record separator character
            String[] records = line.split(RECORD_SEPARATOR);
            if (records.length != 4) {
                // Unable to read, skip record
                continue;
            }
            try {
                int id = Integer.parseInt(records[0]);
                String description = records[1];
                String dueDate = records[2];
                boolean completed = Boolean.parseBoolean(records[3]);
                result.addItem(new Item(id, description, dueDate, completed));
            } catch (Exception e) {
                // Unable to parse, skip record
                e.printStackTrace();
            }
        }
        return result;
    }

}

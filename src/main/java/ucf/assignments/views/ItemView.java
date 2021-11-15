/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import ucf.assignments.App;
import ucf.assignments.controllers.EditableListItemController;
import ucf.assignments.controllers.ItemController;
import ucf.assignments.models.Item;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class ItemView {
    public static Node createItem(Item item) {
        /*
        == PSEUDOCODE ==
        result = loadFromFXML("ListItem.fxml");
        result.controller = new ItemController(item);
        return result;
         */
        URL listItemURL = Objects.requireNonNull(App.class.getResource("/ListItem.fxml"));
        try {
            FXMLLoader loader = new FXMLLoader(listItemURL);
            loader.setController(new ItemController(item));
            return loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Node createEditableItem(Item item) {
        /*
        == PSEUDOCODE ==
        result = loadFromFXML("EditableListItem.fxml");
        result.controller = new ItemController(item);
        return result;
         */
        URL listItemURL = Objects.requireNonNull(App.class.getResource("/EditableListItem.fxml"));
        try {
            FXMLLoader loader = new FXMLLoader(listItemURL);
            loader.setController(new EditableListItemController(item));
            return loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

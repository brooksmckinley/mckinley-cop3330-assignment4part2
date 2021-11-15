/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import ucf.assignments.App;
import ucf.assignments.models.Item;
import ucf.assignments.views.ItemView;

import java.util.Objects;

public class ListController {
    @FXML
    protected TextField textField;
    @FXML
    protected DatePicker datePicker;

    @FXML
    public void handleAddItem(ActionEvent event) {
        /*
        == PSUEDOCODE ==
        description = textField.getContent();
        dueDate = dueDateField.getContent();
        completed = false;
        item = new Item(description, dueDate, completed);
        appList.addItem(item);
        currentTab.add(ItemView.createItem(item));
        textField = "";
        dueDateField = "";
         */
        String description = textField.getText();
        String dueDate;

        // Return and do nothing if the date is not valid
        if (datePicker.getValue() == null) {
            return;
        } else {
            dueDate = datePicker.getValue().toString();
        }
        Item item = new Item(description, dueDate, false);

        App.appList.addItem(item);
        VBox listItems = (VBox) Objects.requireNonNull(App.root)
                .lookup("#listItems");
        listItems.getChildren().add(ItemView.createItem(item));
        textField.setText("");
        datePicker.setValue(null);
    }
}

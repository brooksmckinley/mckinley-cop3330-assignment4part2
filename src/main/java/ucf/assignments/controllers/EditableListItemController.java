/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import ucf.assignments.App;
import ucf.assignments.models.Item;
import ucf.assignments.views.ItemView;

import java.time.LocalDate;

public class EditableListItemController {
    private Item item;

    @FXML
    protected HBox self;
    @FXML
    protected TextField textField;
    @FXML
    protected DatePicker datePicker;
    @FXML
    protected CheckBox checkBox;

    public EditableListItemController(Item item) {
        this.item = item;
    }

    @FXML
    public void initialize() {
        /*
        == PSEUDOCODE ==
        textField = item.description;
        datePicker = item.dueDate;
        checkBox = item.completed;
         */
        textField.setText(item.getDescription());
        datePicker.setValue(LocalDate.parse(item.getDueDate()));
        checkBox.setSelected(item.getCompleted());
    }

    @FXML
    public void handleCheck(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        item.setCompleted(event.target.checked);
         */
        item.setCompleted(checkBox.isSelected());
    }

    @FXML
    public void handleSave(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        item.description = textField;
        item.dueDate = datePicker;
        self.replace(ItemView.createItem(item));
         */
        item.setDescription(textField.getText());
        item.setDueDate(datePicker.getValue().toString());
        ObservableList itemsList = ((VBox) self.getParent()).getChildren();
        itemsList.set(itemsList.indexOf(self), ItemView.createItem(this.item));
    }

    @FXML
    public void handleDeleteButton(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        appList.removeItem(itemID);
        self.parent.remove(self);
         */
        App.appList.removeItem(this.item.getID());
        ((VBox) self.getParent()).getChildren().remove(self);
    }
}

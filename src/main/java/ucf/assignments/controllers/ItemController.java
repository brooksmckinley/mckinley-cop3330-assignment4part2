/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import ucf.assignments.App;
import ucf.assignments.models.Item;
import ucf.assignments.views.ItemView;

public class ItemController {
    private Item item;

    @FXML
    protected HBox self;
    @FXML
    protected Label taskDescription;
    @FXML
    protected Label dueDate;
    @FXML
    protected CheckBox checkbox;

    public ItemController(Item item) {
        this.item = item;
    }

    @FXML
    public void initialize() {
        /*
        == PSEUDOCODE ==
        taskDescription = item.description;
        dueDate = item.dueDate;
        checkbox = item.completed;
         */
        taskDescription.setText(item.getDescription());
        dueDate.setText(item.getDueDate());
        checkbox.setSelected(item.getCompleted());
    }

    @FXML
    public void handleEditItem(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        target.replace(ItemView.createEditableItem(target, itemID));
        */
        ObservableList itemsList = ((VBox) self.getParent()).getChildren();
        itemsList.set(itemsList.indexOf(self), ItemView.createEditableItem(this.item));
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

    @FXML
    public void handleCheck(ActionEvent event, int itemID) {
        /*
        == PSEUDOCODE ==
        appList.getItem(itemID).setCompleted(event.target.checked);
         */
    }
}

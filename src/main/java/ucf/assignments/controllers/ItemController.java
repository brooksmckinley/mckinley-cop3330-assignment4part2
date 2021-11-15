/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import ucf.assignments.models.Item;

public class ItemController {
    private Item item;

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
        taskDescription.setText(item.getDescription());
        dueDate.setText(item.getDueDate());
        checkbox.setSelected(item.getCompleted());
    }

    @FXML
    public void handleEditItem(Node target, int itemID) {
        /*
        == PSEUDOCODE ==
        target.replace(ItemView.createEditableItem(target, itemID));
        */
    }

    @FXML
    public void handleDeleteButton(Node target, int itemID) {
        /*
        == PSEUDOCODE ==
        appModel.getCurrentList().removeItem(itemID);
        target.remove();
         */
    }

    @FXML
    public void handleSave(Node target, int itemID) {
        /*
        == PSEUDOCODE ==
        description = target.textField.content;
        dueDate = target.dueDateField.content;
        newItem = new Item(itemID, description, dueDate);
        appModel.getCurrentList().setItem(itemID, newItem);
        target.replace(ItemView.createItem(newItem));
         */
    }

    @FXML
    public void handleCheck(ActionEvent event, int itemID) {
        /*
        == PSEUDOCODE ==
        appModel.getCurrentList().getItem(itemID).setCompleted(event.target.checked);
         */
    }
}

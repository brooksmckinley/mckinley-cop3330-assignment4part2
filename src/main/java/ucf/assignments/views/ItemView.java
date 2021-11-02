/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.views;

import javafx.scene.Node;
import ucf.assignments.models.Item;

public class ItemView {
    public static Node createItem(Item toCreate) {
        /*
        == PSEUDOCODE ==
        result = new HBox();
        result.add(new Label(item.description));
        result.add(new Label(item.dueDate));

        editButton = new Button("Edit");
        editButton.onClick(ItemController.handleEdit(result, toCreate.id));
        result.add(editButton);

        deleteButton = new Button("-");
        deleteButton.onClick(ItemController.handleDelete(result, toCreate.id));
        result.add(deleteButton);

        return result;
         */
        return null;
    }

    public static Node createEditableItem(int itemID) {
        /*
        == PSEUDOCODE ==
        result = new HBox();
        checkBox = new Checkbox();
        checkBox.onClick(ItemController.handleCheck(event, itemID));
        result.add(checkBox);

        result.add(new TextField());
        result.add(new DatePicker());

        saveButton = new Button("Save");
        saveButton.onClick(ItemController.handleSave(result, itemID));
        result.add(saveButton);

        deleteButton = new Button("-");
        deleteButton.onClick(ItemController.handleDelete(result, itemID));
        result.add(deleteButton);
        return result;
         */
        return null;
    }
}

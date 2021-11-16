/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import ucf.assignments.App;
import ucf.assignments.models.Item;
import ucf.assignments.views.ItemView;

import java.util.ArrayList;
import java.util.Objects;

public class ViewMenuController {

    public enum CurrentState {
        VIEW_ALL_ITEMS,
        VIEW_INCOMPLETE_ITEMS,
        VIEW_COMPLETED_ITEMS,
    }

    private static CurrentState state = CurrentState.VIEW_ALL_ITEMS;

    @FXML
    public void handleViewAllItems(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        state = VIEW_ALL_ITEMS;
        renderItems();
         */
        state = CurrentState.VIEW_ALL_ITEMS;
        renderItems();
    }

    @FXML
    public void handleViewIncompleteItems(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        state = VIEW_INCOMPLETE_ITEMS;
        renderItems();
         */
        state = CurrentState.VIEW_INCOMPLETE_ITEMS;
        renderItems();
    }

    @FXML
    public void handleViewCompletedItems(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        state = VIEW_COMPLETED_ITEMS;
        renderItems();
         */
        state = CurrentState.VIEW_COMPLETED_ITEMS;
        renderItems();
    }

    public static void renderItems() {
        /*
        == PSEUDOCODE ==
        if (current state is view all) {
            items = getAllItems();
        } else if (current state is view completed) {
            items = getCompletedItems();
        } else if (current state is get incomplete) {
            items = getIncompleteItems();
        }

        screen.clear();
        for (item in items) {
            screen.add(item);
        }
         */
        ArrayList<Item> items;
        if (getCurrentState() == CurrentState.VIEW_ALL_ITEMS) {
            items = App.appList.getAllItems();
        } else if (getCurrentState() == CurrentState.VIEW_COMPLETED_ITEMS) {
            items = App.appList.getCompletedItems();
        } else {
            items = App.appList.getIncompleteItems();
        }

        ObservableList<Node> screen = getListItems();
        screen.clear();
        for (Item item : items) {
            screen.add(ItemView.createItem(item));
        }
    }

    public static CurrentState getCurrentState() {
        return state;
    }

    protected static ObservableList<Node> getListItems() {
        /*
        == PSEUDOCODE ==
        list = lookup("#listItems");
        return list;
         */
        VBox listItems = (VBox) Objects.requireNonNull(App.root)
                .lookup("#listItems");
        return listItems.getChildren();
    }

}

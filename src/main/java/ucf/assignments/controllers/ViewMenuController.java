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
        screen.clearList();
        for (item in appList.getAllItems()) {
            screen.add(ItemView.createItem(item));
        }
         */
        ObservableList<Node> screen = getListItems();
        state = CurrentState.VIEW_ALL_ITEMS;
        screen.clear();
        for (Item item : App.appList.getAllItems()) {
            screen.add(ItemView.createItem(item));
        }
    }

    @FXML
    public void handleViewIncompleteItems(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        screen.clearList();
        for (item in appList.getIncompleteItems()) {
            screen.add(ItemView.createItem(item));
        }
         */
        ObservableList<Node> screen = getListItems();
        state = CurrentState.VIEW_INCOMPLETE_ITEMS;
        screen.clear();
        for (Item item : App.appList.getIncompleteItems()) {
            screen.add(ItemView.createItem(item));
        }
    }

    @FXML
    public void handleViewCompletedItems(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        screen.clearList();
        for (item in appList.getCompletedItems()) {
            screen.add(ItemView.createItem(item));
        }
         */
    }

    public static CurrentState getCurrentState() {
        return state;
    }

    protected static ObservableList<Node> getListItems() {
        VBox listItems = (VBox) Objects.requireNonNull(App.root)
                .lookup("#listItems");
        return listItems.getChildren();
    }

}

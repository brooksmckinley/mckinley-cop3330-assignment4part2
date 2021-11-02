/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ViewMenuController {

    @FXML
    public void handleViewAllItems(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        for (i, tab in openTabs) {
            tab.clearList();
            for (item in appModel.getList(i).getAllItems()) {
                tab.add(ItemView.createItem(item));
            }
        }
         */
    }

    @FXML
    public void handleViewIncompleteItems(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        for (i, tab in openTabs) {
            tab.clearList();
            for (item in appModel.getList(i).getIncompleteItems()) {
                tab.add(ItemView.createItem(item));
            }
        }
         */
    }

    @FXML
    public void handleViewCompletedItems(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        for (i, tab in openTabs) {
            tab.clearList();
            for (item in appModel.getList(i).getCompletedItems()) {
                tab.add(ItemView.createItem(item));
            }
        }
         */
    }
}

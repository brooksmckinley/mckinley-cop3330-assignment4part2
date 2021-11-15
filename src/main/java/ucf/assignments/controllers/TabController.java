/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import ucf.assignments.App;

public class TabController {
    @FXML
    protected TabPane tabPane;

    @FXML
    public void handleTabSwitch(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        currentTab = tabs.getSelectedTab();
        for (i, tab in tabs) {
            if (tab is selected) {
                appModel.setCurrentList(i);
            }
        }
         */
    }

    public static Tab getCurrentTab() {
        /*
        == PSEUDOCODE ==
        for (tab in tabs) {
            if (tab.isSelected()) {
                return tab;
            }
        }
        // This should never get here
        return null;
         */
        for (Tab tab : ((TabPane) App.root.lookup("#tabPane")).getTabs()) {
            if (tab.isSelected()) {
                return tab;
            }
        }
        return null;
    }
}

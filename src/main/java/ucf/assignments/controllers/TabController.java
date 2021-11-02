/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;

public class TabController {
    private static Node currentTab = null;

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

    public static Node getCurrentTab() {
        /*
        == PSEUDOCODE ==
        if (tab is null) {
            return first tab;
        }
        return currentTab;
         */
        return null;
    }
}

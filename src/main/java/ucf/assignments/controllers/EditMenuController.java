/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.controllers;


import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import ucf.assignments.App;

import java.util.Objects;

public class EditMenuController {

    @FXML
    public void handleClearList() {
        /*
        == PSEUDOCODE ==
        appList.clearList();
        visibleItems.clear();
         */
        App.appList.clearList();
        VBox listItems = (VBox) Objects.requireNonNull(App.root)
                .lookup("#listItems");
        listItems.getChildren().clear();
    }

}

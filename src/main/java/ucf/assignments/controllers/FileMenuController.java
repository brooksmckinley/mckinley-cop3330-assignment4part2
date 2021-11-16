/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import ucf.assignments.App;
import ucf.assignments.models.List;
import java.io.File;
import java.io.IOException;

public class FileMenuController {

    @FXML
    public void handleOpen(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        dialog = new FileOpenDialog();
        file = dialog.show();
        screen.clear();
        appList = deserialize(readString(file));
        screen.add(appList content);
         */
        FileChooser dialog = new FileChooser();
        File file = dialog.showOpenDialog(App.stage);
        App.appList = List.loadList(file);
        ViewMenuController.renderItems();
    }


    @FXML
    public void handleSave(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        dialog = new FileSaveDialog();
        file = dialog.show();
        appList.saveList(file);
         */
        FileChooser dialog = new FileChooser();
        File file = dialog.showSaveDialog(App.stage);
        try {
            App.appList.saveList(file);
        } catch (IOException e) {
            // Print error to indicate that the file failed to save
            e.printStackTrace();
        }

    }

    @FXML
    public void handleQuit(ActionEvent event) {
        /*
        == PSUEDOCODE ==
        exit(0); or whatever the java equivalent is
         */
        System.exit(0);
    }
}

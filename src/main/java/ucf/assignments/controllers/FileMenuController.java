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
        System.out.println(file);
        App.appList = List.loadList(file);
        ViewMenuController.renderItems();
    }


    @FXML
    public void handleSave(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        appModel.getCurrentList().save();
        catch (file not found or not defined) {
            save = new FileSaveDialog();
            dialog.onConfirm((path) -> {
                appModel.getCurrentList().setFile(new File(path));
                appModel.getCurrentList().save();
            }
        }
         */
    }

    @FXML
    public void handleQuit(ActionEvent event) {
        /*
        == PSUEDOCODE ==
        exit(0); or whatever the java equivalent is
         */
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments.controllers;

import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class FileMenuController {

    @FXML
    public void handleOpen(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        dialog = new FileOpenDialog();
        dialog.onConfirm((path) -> {
            newTab = ListView.createNewTab();
            newList = List.loadList(path);
            for (item in newList) {
                newTab.add(ItemView.createItem(item));
            }
            newTab.select();
        });
        dialog.show();
         */
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

package ucf.assignments.controllers;

import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class FileMenuController {

    @FXML
    public void handleNewList(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        newList = new List("Untitled");
        newTab = ListView.createNewTab();
        newTab.select();
        appModel.addList(newList);
        appModel.setNewList(last item in list);
         */
    }

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
    public void handOpenMultiple(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        dialog = new FileOpenDialog();
        dialog.onConfirm((paths) -> {
            newLists = List.loadLists(paths);
            for (list in newLists) {
                newTab = ListView.createNewTab();
                for (item in newList) {
                    newTab.add(ItemView.createItem(item));
                }
                appModel.addList(list);
            }
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
    public void handleSaveAll(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        loop {
            appModel.saveAllLists();
            catch (file not found or not defined) {
                save = new FileSaveDialog();
                dialog.onConfirm((path) -> {
                    list.setFile(new File(path));
                }
            }
        }
         */
    }

    @FXML
    public void handleCloseList(ActionEvent event) {
        /*
        == PSEUDOCODE ==
        appModel.removeList(appModel.getCurrentList());
        TabController.getCurrentTab().close();
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

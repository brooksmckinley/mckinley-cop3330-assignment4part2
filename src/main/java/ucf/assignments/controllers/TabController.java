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

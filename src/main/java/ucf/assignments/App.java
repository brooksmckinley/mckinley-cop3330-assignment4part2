/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ucf.assignments.models.List;

import java.util.Objects;


public class App extends Application {

    public static List appList = new List();
    public static Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/application.fxml")));


        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("To-Do List Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

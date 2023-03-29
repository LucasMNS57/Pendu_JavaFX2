package com.example.pendu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = loadFXML("Main.fxml");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/View/"+ fxml));
        return fxmlLoader.load();
    }
    public static void main(String[] args) {
        launch();
    }
}
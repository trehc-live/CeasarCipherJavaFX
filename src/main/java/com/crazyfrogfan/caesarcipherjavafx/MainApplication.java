package com.crazyfrogfan.caesarcipherjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("application-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        scene.getStylesheets().add(String.valueOf(MainApplication.class.getResource("application.css")));

        stage.setTitle("Caesar cipher!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
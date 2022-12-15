package com.example.task7;

import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.security.Provider;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public VBox box;
    @FXML
    private Label welcomeText;
    Signal signal = new Signal();
    TimeServer timeServer = new TimeServer();

    @FXML
    protected void onHelloButtonClick() {
        //box.getChildren().add(signal);
        //signal.update();
    }
    public void onHelloButtonClickStart(ActionEvent actionEvent) {
        System.out.println("start");
        timeServer.attach(signal);
    }

    public void onHelloButtonClickStop(ActionEvent actionEvent) {
        System.out.println("stop");
        timeServer.detach(signal);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        box.getChildren().add(signal.txt);

    }

}
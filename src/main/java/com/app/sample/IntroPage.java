package com.app.sample;

import java.io.IOException;

import javafx.fxml.FXML;

public class IntroPage {
    @FXML

    public void gotoPrimary() throws IOException {
        App.setRoot("primary");
    }
}

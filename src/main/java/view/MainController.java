package view;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import vlasovjr.javafx.fxml.FXContentLoader;
import vlasovjr.javafx.fxml.InitFX;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements InitFX {

    @FXML
    AnchorPane topAPane,
            midAPane,
            bottomAPane;

    public void myInit() {

    }

    public void initialize(URL location, ResourceBundle resources) {
        FXContentLoader.loadTo(topAPane, "/fxml/main/topAPane.fxml");
        FXContentLoader.loadTo(midAPane, "/fxml/main/midAPane.fxml");
        FXContentLoader.loadTo(bottomAPane, "/fxml/main/bottomAPane.fxml");
    }
}
package view.window.add;

import content.control.MyWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import vlasovjr.javafx.fxml.InitFX;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Vlasov Vladimir on 30.06.2016.
 * Email vlasov.jr@mail.ru
 */
public class NewUniverWindowController implements InitFX {
    @FXML
    Button
            cancelButton,
            addButton;

    @FXML
    TextField univerNameTextField;

    @Override
    public void myInit() {

    }

    MyWindow myWindow = new MyWindow(null);

    @Override
    public void myInit(Object o) {
        myWindow = (MyWindow) o;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cancelButton.setOnAction(event -> {
            myWindow.setYasNoAnswer(false);
            Stage stage = (Stage) cancelButton.getScene().getWindow();
            stage.close();
        });
        addButton.setOnAction(event ->{
            myWindow.setYasNoAnswer(true);
            Stage stage = (Stage) cancelButton.getScene().getWindow();
            stage.close();
        });
    }


}

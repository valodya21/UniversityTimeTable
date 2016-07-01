package content.control;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import vlasovjr.javafx.fxml.FXContentLoader;

/**
 * Created by Vlasov Vladimir on 01.07.2016.
 * Email vlasov.jr@mail.ru
 */
public class MyWindow {
    private String fxmlPath;

    public MyWindow(String path) {
        fxmlPath = path;
    }

    public void newWindow(){
        AnchorPane window = new AnchorPane();
        FXContentLoader.loadToWithDate(window, this, fxmlPath);

        Scene scene = new Scene(window);

        Stage stage;
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("New Univer");
        yesNo = false;
        stage.showAndWait();
    }

    private boolean yesNo;

    public void setYasNoAnswer(boolean yasNoAnswer){
        yesNo = yasNoAnswer;
    }

    public boolean getYesNoAnswer(){
        return yesNo;
    }

    Object object;

    public void setWindowAnswer(Object o){
        object = o;
    }

    public Object getWindowAnswer(){
        return object;
    }
}

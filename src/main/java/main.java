import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import vlasovjr.javafx.fxml.FXContentLoader;

/**
 * Created by Vlasov Vladimir on 28.06.2016.
 * Email vlasov.jr@mail.ru
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        //init main window
        AnchorPane mainWindow = FXContentLoader.load("/fxml/main.fxml");

        Scene scene = new Scene(mainWindow);

        primaryStage.setScene(scene);

        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);

        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}

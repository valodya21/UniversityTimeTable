package view.main;

import content.controllers.TabPaneController;
import content.controllers.TreeViewController;
import javafx.fxml.FXML;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TabPane;
import javafx.scene.control.TreeView;
import vlasovjr.javafx.fxml.InitFX;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Vlasov Vladimir on 30.06.2016.
 * Email vlasov.jr@mail.ru
 */
public class midAPaneController implements InitFX{

    @FXML
    SplitPane splitPane;

    @FXML
    TreeView mainTreeView;

    @FXML
    TabPane mainTabPane;

    public void myInit() {

    }

    @Override
    public void myInit(Object o) {

    }

    public void initialize(URL location, ResourceBundle resources) {
        SplitPane.setResizableWithParent(mainTreeView, Boolean.FALSE);
        TreeViewController.setMainTreeView(mainTreeView);
        TabPaneController.setMainTabPane(mainTabPane);
    }
}

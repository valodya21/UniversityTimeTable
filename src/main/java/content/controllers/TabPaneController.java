package content.controllers;

import content.control.MyTab;
import javafx.scene.control.TabPane;

/**
 * Created by Vlasov Vladimir on 30.06.2016.
 * Email vlasov.jr@mail.ru
 */
public class TabPaneController {
    private static TabPane mainTabPane;

    public static void setMainTabPane(TabPane mainTabPane) {
        TabPaneController.mainTabPane = mainTabPane;

        MyTab tab = new MyTab("Tested");
        mainTabPane.getTabs().add(tab);
    }

    public static TabPane getMainTabPane() {
        return mainTabPane;
    }

    public static void closeTabRequest(MyTab myTab) {
        System.out.println("KEK");
        mainTabPane.getTabs().remove(myTab);
    }
}

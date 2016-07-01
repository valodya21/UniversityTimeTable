package content.controllers;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeView;

/**
 * Created by Vlasov Vladimir on 30.06.2016.
 * Email vlasov.jr@mail.ru
 */
public class TreeViewController {
    private static TreeView mainTreeView;

    public static void setMainTreeView(TreeView treeView){
        mainTreeView = treeView;
        setContextMenu();
    }

    public static TreeView getMainTreeView(){
        return mainTreeView;
    }

    private static void setContextMenu(){
        ContextMenu contextMenu = new ContextMenu();
        MenuItem menuItem = new MenuItem();

        menuItem.setText("Add new University");
        menuItem.setOnAction(event -> ContentController.addNewUniverAction());

        contextMenu.getItems().add(menuItem);
        mainTreeView.setContextMenu(contextMenu);
    }
}

package content.controllers;

import javafx.scene.control.TreeView;

/**
 * Created by Vlasov Vladimir on 30.06.2016.
 * Email vlasov.jr@mail.ru
 */
public class TreeViewController {
    private static TreeView mainTreeView;

    public static void setMainTreeView(TreeView treeView){
        mainTreeView = treeView;
    }

    public static TreeView getMainTreeView(){
        return mainTreeView;
    }
}

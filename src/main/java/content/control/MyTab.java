package content.control;

import content.controllers.TabPaneController;
import javafx.scene.Node;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Tab;
import vlasovjr.javafx.image.Imager;

/**
 * Created by Vlasov Vladimir on 30.06.2016.
 * Email vlasov.jr@mail.ru
 */
public class MyTab extends Tab {

    private boolean closable = true;

    /**
     * Creates a tab with no title.
     */
    public MyTab() {
        this(null);
    }

    /**
     * Creates a tab with a text title.
     *
     * @param text The title of the tab.
     */
    public MyTab(String text) {
        this(text, null);
    }

    /**
     * Creates a tab with a text title and the specified content node.
     *
     * @param text The title of the tab.
     * @param content The content of the tab.
     * @since JavaFX 8u40
     */
    public MyTab(String text, Node content) {
        setText(text);
        setContent(content);
        getStyleClass().addAll("tab");
        closableProperty().set(false);
        setCloseIcon();
        setCloseIcon();
    }

    private void setCloseIcon(){
        Hyperlink hyperlink = new Hyperlink();
        Imager image = new Imager("/images/close.png");
        hyperlink.setGraphic(image.getImageView(14,14));
        hyperlink.setFocusTraversable(false);
        this.setGraphic(hyperlink);
        this.setGraphic(null);
        hyperlink.setOnAction(event -> TabPaneController.closeTabRequest(this));
    }

    private void removeCloseIcon(){
        this.setGraphic(null);
    }

    public void setClosableIcon(boolean closable){
        this.closable = closable;
        if(this.closable) setCloseIcon();
        else removeCloseIcon();
    }



}

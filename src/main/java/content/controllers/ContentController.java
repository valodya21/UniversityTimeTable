package content.controllers;

/**
 * Created by Vlasov Vladimir on 30.06.2016.
 * Email vlasov.jr@mail.ru
 */
public class ContentController {

    public static void addNewUniverAction(){
        WindowController.univer.newWindow();



        System.out.println("end "+WindowController.univer.getYesNoAnswer());
    }
}

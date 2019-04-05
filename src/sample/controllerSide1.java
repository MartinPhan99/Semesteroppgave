package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class controllerSide1 {
   public static  ArrayList<Object> lokalerList = new ArrayList<Object>();



    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField txtLokale;

    @FXML
    private TextField txtType;

    @FXML
    private TextField txtAntall;

    @FXML
    void btnRegistrer(ActionEvent event) throws IOException {
        Parent tableViewParent=FXMLLoader.load(getClass().getClassLoader().getResource("sample/side2.fxml"));
        Scene tableViewScene=new Scene(tableViewParent);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
        /*Duplisert kode, mulig å lage en medtode for koden over*/

        Lokale lokale= new Lokale(txtLokale.getText(),txtType.getText(),txtAntall.getText());
        lokalerList.add(lokale);


        /*Skal så prøve å addde data til lokalerList*/
        /*
        ObservableList<Lokale> list=FXCollections.observableArrayList(
                new Lokale(lokale.getLokaleNavn(),lokale.getTypeLokale(),lokale.getAntallPlasser())

        );
        */

    }



}

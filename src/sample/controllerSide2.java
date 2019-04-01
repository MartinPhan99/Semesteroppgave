package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static sample.controllerSide1.LokalerList; // Importerer ArrayList side1

public class controllerSide2 {
        @FXML
        private AnchorPane pane2;

        @FXML
        private Label registrertLokale;

        @FXML
        private TableView<Lokale> tableView;

        @FXML
        private TableColumn<Lokale,String> lokaleNavn;

        @FXML
        private TableColumn<Lokale,String> lokaleType;

        @FXML
        private TableColumn<Lokale,String> lokaleAntall;

        public void tilbakeTilRegistrering(ActionEvent actionEvent) throws IOException {
                Parent tableViewParent= FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
                Scene tableViewScene=new Scene(tableViewParent);
                Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }

        public void visRegistrerte(ActionEvent actionEvent) {
                /*Dette viser label for forrige versjon*/
                String t="";
                for(Object x: LokalerList){
                        t+=x;
                }


        }



}

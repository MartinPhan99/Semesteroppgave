package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class controllerSide2 implements Initializable  {
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

        ObservableList<Lokale> observableList= FXCollections.observableArrayList(
                new Lokale("afafa","afaf","afaf" ));


        public void tilbakeTilRegistrering(ActionEvent actionEvent) throws IOException {
                Parent tableViewParent= FXMLLoader.load(getClass().getClassLoader().getResource("sample/sample.fxml"));
                Scene tableViewScene=new Scene(tableViewParent);
                Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
                window.setScene(tableViewScene);
                window.show();
        }



        @Override
        public void initialize(URL location, ResourceBundle resources) {

                //ObservableList<Object> observableList= FXCollections.observableArrayList(lokalerList);

                lokaleNavn.setCellValueFactory(new PropertyValueFactory<Lokale,String>("lokaleNavn"));
                lokaleType.setCellValueFactory(new PropertyValueFactory<Lokale,String>("typeLokale"));
                lokaleAntall.setCellValueFactory(new PropertyValueFactory<Lokale,String>("antallPlasser"));

            tableView.setItems(observableList);

        }

        public void visRegistrerte(ActionEvent actionEvent) {
               Lokale lokale=new Lokale("adad","afaf","afaf");

        }







}

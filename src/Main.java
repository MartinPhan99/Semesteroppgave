import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.stage.*;
import javax.swing.*;
import java.util.ArrayList;

public class Main extends Application { //Eventhandler gjør at vi kan styre brukerinteraksjoner

    Stage window;
    Scene scene,scene2;
    ArrayList<Object> LokalerList = new ArrayList<Object>();
    ListView<String> listview;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        Label label1=new Label("Registrer ditt lokale");
        TextField lokaleNavn = new TextField ();
        Label label2=new Label("Hvilken type lokale er det ");
        TextField lokaleType = new TextField ();
        Label label3=new Label("Hvor mange er det plass til i lokalet");
        TextField lokalePlasser = new TextField ();
        Button button1= new Button("Registrer");
        Button button2= new Button("Vis");
        Label label4=new Label("hello");
        listview=new ListView<>();

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Lokale lokale= new Lokale(lokaleNavn.getText(),lokaleType.getText(),lokalePlasser.getText());
                LokalerList.add(lokale);
            }
        });//Bytter scene


        VBox layout=new VBox(15);
        layout.getChildren().addAll(label1,lokaleNavn,label2,lokaleType,label3,lokalePlasser,button1,button2);
        scene=new Scene(layout,600,300);
        VBox layout2= new VBox(15);


        scene2= new Scene(layout2,600,300);
        Button button3=new Button("Legg til flere");



       button2.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {

               String t="";
               window.setScene(scene2);
               for(Object x: LokalerList){
                  t+=x;
               }
               Label label4=new Label(t);
               layout2.getChildren().add(label4);
           }
       });
        layout2.getChildren().add(button3);
        window.setScene(scene);
        window.show();




    }

}
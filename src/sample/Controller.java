package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.Random;

public class Controller {

    public void ChangeScreen (ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("NesteSide.fxml"));
        Scene NesteSide =  new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(NesteSide);
        window.show();
    }

    public void ChangeBack (ActionEvent event) throws  IOException{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene sample = new Scene (root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(sample);
        window.show();
    }

    public void ChangeToPaul (ActionEvent event) throws  IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Lolz.fxml"));
        Scene Paul = new Scene (root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(Paul);
        window.show();
    }








}

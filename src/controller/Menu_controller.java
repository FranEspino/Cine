package controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Director;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Observable;
import java.util.ResourceBundle;


public class Menu_controller implements Initializable {

    @FXML
    private TableView <Director> Table_director;
    @FXML
    TableColumn <Director, String> colum_nombredir;
    @FXML
    TableColumn <Director, String> colum_nacdir;
    @FXML
    TableColumn <Director, String> colum_profesiondir;
    @FXML
    private Button irVenta;
    @FXML
    private BorderPane bp;
    private AnchorPane ap;
    @FXML
    private ImageView cartelera;
    @FXML
    private ImageView usericon;
    @FXML
    private Label email_user;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image image = new Image("resources/cartelera.jpg");
        cartelera.setImage(image);

        Image image2 = new Image("resources/user.png");
        usericon.setImage(image2);

        Director d = new Director();
        ObservableList<Director> items = d.getDirectors();
        this.Table_director.setItems(items);
        this.colum_nombredir.setCellValueFactory(new PropertyValueFactory("nombre_dir"));
        this.colum_nacdir.setCellValueFactory(new PropertyValueFactory("nacionalidad_dir"));
        this.colum_profesiondir.setCellValueFactory(new PropertyValueFactory("profesion_dir"));

    }





    public  void recibeParametros(String  user){
        email_user.setText(user);
    }


    public void closeWindows(){

    }


    @FXML
    public void home(MouseEvent mouseEvent) {




    }

    public void sale(MouseEvent mouseEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Ventas.fxml"));
        try {
            Parent root  = loader.load();
            Ventas controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void billboard(MouseEvent mouseEvent) {
    }
    @FXML
    public void movies(MouseEvent mouseEvent) {
    }
    @FXML
    public void settings(MouseEvent mouseEvent) {
    }





}

package controller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Menu_controller implements Initializable {

    @FXML
    private Button irVenta;

    @FXML
    private BorderPane bp;
    private AnchorPane ap;

    @FXML
    private ImageView cine;

    @FXML
    private ImageView usericon;
    @FXML
    private Label email_user;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image image = new Image("resources/cinema.jpg");
        cine.setImage(image);

        Image image2 = new Image("resources/user.png");
        usericon.setImage(image2);

    }

    public  void recibeParametros(String  user){
        email_user.setText(user);
    }


    public void closeWindows(){

    }


    @FXML
    public void home(MouseEvent mouseEvent) {
       bp.setCenter(ap);

    }


    public void sale(MouseEvent mouseEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Ventas.fxml"));
        try {
            Parent root  = loader.load();
            Ventas controller = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            Stage mystage = (Stage) this.irVenta.getScene().getWindow();
            mystage.close();



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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.internetLogin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jayamaha
 */
public class InternetLoginController implements Initializable {
    
    @FXML
    private TextField password;

    @FXML
    private TextField uname;

    @FXML
    private Button login;


    public void goToSpotifyplaylists(){
        String username;
        String password;
        username = this.uname.getText().toString();
        password = this.password.getText().toString();
        
        if(username.contains("nadunjayamaha") && password.contains("12345")){
            try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clementine/importPlaylists/importPlaylists.fxml"));
            Parent rootX = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Virtualization");
            stage.setScene(new Scene(rootX));
            stage.show();
        }
        catch (Exception e){
            System.out.println(e);
        }
            
        }
        else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Message Here...");
                alert.setHeaderText("Look, an Information Dialog");
                alert.setContentText("I have a great message for you!");
                alert.showAndWait();
        }
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

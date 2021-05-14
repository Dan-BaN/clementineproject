/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.internet;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class InternetPageController implements Initializable {

    public void goToLogin(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clementine/internetLogin/internetLogin.fxml"));
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

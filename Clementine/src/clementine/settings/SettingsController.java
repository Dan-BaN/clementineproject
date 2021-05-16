/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.settings;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author thinu
 */
public class SettingsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void preferences(){
        System.out.println("preferences menu");
    
    }
    public void save(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Create playlist");
                alert.setHeaderText("Saving settings....");
                alert.setContentText("Settings saved");
                alert.showAndWait();
    
    
    
    }
    
}

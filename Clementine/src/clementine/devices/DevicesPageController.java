/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.devices;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class DevicesPageController implements Initializable {
    
    private FileChooser filechoose;
   private File file;
   private Desktop desktop = Desktop.getDesktop();
   
    
    @FXML
    private Label label;
    
    
    @FXML
    private Button fetchBtn;
    private Window primaryStage;

    @FXML
    void a89595(ActionEvent event) {

    }

    @FXML
    void fetchFunc(ActionEvent event) {

        
    }

    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       
               filechoose = new FileChooser();
         
         filechoose.getExtensionFilters().addAll(
         
                 new FileChooser.ExtensionFilter("Device","*.Iphone","*.Android"),
                 new FileChooser.ExtensionFilter("All files","*.*")
         );
         
         
         
         fetchBtn.setOnAction(e ->{
             file = filechoose.showOpenDialog(primaryStage);
             if(file != null){
                 
                 try {
                     desktop.open(file);
                 } catch (IOException ex) {
                     Logger.getLogger(DevicesPageController.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
             }
         });
        
        
    }
    
    @FXML
    private void synbutton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Message Here...");
                alert.setHeaderText("Look, an Information Dialog");
                alert.setContentText("I have a great message for you!");
                alert.showAndWait();
    }
    
    
     @FXML
    private void backupbutton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Clementine Backup");
                alert.setHeaderText("Backup File Created");
                alert.setContentText("Successfull backup");
                alert.showAndWait();
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO    
  
    }
}
    
    

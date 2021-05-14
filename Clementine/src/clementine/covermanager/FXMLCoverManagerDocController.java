/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.covermanager;

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author THARUVI
 */
public class FXMLCoverManagerDocController implements Initializable {
    
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
         
                 new ExtensionFilter("Image files","*.jpg","*.png"),
                 new ExtensionFilter("All files","*.*")
         );
         
         
         
         fetchBtn.setOnAction(e ->{
             file = filechoose.showOpenDialog(primaryStage);
             if(file != null){
                 
                 try {
                     desktop.open(file);
                 } catch (IOException ex) {
                     Logger.getLogger(FXMLCoverManagerDocController.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
             }
         });
        
        
    }
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
  
    }    
    
    
    
}

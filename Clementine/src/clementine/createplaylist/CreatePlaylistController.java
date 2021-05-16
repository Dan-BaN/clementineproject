/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.createplaylist;


import com.sun.javafx.logging.PlatformLogger.Level;
import static java.awt.SystemColor.desktop;
import java.awt.Desktop;
import java.io.IOException;
import java.io.File;
import java.lang.System.Logger;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.FileChooser.ExtensionFilter;

/**
 * FXML Controller class
 *
 * @author thinu
 */
public class CreatePlaylistController implements Initializable {
    
    private FileChooser filechoose;
   private File file;
   private Desktop desktop = Desktop.getDesktop();

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button addimg;
    private Window primaryStage;
    
    @FXML
    private Button addsonf;
    private Window newwindow;
    
    @FXML
    private Button savebtn;
    
    @FXML
    private ImageView imagev; 
    
    
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void save(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Create playlist");
                alert.setHeaderText("Saving playlist....");
                alert.setContentText("Playlist created succesfully!");
                alert.showAndWait();
    
    
    
    }
    

    @FXML
    private void addsong(ActionEvent event) throws IOException {
        filechoose = new FileChooser();
         
         filechoose.getExtensionFilters().addAll(
         
                 
                 new ExtensionFilter("All files","*.*")
         );
         
                
                 addsonf.setOnAction(e ->{
             file = filechoose.showOpenDialog(newwindow);
             if(file != null){
                try {
                    
                     desktop.open(file);
                 } catch (IOException ex) {
                     java.util.logging.Logger.getLogger(CreatePlaylistController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                 }
             }
             
         });
    
    
    }
    
    
     @FXML
    private void addimage(ActionEvent event) throws IOException {
        
        
        
        
            filechoose = new FileChooser();
         
         filechoose.getExtensionFilters().addAll(
         
                 new ExtensionFilter("Image files","*.jpg","*.png"),
                 new ExtensionFilter("All files","*.*")
         );
         
                
                 addimg.setOnAction(e ->{
             file = filechoose.showOpenDialog(primaryStage);
             if(file != null){
                try {
                    /*String imagepath = file.getPath();
                    Image image = new Image(imagepath);
                    imagev.setImage(image);*/
                     desktop.open(file);
                 } catch (IOException ex) {
                     java.util.logging.Logger.getLogger(CreatePlaylistController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                 }
             }
             
         });
        
    }
      
        
}

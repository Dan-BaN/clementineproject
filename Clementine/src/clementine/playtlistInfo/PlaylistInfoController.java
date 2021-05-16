package clementine.playtlistInfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import clementine.createplaylist.CreatePlaylistController;
import java.awt.Desktop;
import static java.awt.SystemColor.desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author thinu
 */




public class PlaylistInfoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private FileChooser filechoose;
   private File file;
   private Desktop desktop = Desktop.getDesktop();
    @FXML
    private Button addsong;
    private Window primaryStage;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
   @FXML
    private void addso(ActionEvent event) throws IOException {
        
        
        
        
        FileChooser filechoose = new FileChooser();
         
         filechoose.getExtensionFilters().addAll(
         
                 
                 new FileChooser.ExtensionFilter("All files","*.*")
         );
         
                
                 addsong.setOnAction(e ->{
            
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

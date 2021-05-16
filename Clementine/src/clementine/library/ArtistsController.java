package clementine.library;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ArtistsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    private Pane contentArea; 
     
   
    
    
    
           @FXML
    void artistbtn(ActionEvent event)  throws IOException{
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/library/artists.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
            
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        
    }
    
      @FXML
    void albumbtn(ActionEvent event)  throws IOException{
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/library/albums.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
            
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        
    }
    
    
    
      @FXML
    void playlistbtn(ActionEvent event)  throws IOException{
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/playlist/playlistPage.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
            
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        
    }
    
    
      @FXML
    void songsbtn(ActionEvent event)  throws IOException{
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/library/libraryPage.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
            
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        
    }
    
    
   

 }
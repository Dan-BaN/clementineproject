package clementine.musicplayer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
public class MusicplayerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
      @FXML
    void playlist(ActionEvent event) {
        
         
      try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clementine/playlist/playlistPage.fxml"));
            Parent root5 = (Parent) fxmlLoader.load();
           
            Stage deviceStage = new Stage();
            deviceStage.setTitle("ds");
            deviceStage.setScene(new Scene(root5));
            deviceStage.show();
        }
        catch (Exception e){
            
            e.printStackTrace();
        }
      
    }
    
    
          @FXML
    void share(ActionEvent event) {
        
         
      try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clementine/internet/internetPage.fxml"));
            Parent root5 = (Parent) fxmlLoader.load();
           
            Stage deviceStage = new Stage();
            deviceStage.setTitle("ds");
            deviceStage.setScene(new Scene(root5));
            deviceStage.show();
        }
        catch (Exception e){
            
            e.printStackTrace();
        }
        
    }
    
      @FXML
    void lyrics(ActionEvent event) {
        
         
      try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clementine/songInfo/songInfoPage.fxml"));
            Parent root5 = (Parent) fxmlLoader.load();
           
            Stage deviceStage = new Stage();
            deviceStage.setTitle("ds");
            deviceStage.setScene(new Scene(root5));
            deviceStage.show();
        }
        catch (Exception e){
            
            e.printStackTrace();
        }
        
    }
    
    
    
    
    @FXML
    void play(ActionEvent event) {
        
         
      try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/images/apple.png"));
            Parent root5 = (Parent) fxmlLoader.load();
           
            Stage deviceStage = new Stage();
            deviceStage.setTitle("ds");
            deviceStage.setScene(new Scene(root5));
            deviceStage.show();
        }
        catch (Exception e){
            
            e.printStackTrace();
        }
        
    }
    

 
   

 }
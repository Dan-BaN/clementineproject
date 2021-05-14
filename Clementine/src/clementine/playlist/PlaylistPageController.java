/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.playlist;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class PlaylistPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    public void create(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clementine/createplaylist/createPlaylist.fxml"));
            Parent root5 = (Parent) fxmlLoader.load();

            Stage deviceStage = new Stage();
            deviceStage.setTitle("Create Playlist");
            deviceStage.setScene(new Scene(root5));
            deviceStage.show();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void view(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clementine/playtlistInfo/playlistInfo.fxml"));
            Parent root5 = (Parent) fxmlLoader.load();

            Stage deviceStage = new Stage();
            deviceStage.setTitle("Playlist Information");
            deviceStage.setScene(new Scene(root5));
            deviceStage.show();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

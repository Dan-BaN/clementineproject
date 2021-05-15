/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.visualizations;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class VisualizationsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button playButton;
     @FXML
  private Button pauseButton;

    

   @FXML
    private Button stopButton;
    
    @FXML
    private MediaView mediaView;
    
    MediaPlayer mediaPlayer;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        String vurl = "file:/X:/HCIv3/ClementineMusicPlayer-Javafx/Clementine/src/videos/visualizations.mp4";
        Media media = new Media(vurl);
        mediaPlayer = new MediaPlayer(media);
        
        mediaView.setMediaPlayer(mediaPlayer);
    }    
    
    
    @FXML
    void play(ActionEvent event) {
        if(mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING){
            mediaPlayer.stop();
            mediaPlayer.play();
        }else{
            mediaPlayer.play();

        }
    }
    
    @FXML
    void pause(ActionEvent event) {
        mediaPlayer.pause();

    }

    @FXML
    void stop(ActionEvent event) {
        mediaPlayer.stop();

    }
    
    
}

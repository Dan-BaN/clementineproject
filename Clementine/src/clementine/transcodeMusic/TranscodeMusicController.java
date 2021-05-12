/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.transcodeMusic;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class TranscodeMusicController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    
    @FXML
    private ComboBox combAudio;

    @FXML
    private ComboBox combDestination;

    @FXML
    void select(ActionEvent event) {
        

    }

    @FXML
    void selectD(ActionEvent event) {

    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList("Flac (.flac)", "M4A AAC (.mp4)", "MP3 (.mp3)","Ogg Flac (.ogg)","Ogg opus (.opus)","Ogg Speex (.spx)","Windows media audio (.wma)","WAV (.wav)");
        combAudio.setItems(list);
        ObservableList<String> list2 = FXCollections.observableArrayList("Alongside the originals");
        combDestination.setItems(list2);
        // TODO
    }   
    
}

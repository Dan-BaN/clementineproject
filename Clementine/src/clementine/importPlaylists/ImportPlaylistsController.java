/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.importPlaylists;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author Jayamaha
 */
public class ImportPlaylistsController implements Initializable {

    public void importPlaylist(){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Message Here...");
                alert.setContentText("Playlist imported");
                alert.showAndWait();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

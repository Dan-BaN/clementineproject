/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.transcodeMusic;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

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
    private Button closeButton;

       @FXML
    private Button addFileButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void closeTranscode(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }    
    
     @FXML
    void openAddFIleBrowser(ActionEvent event) {
         Stage stage = (Stage) addFileButton.getScene().getWindow();

         FileChooser fileChooser = new FileChooser();
         fileChooser.setTitle("Add Music Track");
         fileChooser.showOpenDialog(stage);
    }
    
    
}

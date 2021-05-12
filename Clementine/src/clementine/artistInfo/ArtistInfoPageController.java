/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.artistInfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ArtistInfoPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    private Pane artistPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AnchorPane.setTopAnchor(artistPane, 0.0);
        AnchorPane.setRightAnchor(artistPane, 0.0);
        AnchorPane.setBottomAnchor(artistPane, 0.0);
        // TODO
    }    
    

    
}

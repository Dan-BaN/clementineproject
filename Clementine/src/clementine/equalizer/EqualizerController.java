/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.equalizer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Jayamaha
 */
public class EqualizerController implements Initializable {

    
    private ObservableList<String> presetL;
    @FXML
    private ListView<String> presetList;
     
    @FXML
    private TextField presetInput;
    
    @FXML
    private Button addBtn;
    
    @FXML
    void addPreset(ActionEvent event) {

        presetL.add(presetInput.getText());
        presetList.setItems(presetL);
    }

     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         presetL = FXCollections.observableArrayList();
         presetL.addAll("Pop","Rock","Jazz","Club","Dance","R&B","Vocal","Classical","Custom");
         presetList.setItems(presetL);
    }    
    
}

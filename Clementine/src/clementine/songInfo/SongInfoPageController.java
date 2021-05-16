/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.songInfo;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SongInfoPageController implements Initializable {

    @FXML
    private TextArea lyricsArea;
    

    @FXML
    public void saveToText() {
       
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("New Alert");
                alert.setContentText("Lyrics Printing");
                alert.showAndWait();
            
    }
    
//    @FXML
//    void goToBrowser(ActionEvent event) {
//        
//         getHostServices().showDocument("http://www.yahoo.com/%22");
//
//    }
    
    @FXML
    public void goToBrowser() {
        
        try {
    Desktop.getDesktop().browse(new URL("https://www.google.com/search?sxsrf=ALeKk03ApdTOjH6QW_TqmpHmwLrhryZ33A:1621179958412&q=can%27t+help+falling+in+love&spell=1&sa=X&ved=2ahUKEwi6uqb8xc7wAhXLfn0KHWc5DEoQBSgAegQIARA2&biw=1536&bih=722").toURI());
} catch (IOException e) {
    e.printStackTrace();
} catch (URISyntaxException e) {
    e.printStackTrace();
}
    }

       
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

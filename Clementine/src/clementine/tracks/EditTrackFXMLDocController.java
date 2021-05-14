/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.tracks;

import java.awt.Desktop.Action;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import org.controlsfx.control.Notifications;

/**
 *
 * @author THARUVI
 */
public class EditTrackFXMLDocController implements Initializable {
    
    int count = 0;
    
     @FXML
    private Label label;
    
    
  
  /*  private Button SaveBtn; */

  /*  @FXML
    void displaySave(ActionEvent event) {

        label.setText("Information Saved"+count);
    }
   */
    
    @FXML
    private ChoiceBox<String> mychoicebox;
    private String[] info = {"see","efse","efef","efsef"};
    
    @FXML
    private ChoiceBox<String> mychoicebox2;
    private String[] info2 = {"see","efse","efef","efsef"};
    
     @FXML
    private ChoiceBox<String> mychoicebox3;
    private String[] info3 = {"see","efse","efef","efsef"};
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       //Image image1 = new Image("small_tick.png, true");
        Notifications notificationBuilder = Notifications.create()
                .title("Successfully saved")
                .graphic(null)
                .hideAfter(Duration.seconds(20))
                .position(Pos.BOTTOM_RIGHT)
                .onAction(new EventHandler<ActionEvent>() { 
                @Override
                public void handle(ActionEvent event){
                System.out.println("clicked on notification");
                }
                        });
    
        notificationBuilder.showConfirm();
        
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        mychoicebox.getItems().addAll(info);
        mychoicebox2.getItems().addAll(info2);
        mychoicebox3.getItems().addAll(info3);
        
        
    }  
    
    
    
    
}

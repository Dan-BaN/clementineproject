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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;
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
    private ChoiceBox<String> mychoicebox4;
    private String[] genre = {"Pop","Rock","Country Music","Jazz","Heavy Metal","Blues","Classical"};
    
    @FXML
    private ChoiceBox<String> mychoicebox;
    private String[] info = {"1","2","3","4","5","6","7"};
    
    @FXML
    private ChoiceBox<String> mychoicebox2;
   private String[] info2 = {"1","2","3","4","5","6","7"};
    
     @FXML
    private ChoiceBox<String> mychoicebox3;
    private String[] info3 = {"1998","1999","2000","2001","2002","2003","2004"};
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
        
    
    @FXML
    private void saving(ActionEvent event){
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Notification");
                alert.setHeaderText("Succussfully saved");
                //alert.setContentText("Press ok to continue");
                alert.showAndWait();     
     }
    
     @FXML
    private void discard(ActionEvent event){
        
        Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Notification");
                alert.setHeaderText("Do you want to Discard?");
                //alert.setContentText("Press ok to continue");
                alert.showAndWait();     
     }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        mychoicebox.getItems().addAll(info);
        mychoicebox2.getItems().addAll(info2);
        mychoicebox3.getItems().addAll(info3);
        mychoicebox4.getItems().addAll(genre);
        
        
    }  
    @FXML
    void openquediscard(ActionEvent event) {
        
         
      try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clementine/tracks/EditTrackFXMLDoc.fxml"));
            Parent root5 = (Parent) fxmlLoader.load();
           
            Stage deviceStage = new Stage();
            deviceStage.setTitle("cover Manager");
            deviceStage.setScene(new Scene(root5));
            deviceStage.show();
        }
        catch (Exception e){
            
            e.printStackTrace();
        }
}
    
    
    
    
    
}

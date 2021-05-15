/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.covertesting;

import clementine.covermanager.FXMLCoverManagerDocController;
import java.awt.Desktop;
import static java.awt.SystemColor.desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author THARUVI
 */




public class CovermangerNewController implements Initializable {

    
    private FileChooser filechoose;
   private File file;
   private Desktop desktop = Desktop.getDesktop();
   
    
    @FXML
    private Label label;
    
    
    @FXML
    private Button fetchBtn;
    private Window primaryStage;

    @FXML
    void a89595(ActionEvent event) {

    }

    @FXML
    void fetchFunc(ActionEvent event) {

        
    }
    
    
    @FXML
    private Pane contentArea;
    //@FXML
    //private Button fetchBtn;
    @FXML
    private Button searchButton;
    @FXML
    private Button libraryButton;
    @FXML
    private Button filesButton;
    @FXML
    private Button playlistButton;
    @FXML
    private Button internetButton;
    @FXML
    private Button devicesButton;
    @FXML
    private Button songInfoButton;
    @FXML
    private Button artistInfoButton;

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
      @FXML
    private void fetch(ActionEvent event){
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Alert");
                alert.setHeaderText("Fetching Cover unsuccessful!");
                //alert.setContentText("Press ok to continue");
                alert.showAndWait();     
     }
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       
               filechoose = new FileChooser();
         
         filechoose.getExtensionFilters().addAll(
         
                 new FileChooser.ExtensionFilter("Image files","*.jpg","*.png"),
                 new FileChooser.ExtensionFilter("All files","*.*")
         );
         
         
         
         fetchBtn.setOnAction(e ->{
             file = filechoose.showOpenDialog(primaryStage);
             if(file != null){
                 
                 try {
                     desktop.open(file);
                 } catch (IOException ex) {
                     Logger.getLogger(FXMLCoverManagerDocController.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
             }
         });
        
        
    }
    
    

    @FXML
    private void artist1(ActionEvent event) {
        
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/covertesting/page1.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @FXML
    private void artist2(ActionEvent event) {
         try{
                Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/covertesting/page2.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @FXML
    private void artist3(ActionEvent event) {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/covertesting/page3.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @FXML
    private void artist4(ActionEvent event) {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/covertesting/page4.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @FXML
    private void artist5(ActionEvent event) {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/covertesting/page5.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @FXML
    private void artist6(ActionEvent event) {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/covertesting/page6.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @FXML
    private void artist7(ActionEvent event) {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/covertesting/page7.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @FXML
    private void artist8(ActionEvent event) {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/covertesting/page8.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}

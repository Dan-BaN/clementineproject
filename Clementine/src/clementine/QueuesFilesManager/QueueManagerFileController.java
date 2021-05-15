/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.QueuesFilesManager;


import clementine.covermanager.FXMLCoverManagerDocController;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import javax.swing.JPanel;

/**
 * FXML Controller class
 *
 * @author THARUVI
 */
public class QueueManagerFileController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    
    /* fetch button  */
    
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
    
    /* fetch button  */
    
    @FXML 
     Button btnUp, btnDown, btnAdd, btnClear;
     Button btnNext, btnPrev, btnPause;
    
     @FXML
     private ListView<String> ListView;
     
     
     
     
     
     
     @FXML
     private Label mylabel;
     
     @FXML
     private TextField source;
     
     @FXML
     private TextField target;
     
     
      @FXML
     private TextField source2;
     
     @FXML
     private TextField target2;
  
     @FXML        
     String[] songs = {"I Don't Care\t\tEd Sheeran\t\t\t2.00\t\t\t\t1","Demons\t\t\tImagine Dragons\t\t1.80\t\t\t\t2",
                       "Waves\t\t\tDean Lewis\t\t\t1.98\t\t\t\t3","Intentions\t\tJustin Bieber\t\t\t1.28\t\t\t\t4",
                       "Impossible\t\tJames Arthur\t\t\t1.88\t\t\t\t5","little things\t\tOne Direction\t\t\t2.01\t\t\t\t6",
                        "Grenade\t\t\tBruno Mars\t\t\t2.01\t\t\t\t7","Human\t\t\tChristina Perri\t\t\t1.05\t\t\t\t8",
                        "Let Her Go\t\tPassenger\t\t\t1.45\t\t\t\t9"};
     @FXML
     String currentsong;    
     /* play song 
     
     String path = "C:\\Users\\THARUVI\\Desktop\\songs\\sound.mp3";
     
     Media media = new Media(new File(path).toURI().toString());
     
     MediaPlayer MediaPlayer = new MediaPlayer(media);
     
 */
     @FXML
     JPanel panel = new JPanel();
    
     
     @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        
        
             
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
    
    
    
   
    
    /*
    @FXML
    public void playsound(ActionEvent event){
        
    MediaPlayer.play();
        
    }

    */
 
    
    
    @FXML
    public void init(){
       
        }

    
    @FXML
    private void handleDragDetection(MouseEvent event){
        
        Dragboard db = source.startDragAndDrop(TransferMode.ANY);
        
        ClipboardContent cb = new  ClipboardContent();
        cb.putString(source.getText());
        
        db.setContent(cb);
        
        event.consume();
       
        
        
    }
    
    @FXML
    private void HandleTextDragover(DragEvent event){
        
        if (event.getDragboard().hasString()){
            
            event.acceptTransferModes(TransferMode.ANY);
        }
        
    }
    
    @FXML
    private void HandleTextdrop(DragEvent event){
        String str = event.getDragboard().getString();
        target.setText(str);
        
    }
    
    @FXML
    private void HandleDragdone(DragEvent event){
        
        source.setText("Demons                   Imagine Dragons              1.80                                 356");
        
    }
    
    
    /*  ------------------------- */
    
    @FXML
    private void handleDragDetection2(MouseEvent event){
        
        Dragboard db = source2.startDragAndDrop(TransferMode.ANY);
        
        ClipboardContent cb = new  ClipboardContent();
        cb.putString(source2.getText());
        
        db.setContent(cb);
        
        event.consume();
       
        
        
    }
    
    
       @FXML
    private void HandleTextDragover2(DragEvent event){
        
        if (event.getDragboard().hasString()){
            
            event.acceptTransferModes(TransferMode.ANY);
        }
        
    }
    
    @FXML
    private void HandleTextdrop2(DragEvent event){
        String str = event.getDragboard().getString();
        target2.setText(str);
        
    }
    
    @FXML
    private void HandleDragdone2(DragEvent event){
        
        source2.setText("Perfect                   Ed Sheeran              2.001                                 277");
        
    }
    
    
    }

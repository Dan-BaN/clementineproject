/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.QueuesFilesManager;


import java.net.URL;

import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;

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
    
    @FXML 
     Button btnUp, btnDown, btnAdd, btnClear;
     Button btnNext, btnPrev, btnPause;
    
     @FXML
     private ListView<String> ListView;
     
     
     
     
     
     
     @FXML
     private Label mylabel;
     
  
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
        // TODO
        
       // ListView.getItems().addAll(songs);
        
        //ListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
          //  @Override
          //  public void changed(ObservableValue<? extends String> ov, String t, String t1) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            //currentsong = ListView.getSelectionModel().getSelectedItem();
            //mylabel.setText(currentsong);
        
            
            
            //}
                       
        //});
        
        
        
        
             
    }
   
 
   
    
    /*
    @FXML
    public void playsound(ActionEvent event){
        
    MediaPlayer.play();
        
    }

    */
 
    
    @FXML
    public void init(){
        
                ListView.setOnDragOver(new EventHandler<DragEvent>() {
        
                    @Override
                    public void handle(DragEvent event) {
                       
        
                        if (event.getGestureSource() != ListView) {
                            event.acceptTransferModes(TransferMode.ANY);
                        }
                        event.consume();
                    }
                });     
    ListView.setOnDragDropped(new EventHandler<DragEvent>() {
        
                    @Override
                    public void handle(DragEvent event) {
                        Dragboard db = event.getDragboard();
                        boolean succ = false;
                       
        
                        event.setDropCompleted(succ);
                        event.consume();
                    }
                });
        }

    }

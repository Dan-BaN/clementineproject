/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine;

import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.lang.System.Logger;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * 
 * 
 */



public class EntranceUIController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    
    //Buttons
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
    
    @FXML
    private Pane contentArea;
    
    
    //top navigation drawer menuitems
    @FXML
    private MenuItem openFIle;

    @FXML
    private MenuItem openAudio;

    @FXML
    private MenuItem addPodcast;

    @FXML
    private MenuItem previousTrack;

    @FXML
    private MenuItem play;

    @FXML
    private MenuItem stop;

    @FXML
    private MenuItem nextTrack;

    @FXML
    private MenuItem mute;

    @FXML
    private MenuItem love;

    @FXML
    private MenuItem quit;

    @FXML
    private MenuItem addFile;

    @FXML
    private MenuItem addFolder;

    @FXML
    private MenuItem addStream;

    @FXML
    private MenuItem shuffleMode;

    @FXML
    private MenuItem repeatMode;

    @FXML
    private MenuItem newPlaylist;

    @FXML
    private MenuItem savePlaylist;

    @FXML
    private MenuItem loadPlaylist;

    @FXML
    private MenuItem jumpCurrentPlayingTrack;

    @FXML
    private MenuItem clearPlaylist;

    @FXML
    private MenuItem shufflePlaylist;

    @FXML
    private MenuItem removeDuplicates;

    @FXML
    private MenuItem removeUnavailable;

    @FXML
    private MenuItem coverManager;

    @FXML
    private MenuItem queueManager;

    @FXML
    private MenuItem transcodeMusic;

    @FXML
    private MenuItem ripAudioCD;

    @FXML
    private MenuItem updateChangedLib;

    @FXML
    private MenuItem fullLibraryRescan;

    @FXML
    private MenuItem preferences;

    @FXML
    private MenuItem checkUpdates;

    @FXML
    private MenuItem rain;

    @FXML
    private MenuItem hypnotoad;

    @FXML
    private MenuItem makeItSo;

    @FXML
    private MenuItem kittens;

    @FXML
    private MenuItem aboutClementine;

    @FXML
    private MenuItem aboutQT;
    
    @FXML
    private MenuItem visualizations;
    
    
    //init function
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }
    
    //sidePanel functions to change middle anchor pane
    
    @FXML
    void artistInfo(ActionEvent event)  throws IOException{
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/artistInfo/artistInfoPage.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
            
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        
    }

    @FXML
    void devices(ActionEvent event) throws IOException {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/devices/devicesPage.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @FXML
    void files(ActionEvent event)  throws IOException{
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/files/filesPage.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @FXML
    void internet(ActionEvent event) throws IOException {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/internet/internetPage.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @FXML
    void library(ActionEvent event) throws IOException{
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/library/libraryPage.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @FXML
    void playlist(ActionEvent event) throws IOException {
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/playlist/playlistPage.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @FXML
    void search(ActionEvent event)  throws IOException{
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/search/searchPage.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }

    @FXML
    void songInfo(ActionEvent event)  throws IOException{
        try{
            Parent fxml = FXMLLoader.load(getClass().getResource("/clementine/songInfo/songInfoPage.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

    }
    
  

    //menu item functions to open new window to show UI
     @FXML
    void openAboutClementine(ActionEvent event) {

    }

    @FXML
    void openCoverManager(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clementine/files/filesPage.fxml"));
            Parent root5 = (Parent) fxmlLoader.load();
            Stage deviceStage = new Stage();
            deviceStage.setTitle("Equlaizer");
            deviceStage.setScene(new Scene(root5));
            deviceStage.show();
        }
        catch (Exception e){
            System.out.println("Cant load new window");
        }
    }

    @FXML
    void openEqualizer(ActionEvent event) {

    }

    @FXML
    void openPreferences(ActionEvent event) {

    }

    @FXML
    void openQueueManager(ActionEvent event) {

    }

    @FXML
    void openRipAudioCD(ActionEvent event) {

    }

    @FXML
    void openTranscode(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clementine/transcodeMusic/transcodeMusic.fxml"));
            Parent root5 = (Parent) fxmlLoader.load();
            Stage deviceStage = new Stage();
            deviceStage.setTitle("Transcode Music");
            deviceStage.setScene(new Scene(root5));
            deviceStage.show();
        }
        catch (Exception e){
            System.out.println("Cant load new window");
        }

    }

    @FXML
    void openVisualizations(ActionEvent event) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/clementine/visualizations/transcodeMusic.fxml"));
            Parent root5 = (Parent) fxmlLoader.load();
            Stage deviceStage = new Stage();
            deviceStage.setTitle("Transcode Music");
            deviceStage.setScene(new Scene(root5));
            deviceStage.show();
        }
        catch (Exception e){
            System.out.println("Cant load new window");
        }
        
    }

    @FXML
    void openaboutQT(ActionEvent event) {

    }
}

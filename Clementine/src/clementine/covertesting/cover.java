/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine.covertesting;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author THARUVI
 */
public class cover extends Application  {
    
     public static void main(String[] args) {
        
        launch(args);

        // TODO code application logic here
    }
     
        @Override
    public void start(Stage stage) throws Exception {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/clementine/testcover/EntranceUI.fxml"));
            Scene scene = new Scene(root,1280,720);
            
            scene.getStylesheets().add(getClass().getResource("/clementine/testcover/EntranceUICSS.css").toExternalForm());
            Image icon = new Image("/images/Clementine-Logo.png");
            
            stage.getIcons().add(icon);
            stage.setTitle("Clementine");

            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
        
//To change body of generated methods, choose Tools | Templates.


    }
    
}

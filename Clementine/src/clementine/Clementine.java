/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clementine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
//import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
//import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author ASUS
 */

public class Clementine extends Application {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);

        // TODO code application logic here
    }

    @Override
    public void start(Stage stage) throws Exception {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/clementine/EntranceUI.fxml"));
            Scene scene = new Scene(root,1280,720);
            
            scene.getStylesheets().add(getClass().getResource("/clementine/EntranceUICSS.css").toExternalForm());
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

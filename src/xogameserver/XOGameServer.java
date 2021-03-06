/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameserver;

import java.io.IOException;
import java.util.Vector;
import java.net.Inet4Address;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import serialize.models.Player;

/**
 *
 * @author ahmed
 */
public class XOGameServer extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = new ServerGUI();
        
        Scene scene = new Scene(root);
        stage.setTitle(Inet4Address.getLocalHost().getHostAddress());
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(event->{
            CustomPopup.display((short)1);
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

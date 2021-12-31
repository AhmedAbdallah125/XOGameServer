/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogameserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raiaan
 */
public class GameServer {
      public static ServerSocket serverSocket ;

    public GameServer() {
        try {
            serverSocket = new ServerSocket(5005);
            while(true){
                Socket s = serverSocket.accept();
                new Client(s);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void close(){
            try {
                Client.clientsVector
                        .entrySet()
                        .stream()
                        .forEach(item->item.getValue().closeConnection());
                serverSocket.close();
            } catch (IOException ex) {
                Logger.getLogger(GameServer.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}

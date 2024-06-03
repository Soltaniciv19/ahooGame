package student.examples;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServerApp {
    private static Player playerOne;
    private static Player playerTwo;

    public static void main(String[] args) throws Exception {
        int port = 10001;

        ServerSocket serverSocket = new ServerSocket(port);

        Map<String, Object> playerSocketMap = new HashMap<>();

        playerSocketMap.put("socket", new Socket("localhost",port));
        playerSocketMap.put("player", new Player("Jimmy",0));

        System.out.println(playerSocketMap.size());
        System.out.println(playerSocketMap.get("socket"));
        System.out.println(playerSocketMap.get("player"));


    }
}

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
        List<Player> players = new ArrayList<>();
        players.add(new Player("Jimmy",100));
        players.add(new Player("Jimmy1",1000));
        players.add(new Player("Jimmy2",10000));

        players.forEach(ServerApp::printInBrackets);
    }

    public static void printInBrackets(Player player){
        System.out.println("["+player+"]");
    }
}

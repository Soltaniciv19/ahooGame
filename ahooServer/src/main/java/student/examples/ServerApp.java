package student.examples;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    private static Player playerOne;
    private static Player playerTwo;

    public static void main(String[] args) throws Exception {
        int port = 10001;

        System.out.println("Server started!");
        ServerSocket serverSocket = new ServerSocket(port);

        Socket clientSocket1 = serverSocket.accept();
        System.out.println("Client connected!");

        ObjectInputStream ois1 = new ObjectInputStream(clientSocket1.getInputStream());
        Frame frame1 = (Frame) ois1.readObject();

        if (frame1.getHeader().equals("connect")) {
            playerOne = (Player) frame1.getBody();
            System.out.println("Player connected: " + playerOne.getNickname());
        }

        Socket clientSocket2 = serverSocket.accept();
        System.out.println("Client connected!");

        ObjectInputStream ois2 = new ObjectInputStream(clientSocket2.getInputStream());
        Frame frame2 = (Frame) ois2.readObject();

        if (frame2.getHeader().equals("connect")) {
            playerTwo = (Player) frame2.getBody();
            System.out.println("Player connected: " + playerTwo.getNickname());
        }
    }
}

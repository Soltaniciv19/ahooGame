package student.examples;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int port = 10001;

        try {


            System.out.println("Client started...");
            Socket socket = new Socket("localhost",port);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            System.out.println("GAME STARTED! \n Enter your nickname: ");
            String nickname = scanner.next();
            Player player = new Player(nickname, 0);



            Frame frame = new Frame("connect",player);

            oos.writeObject(frame);
            oos.close();
            socket.close();



        } catch (Exception e){

        }
    }
}

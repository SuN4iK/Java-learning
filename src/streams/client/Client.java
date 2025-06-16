package streams.client;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.ParseException;
import java.util.Scanner;

class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Socket socket = new Socket("127.0.0.1", 9123);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            Thread thread = new Thread(()->{
                try {
                    while (true) {
                        String response = in.readUTF();
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);

                }
            });
            JSONObject jsonClientMessage = new JSONObject();
            thread.start();
            while (true) {
                String str = scanner.nextLine();
                if (str.equals("/getOnlineUsers")) {
                    jsonClientMessage.put("command", "getOnlineUsers");
                }
                out.writeUTF(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
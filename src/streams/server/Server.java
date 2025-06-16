package streams.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import org.json.simple.*;

/*
*ServerJSon = {
*   "command" : "Команда",
*   "error": "Сообщение об ошибке",
*   "msg": "Сообщение"
* */
public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        ArrayList<Socket> sockets = new ArrayList<>();
        try {
            serverSocket = new ServerSocket(9123); //Открываем порт
            System.out.println("Сервер запущен");
            while (true){
                Socket socket = serverSocket.accept(); //Ждем подключеия
                System.out.println("Клиент подключился");
                User currentuser = new User(socket); //Создаем объект пользователя для вновь подключившегося
                Thread thread = new Thread(()->{ // Создаем поток для этого пользователя
                        String str = null;
                        JSONObject jsonMessage = new JSONObject();
                        try {
                            currentuser.getOutputStream().writeUTF();
                            String command = currentuser.getInputStream().readUTF();
                            boolean isAuth = false;
                            while (!isAuth) {
                                jsonMessage.put("msg", "Выбери команду рег или логин: \n /reg \n /login");
                            }
                            currentuser.reg();
                            currentuser.getOutputStream().writeUTF("Введите имя");
                            while (true) {
                                str = currentuser.getInputStream().readUTF();
                                System.out.println("Клиент: " + str);
                                for (Socket socket1 : sockets) {
                                    DataOutputStream out1 = new DataOutputStream(socket1.getOutputStream());
                                    out1.writeUTF(str.toUpperCase());
                                }
                            }
                        } catch (IOException e) {
                            System.out.println("Клиент отключился");
                        }
                });
                thread.start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

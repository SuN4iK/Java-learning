package streams.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class User {
    private Socket socket;
    private DataInputStream inputStream;
    private DataOutputStream outputStream;
    private String name;

    public User(Socket socket) throws Exception {
        this.socket = socket;
        this.outputStream = new DataOutputStream(this.socket.getOutputStream());
        this.inputStream = new DataInputStream(this.socket.getInputStream());
    }

    public DataOutputStream getOutputStream() {
        return outputStream;
    }



    public DataInputStream getInputStream() {
        return inputStream;
    }

    public boolean login() throws IOException {
        this.getOutputStream().writeUTF("Введите E-mail");
        String pass = this.getInputStream().readUTF();
        return false;
    }


    public void reg() {
    }
}

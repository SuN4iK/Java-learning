import java.io.*;

public class FileWorker {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            int i = 0;
            while ((i=fis.read()) != -1)
                System.out.print((char)i);
        }catch (IOException e){
            e.printStackTrace();
        }
        /*try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            String str = "Hello world";

            *//*for (int i = 0; i < str.length(); i++) {
                System.out.println((int) str.charAt(i));
                fos.write((int)str.charAt(i));
            }*//*
            byte[] buff = str.getBytes();
            fos.write(buff);
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}

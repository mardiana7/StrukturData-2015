import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.net.Socket;
import java.net.ServerSocket;

public class Server {
        
     ArrayList<DATA>IDENTITY = new ArrayList<DATA>();

    public Server() throws IOException {
        serverSocket = new ServerSocket(PORT);
    }
    
    public void dengar() throws IOException {
        while (true) {
            // Tunggu sampai ada koneksi dari client
            Socket koneksi = serverSocket.accept();   
            // Buat thread untuk tangani client
            ClientProcess clientProcess = new ClientProcess(koneksi,IDENTITY);
            Thread clientProcessThread = new Thread(clientProcess);
            clientProcessThread.start();                
        }
    }
    
    // Socket server
    private ServerSocket serverSocket = null;
    // Port untuk aplikasi ini
    private static final int PORT = 33333;
}

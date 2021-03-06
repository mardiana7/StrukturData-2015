import java.net.Socket;
import java.net.ServerSocket;
import java.net.BindException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

public class server {
    public server()throws BindException, IOException {
        serverSocket = new ServerSocket(33333);
    }
    
    public void Listen() throws IOException {
        System.out.println("Menunggu koneksi...");
        while (true) {
            Socket koneksi = null;
            try {
                koneksi = serverSocket.accept();
                SendingClient(koneksi);
                koneksi.close();
            }
            catch(IOException err) {
                System.out.println(err);
            }
            catch(InterruptedException err) {
                System.out.println(err);
            }
        }
    }
    
    private void SendingClient(Socket koneksi) throws InterruptedException, IOException {
        
        // Mengambil dan Menampilkan Pesan
        InputStream masukan = koneksi.getInputStream();
        BufferedReader masukanReader = new BufferedReader(new InputStreamReader(masukan)); 
        String line = masukanReader.readLine();
        String ip = koneksi.getInetAddress().getHostAddress();
        System.out.println("Dari : " + ip);
        System.out.println("Pesan : "+line);
        
        // Membaca pesan dari keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Jawaban: ");
        line = keyboard.nextLine();
        
        // Mengirim ke client
        OutputStream keluaran = koneksi.getOutputStream();
        BufferedWriter keluaranBuf = new BufferedWriter(new OutputStreamWriter(keluaran)); 
        keluaranBuf.write(line);
        keluaranBuf.newLine();
        keluaranBuf.flush();
        
        line = masukanReader.readLine();
        System.out.println("Pesan dari Client: "+line);
    }

    private ServerSocket serverSocket = null;
}

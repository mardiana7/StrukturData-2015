import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class Merge{
   public static void main(String[] args)  {
        try {
            Merge ko = new Merge();
            ko.merge("file1.txt","file2.txt","file3.txt","hasil.txt");
        }
        catch (IOException kesalahan) {
            System.out.printf("Terjadi kesalahan: %s", kesalahan);
        }
    }
    public void merge(String file1, String file2, String file3, String sasaran) throws IOException {
        FileInputStream File1 = null;
        FileInputStream File2 = null;
        FileInputStream File3 = null;
        FileOutputStream keluaran= null;
        // Deklarasi variabel
        try {           // Object stream untuk masukkan
            File1 = new FileInputStream(file1);
            File2 = new FileInputStream(file2);
            File3 = new FileInputStream(file3);
            keluaran = new FileOutputStream(sasaran);// ambil objek abestu bukak nama berkasnya kalaok ga ada dia throw excepytion 

            // Coba baca  dari stream
            int karakter = File1.read();
            // Selama masih adaata yangih bisa dibaca
            while (karakter != -1) {// kalau minus 1 dia selesai
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = File1.read();
            }
            karakter = File2.read();
             while (karakter != -1) {// kalau minus 1 dia selesai
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = File2.read();
            }
            karakter = File3.read();
             while (karakter != -1) {// kalau minus 1 dia selesai
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = File3.read();
            }
            keluaran.flush();
        } 
        finally {
            // Tutup stream masukan
            if (file1 != null)           
            File1.close();
            if (file2 != null)           
            File2.close();
            if (file3 != null)           
            File3.close();
            if (keluaran != null)
                keluaran.close();

        }
    }
}

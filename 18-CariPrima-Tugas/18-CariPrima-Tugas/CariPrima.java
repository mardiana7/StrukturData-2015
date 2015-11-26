import java.io.FileWriter;
import java.io.IOException;

public class CariPrima {   
        private final static String NAMA_BERKAS = "prima.log";
        private final static int JUMLAH_THREAD = 10;
        private final static int ANGKA_TERBESAR = 100000;
    public static void main() throws IOException {
  
        // Buat berkas untuk menulis hasil. Pakai WRITER karena yang ditulis 
        // berkas text.
        FileWriter berkas = new FileWriter(NAMA_BERKAS);
        
        // Buat array dari thread
        BenarPrima[] benarPrima = new BenarPrima[JUMLAH_THREAD];
        // Mulai hitung dari angka 2, karena 1 otomatis bukan prima
        int angka = 2;
        // Loop sampai batas atas yang diminta
        while (angka<=ANGKA_TERBESAR) {
            angka++;
          benarPrima[angka] = new BenarPrima(angka);
        //  benarPrima[angka] = new BenarPrima(benarPrima[angka]);
         
            ///////////////////////////////////////////////////////////////////
            // MASUKKAN KODE ANDA DI BAWAH INI
            
            // ALGORITMA-nya:
            //   Untuk setiap elemen dari benarPrima (=thread yang kita buat)
            //       Jika elemen-nya belum dibuat
            //           Buatkan thread-nya
            //           Simpan thread tersebut di benarPrima
            //       Jika sudah selesai dihitung
            //           Jika benar bilangan prima
            //               Tulis ke berkas. Note: berkas perlu Synchronized
            //               Buang thread yang sudah selesai berhitung
            //               Buat thread baru dengan angka yang baru
            //               Simpan thread tersebut di benarPrima
            //           Jika bukan bilangan prima
            //               abaikan
          
            // MASUKKAN KODE ANDA DI ATAS INI
            ///////////////////////////////////////////////////////////////////            
        }
        
         for (; angka < ANGKA_TERBESAR; ++angka)
            benarPrima[angka].run();
        // Tunggu sampai semua thread selesai
        for (int counterThread=0; counterThread<JUMLAH_THREAD; ++counterThread)
            while (benarPrima[counterThread].selesai() == false) { }        
        
        // Tutup berkas untuk menulis hasil
        berkas.close();
    }

}
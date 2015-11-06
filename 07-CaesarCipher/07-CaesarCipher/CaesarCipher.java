
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CaesarCipher
{

    private int shift=3; 
    
    public void CaesarCipher(int shift) throws IOException
    {
         this.shift=shift;
    }

    
    public void enkripsi (String sumber, String sasaran)
    { 
      
        FileInputStream masukan = null;
        FileOutputStream keluaran = null;
        
        try {
            masukan = new FileInputStream(sumber);
            keluaran = new FileOutputStream(sasaran);
          
            int karakter = masukan.read();
            
            
            while (Karakter != -1) {
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
               karakter=shift;
               keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = masukan.read();
            }
           keluaran.flush();    
        }
        finally{
             if (masukan != null)
                masukan.close();
                
            if (keluaran != null)
                keluaran.close();
          
        } 
    }
    
        public void deskripsi (String sumber, String sasaran) throws IOException
        { 
      
        FileInputStream masukan = null;
        FileOutputStream keluaran = null;
        
        try {
            masukan = new FileInputStream(sumber);
            keluaran = new FileOutputStream(sasaran);
          
            int karakter = masukan.read();
            
            
            while (Karakter != -1) {
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
               karakter=shift;
               keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = masukan.read();
            }
           keluaran.flush();    
        }
        finally{
             if (masukan != null)
                masukan.close();
            if (keluaran != null)
                keluaran.close();
          
        } 
    }
     
    public static void main (String[] args) {
         try {
         KopiBerkas ko = new KopiBerkas();
         ko.kopi("asal.txt", "tujuan.txt");
        }
        catch (IOException kesalahan) {
            System.out.println("Terjadi Kesalahan");
        }
    }
    }

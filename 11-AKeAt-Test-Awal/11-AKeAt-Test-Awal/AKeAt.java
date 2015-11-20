
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

 
public class AKeAt
{
    
      
    public void aKeAt(String sumber, String sasaran) throws IOException {
        FileInputStream masukan = null;
        FileOutputStream keluaran = null;
        try {
 
            masukan = new FileInputStream(sumber);
            keluaran = new FileOutputStream(sasaran);
            
 
            int karakter = masukan.read();
 
            while (karakter != -1) {
              // keluaran.write(karakter);
                 
               if(karakter == 'a' || karakter =='A'){
                keluaran.write('@');
            }
            else {
                keluaran.write(karakter);
            }
                karakter = masukan.read();
            }
           keluaran.flush();    
          
    
        }
        
        finally {
            // Tutup stream keluaran
            if (masukan != null)
                masukan.close();
            if (keluaran != null)
                keluaran.close();
          
        }  
    }
    }
        
    
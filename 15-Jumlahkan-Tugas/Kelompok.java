
 
public class Kelompok implements Runnable
{
    
    private int awal;
    private int akhir;
    private double data[];
    private double nilaiHasil;
    /**
     * Constructor for objects of class Kelompok
     */
    public Kelompok(int awal, int akhir, double data[])
    {
         this.awal = awal;
         this.akhir = akhir;
         this.data = data;
    }

     
    public double hasil()
    {
        return nilaiHasil;
    }
    
    public void hitung (){
     int i;
        for(i=awal;i<=akhir;i++) {
            nilaiHasil = nilaiHasil + data[i];
        }
    }
     
    
    public void run() {
        hitung();
        hasil();
    }
}


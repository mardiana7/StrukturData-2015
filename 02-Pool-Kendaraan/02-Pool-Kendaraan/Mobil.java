public class Mobil implements Kendaraan
{
 
    private String plat;
 
    public Mobil(String plat)
    {
        this.plat=plat;
    }
 
    public String plat()
    {
        return plat;
    }
    
    public String tipe() 
    {
        String plat = new String ();
        plat = "Mobil";
        return plat;
    }
}


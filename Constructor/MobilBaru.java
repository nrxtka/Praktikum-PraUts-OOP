package Constructor;

public class MobilBaru {
    // Atribut [cite: 117]
    private String warna; 
    private String merk; 
    // Constructor [cite: 120]
    public MobilBaru (String warna, String merk) { 
        this.warna = warna; 
        this.merk = merk; 
    }

    // Metode [cite: 125]
    public void tampilkanInfo() { 
        System.out.println("Warna: " + warna); 
            System.out.println("Merk: " + merk);     }
}
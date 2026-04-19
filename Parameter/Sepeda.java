package Parameter;

public class Sepeda {
    // Atribut [cite: 82]
    private String merk; 
    private int kecepatan; 

    // Constructor [cite: 85]
    public Sepeda (String merk, int kecepatan) { 
        this.merk = merk; 
        this.kecepatan = kecepatan; 
        }

    // Metode [cite: 90]
    public void ubahKecepatan(int kecepatanBaru) { 
        this.kecepatan = kecepatanBaru; 
    }

    public void tampilkanInfo() { 
        System.out.println("Merk: " + merk); 
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
} 
public class PerulanganFor {
    public static void main(String[] args) {
        
        String[] namaGuru = {"Guru A", "Guru B", "Guru C", "Guru D"};

        int[] gajiPerJam = {20, 25, 30, 35};

        int[] jamKerja = {160, 150, 140, 170};

        for (int i = 0; i < namaGuru.length; i++) {
            int gajiTotal = gajiPerJam[i] * jamKerja[i];
            System.out.println("Gaji " + namaGuru[i] + ": " + gajiTotal + " ribu");
        }
    
    }
    }
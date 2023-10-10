public class LoopFor {
    public static void main(String[] args) {
        // Array berisi nama-nama guru
        String[] namaGuru = {"Guru A", "Guru B", "Guru C"};

        // Array berisi jam kerja guru
        int[] jamKerja = {40, 30, 35};

        // Perulangan for untuk menghitung total jam kerja
        int totalJamKerja = 0;
        for (int i = 0; i < jamKerja.length; i++) {
            totalJamKerja += jamKerja[i];
        }

        System.out.println("Total jam kerja adalah: " + totalJamKerja + " jam");
    }
}
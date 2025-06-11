package latihan3;

public class rumus {
    //nama: Muhammad Rizqan
    //npm: 2310010197
    //kelas: 4D
    // Method untuk menghitung luas persegi
    public static int hitungLuas(int sisi) {
        return sisi * sisi;
    }
    public static int hitungKeliling(int sisi) {
        return 4 * sisi;
    }

    public static void main(String[] args) {
        int sisi = 5;

        int luas = hitungLuas(sisi);
        int keliling = hitungKeliling(sisi);

        System.out.println("Sisi: " + sisi);
        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
    }
}

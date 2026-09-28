import java.util.Scanner;

// Nama class harus sama dengan nama File
public class Soal1 {
    public static void main(String[] args) {
        // Deklarasi konstanta PI dan scanner
        final double PHI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        // Input jari-jari dari pengguna
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        // Proses perhitungan luas
        double luas = PHI * jariJari * jariJari;

        // Output hasil perhitungan
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah: " + luas);

        scanner.close();
    }
}

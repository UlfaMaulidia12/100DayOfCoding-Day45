package ProgramDay;

import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama pengguna
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.next();
        System.out.println("Halo, " + nama + "!");

        // Input nilai x
        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();

        // Menampilkan nilai x
        System.out.println("Nilai x = " + x);

        // Menampilkan apakah nilai x genap atau ganjil
        if (x % 2 == 0) {
            System.out.println("Nilai x adalah bilangan genap");
        } else {
            System.out.println("Nilai x adalah bilangan ganjil");
        }

        // Menghitung dan menampilkan faktorial dari nilai x
        int faktorial = hitungFaktorial(x);
        System.out.println("Faktorial dari " + x + " adalah: " + faktorial);
    }

    private static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}

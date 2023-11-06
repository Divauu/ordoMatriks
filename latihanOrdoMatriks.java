package BuAul;

import java.util.Scanner;

public class latihanOrdoMatriks {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int matriks[][] = new int[baris][kolom];

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print("Masukkan Nilai Baris : "+i + " Kolom "+j + ": ");
                matriks[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriks: ");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j]+", ");
            }
            System.out.println();
        }
    }
}

package Tugas2;
import java.util.Scanner;
public class nomer4 {
    public static void main(String[] args) {
    int i, j, x, y;
    int matriks[][] = new int[10][10];
    int transpose[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Masukkan jumlah baris matriks : ");
    x = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks : ");
    y = scan.nextInt();
    System.out.println("Masukkan elemen matriks : ");
    for(i = 0; i < x; i++) {
        for(j = 0; j < y; j++) {
            matriks[i][j] = scan.nextInt();
        }
    }
    System.out.println("Hasil matriks : ");
    for(i = 0; i < x; i++) {
        for(j = 0; j < y; j++) {
            System.out.print(matriks[i][j] + "\t");
        }
        System.out.println();
    }
    for(i = 0; i < x; i++) {
        for(j = 0; j < y; j++) {
            transpose[j][i] = matriks[i][j];
        }
    }
    System.out.println("Hasil transpose matriks : ");
    for(i = 0; i < y; i++) {
        for(j = 0; j < x; j++) {
            System.out.print(transpose[i][j] + "\t");
        }
        System.out.println();
    }
    System.out.println();
    System.out.println("Galih Pamuji");
    }
}
package Perulangan;

import java.util.Scanner;

public class tugasDeretAritmatikaWhile {
  public static void main(String[] args) {
    int nilaiAwal, nilaiAkhir, beda;

    Scanner s = new Scanner(System.in);
    System.out.print("Masukkan Nilai Awal: ");
    nilaiAwal = s.nextInt();
    System.out.print("Masukkan Nilai Akhir: ");
    nilaiAkhir = s.nextInt();
    System.out.print("Masukkan Beda: ");
    beda = s.nextInt();

     
    int i = nilaiAwal;
    while (i <=nilaiAkhir){
      System.out.print(i+ ", ");
        i+=beda;   
    }
      
    }
  }
  


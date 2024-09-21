package Perulangan;

import java.util.Scanner;

public class tugasDeretAritmatikaFor {
  public static void main(String[] args) {
    int batasAwal, batasAkhir, beda;

    Scanner s = new Scanner(System.in);
    System.out.print("Masukkan Nilai Awal: ");
    batasAwal= s.nextInt();
    System.out.print("Masukkan Nilai Akhir: ");
    batasAkhir = s.nextInt();
    System.out.print("Masukkan Beda: ");
    beda = s.nextInt();

    for (int i = batasAwal; i <= batasAkhir; i+=beda) {
      
        System.out.print(i+ ", ");
        
      
      

      
    }
    
  }
  
}


package recursiveasalsayihesaplamaprogrami;

import java.util.*;
public class RecursiveAsalSayiHesaplamaProgrami {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = input.nextInt();
        
        if(asalSayi(sayi) == true){
            System.out.println("Asal sayı değildir.");
        }
        else {
            System.out.println("Asal sayıdır.");
        }
    }
    
    static boolean asalSayi(int sayi){
        boolean sonuc = false;
        
        for(int i=2; i<sayi; i++){
            if(sayi % i == 0){
                sonuc = true;
            }
        }
        return sonuc;
    }
    
}

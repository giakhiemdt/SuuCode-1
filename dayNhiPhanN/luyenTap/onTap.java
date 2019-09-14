import java.util.*;

public class onTap {
    public static void main (String[] agrs) {
        int soThapPhan ;
        int[] mang = new int[8];
        for ( int soDem = 0 ; soDem < 256 ; soDem++ ) {
            soThapPhan = soDem;
            for ( int n = 7 ; soThapPhan != 0 ; n-- ) {
                mang[n] = soThapPhan % 2 ;
                soThapPhan = soThapPhan / 2;   
            }
            inRa(mang);
            System.out.println();
        }
    }
    public static void inRa(int[] mang) {
        for ( int x = 0 ; x < 8 ; x++ ) {
            System.out.print(mang[x]);
        }
    }
}
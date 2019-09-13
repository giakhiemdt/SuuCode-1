import java.util.*;

public class onTap {
    public static void main (String[] agrs) {
        int a = 5;
        int[] mang = new int[8];
        for ( int b = 1 ; b < 256 ; b++ ) {
            a = b;
            for ( int n = 7 ; a != 0 ; ) {
                if ( b == 1 )  {
                    System.out.println("00000000");
                    mang[n] = 1;
                    break;
                }else {
                    mang[n] = a % 2 ;
                    n-- ;
                    a = a / 2;
                }   
            }
            for ( int c = 0 ; c < 8 ; c++ ) {
                System.out.print(mang[c]);
            }
            System.out.println();
        }
    }
}
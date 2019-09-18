import java.io.*;

public class onTap {
    public static void main (String[] agrs) throws IOException {
        int soThapPhan ;
        FileWriter fw = new FileWriter("nhiPhan.txt");
        int[] mang = new int[8];
        for ( int soDem = 0 ; soDem < 256 ; soDem++ ) {
            soThapPhan = soDem;
            for ( int n = 7 ; soThapPhan != 0 ; n-- ) {
                mang[n] = soThapPhan % 2 ;
                soThapPhan = soThapPhan / 2;   
            }
            inRa(mang, fw);
        }
        fw.close(); 
    }
    public static void inRa(int[] mang, FileWriter fw) throws IOException {
        String a = "" ;
        for ( int x = 0 ; x < 8 ; x++ ) {
            a += mang[x] ;
        }
        fw.write(a + "\n");
    }
}
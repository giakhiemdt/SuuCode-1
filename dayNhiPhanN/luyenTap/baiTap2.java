// Code by SuuNhuy
import java.io.*;

public class baiTap2 {
    public static void main(String[] args) throws IOException {
        
        FileWriter fe = new FileWriter("dayChinhHop.txt");
        int[] mang = new int[6] ;
        boolean lietKeXong = false;
        for (;!lietKeXong;) {
            for ( int soDem1 = 0 ; soDem1 <= 8 && !lietKeXong ; soDem1++ ) {
                lietKeXong = true;
                for ( int viTri = 0 ; viTri < 5 ; viTri++ ) {
                    if ( mang[viTri] != 7 || mang[5] != 7) {
                        lietKeXong = false;
                    }
                    if ( mang[viTri] == 8 ) {
                        mang[viTri + 1] += 1;
                        mang[viTri] = 0;
                    }
                }
                mang[0] = soDem1 ;
                if ( mang[0] != 8) {
                    inRa(fe, mang);
                }
            }
        }
        fe.close(); 
    }
    public static void inRa(FileWriter fe, int[] mang) throws IOException {
        String a = "" ;
        for ( int soDem2 = 0 ; soDem2 < 6 ; soDem2++ ) {
            a += mang[soDem2] ;
        }
        fe.write(a + "\n");
    }
}
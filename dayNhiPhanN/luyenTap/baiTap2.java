// Code by SuuNhuy

public class baiTap2 {
    public static void main(String[] agrs) {
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
                    inRa(mang);
                }
            }
        }
    }
    public static void inRa(int[] mang) {
        for ( int soDem2 = 0 ; soDem2 < 6 ; soDem2++ ) {
            System.out.print(mang[soDem2] + ",   ");
        }
        System.out.println();
    }
}
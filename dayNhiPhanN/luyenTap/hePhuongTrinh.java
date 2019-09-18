import java.util.*;

public class hePhuongTrinh {
    public static void main(String[] args) {
        int[][] mang1 = new int[2][3];
        Scanner banPhim = new Scanner(Systen.in);
        for ( int a = 0 ; a < 2 ; a++ ) {
            for ( int b = 0 ; b < 3 ; b++ ) {
                mang[a][b] = banPhim.nextInt();
            }
        }
        System.out.println((mang[0][2] * mang[1][0] - mang[0][0] * mang[1][2]) / (mang[0][1] * mang[1][0] - mang[0][0] * mang[1][1]));        
    }
}
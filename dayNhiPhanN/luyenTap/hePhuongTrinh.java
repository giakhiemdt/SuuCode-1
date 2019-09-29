import java.util.*;

public class hePhuongTrinh {
    public static void main(String[] args) {
        Scanner banPhim = new Scanner(System.in);
        System.out.println("So luong an:");
        int soAn = banPhim.nextInt();
        float[][] hePTrinh = new float[soAn][soAn + 1];
        float[][] heSo = new float[10][10];
        float[][] the = new float[10][10];
        Boolean pt1An = false;
        System.out.println("-> Nhap vao:");
        for ( int soDong = 0 ; soDong < soAn ; soDong++ ) {
            for ( int soCot = 0 ; soCot<= soAn ; soCot++ ) {
                hePTrinh[soDong][soCot] = banPhim.nextInt();
            }
        }

        for ( int soSoAn = soAn ; soSoAn > 0 ; soSoAn-- ) {
            System.out.println("Kq :" + ( heSo[0][1] / heSo[0][0] ) );
            if ( soSoAn <= soAn && soSoAn != 1  ) {
                if ( soSoAn < soAn && soSoAn != 1 ) {
                    for ( int soDong = 0 ; soDong < soSoAn ; soDong++ ) {
                        for ( int soCot = 0 ; soCot <= soSoAn ; soCot++ ) {
                            if ( soCot == soSoAn ) {
                                hePTrinh[soDong][soCot] = hePTrinh[soDong][soCot + 1] - ( heSo[0][1] / heSo[0][0] ) ;
                                System.out.println("Bien doi :" + hePTrinh[soDong][soCot] );
                                hePTrinh[soDong][soCot + 1] = 0;
                            }
                            heSo[soDong][soCot] = 0;
                            System.out.print("\t" + hePTrinh[soDong][soCot] ) ;
                        }
                    }
                }
                for ( int soLanTieuGiam = 0 ; soLanTieuGiam < soSoAn - 1 && !pt1An ; soLanTieuGiam++ ) { // So an bi mat di
                    for ( int a = 0 ; a < 10 ; a++ ) {
                        for ( int b = 0 ; b < 10 ; b++ ) {
                            the[a][b] = heSo[a][b] ;
                        }
                    }
                    for ( int phanPhoi = 2 ; phanPhoi <= soSoAn ; phanPhoi++ ) { // Gom 2 pt de giam an di
                        
                        for ( int roiRac = 0 ; roiRac < soSoAn - soLanTieuGiam ; roiRac++ ) { // Tinh tung he so cua an
                               
                            if ( soLanTieuGiam == 0 ) {
                                heSo[phanPhoi - 2][roiRac] = ( hePTrinh[0][roiRac + 1] - ( hePTrinh[0][0] * hePTrinh[phanPhoi - 1][roiRac + 1] ) / hePTrinh[phanPhoi - 1][0] ) ; // Ct tinh 
                                System.out.println( "Phan Phoi - 2 :" + ( phanPhoi - 2 ) + "\n" + "Roi Rac :" + roiRac );
                                System.out.println("Lan 1:" + heSo[phanPhoi - 2][roiRac]);
                            }else {
                                heSo[phanPhoi - 2][roiRac] = ( the[0][roiRac + 1] - ( the[0][0] * the[phanPhoi - 1][roiRac + 1] ) / the[phanPhoi - 1][0] ) ;
                                System.out.println( "Phan Phoi - 2 :" + ( phanPhoi - 2 ) + "\n" + "Roi Rac :" + roiRac );
                                System.out.println( "Lan 2:" + heSo[phanPhoi - 2][roiRac] );
                                
                            } 
                        }
                    }
                }     
            }else if ( soSoAn == 1 ) {
                System.out.println("Kq :" + ( hePTrinh[0][1] / hePTrinh[0][0] ) );
            }    
        }
    }
}
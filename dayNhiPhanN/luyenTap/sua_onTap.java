// Code bởi giahuy2201

public class sua_onTap {
    public static void main(String[] agrs) {
        int[] mang = new int[8];
        for (int soThapPhan = 0; soThapPhan < 256; soThapPhan++) {
            // copy soThapPhan qua a để tính lại a mà không làm thay đổi vòng lặp for 
            int a = soThapPhan;
            // for để tính từng hàng của cấu hình hiện tại 
            for (int j = 7; j >= 0; j--) {
                mang[j] = a % 2; // lấy dư
                a = a / 2; // tính lại soThapPhan 
            }
            inMang(mang);

        // System.out.println("b: "+b);
        }
    }

    public static void inMang(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i]);
        }
        System.out.println();
    }
}

/*
 * Code sinh dãy n phân dựa trên chỉnh hợp lặp 
 */

import java.io.*;

public class chinhhopnk {
    public static void main(String[] args) throws Exception {

        int n = 8;
        int k = 6;

        // tạo trình ghi file
        FileWriter fw = new FileWriter("chinhhop.txt");

        // array chứa cấu hình 
        int[] day = new int[k];

        // khoi tao day 000...
        for (int i = 0; i < k; i++) {
            day[i] = 0; // gán gtri 0
        }

        // chạy từ cuối dãy
        int i = k - 1;
        while (i >= 0) {

            // ghi cấu hình hiện tại vào file
            luuDay(fw, day);

            // tao cau hinh moi
            i = k - 1; // chạy từ cuối chuỗi
            while (i >= 0 && day[i] == n - 1) { // nếu chưa lên đỉnh 
                i--; // lùi tiếp
            }
            if (i >= 0) { // nếu chưa hết chuỗi - hợp lệ
                day[i]++; // tang len
                for (int j = i + 1; j < k; j++) { // sửa hết các số sau nó thành 0
                    day[j] = 0;
                }
            }
        }

        fw.close(); // dong file
    }

    // ghi cau hinh vao file
    public static void luuDay(FileWriter fw, int[] day) throws Exception {
        for (int i = 0; i < day.length; i++) {
            fw.write(day[i]+"");
            if (i != day.length - 1) {
                fw.write(", ");
            }
        }
        fw.write("\n");
    }
}
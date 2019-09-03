
/*
 * Code sinh tập hợp con k phần tử từ tập n phần tử
 * VD: 0 1 2 3
 *     0 1 2 4
 *     0 1 2 5
 *     0 1 2 6
 *     0 1 2 7
 *     0 1 3 4
 *     0 1 3 5
 *     ...
 *     4 5 6 7
 */

import java.io.*;

public class taphopconk {
    public static void main(String[] args) throws Exception {

        int n = 8;
        int k = 4;

        // tạo trình ghi file
        FileWriter fw = new FileWriter("chinhhop.txt");

        // array chứa cấu hình
        int[] day = new int[k];

        // khoi tao day 000...
        for (int i = 0; i < k; i++) {
            day[i] = i; // gán gtri
        }

        // chạy từ cuối dãy
        int i = k - 1;
        while (i >= 0) {

            // ghi cấu hình hiện tại vào file
            luuDay(fw, day);

            // tao cau hinh moi
            i = k - 1; // chạy từ cuối chuỗi
            while (i >= 0 && day[i] == n - k + i) { // nếu chưa chạm đến giới hạn
                i--; // lùi tiếp
            }
            if (i >= 0) { // nếu chưa hết chuỗi - hợp lệ
                day[i]++; // tang len
                for (int j = i + 1; j < k; j++) { // sửa hết các số sau nó thành 0
                    day[j] = day[j - 1] + 1; // số trước bằng số sau + 1
                }
            }
        }

        fw.close(); // dong file
    }

    // ghi cau hinh vao file
    public static void luuDay(FileWriter fw, int[] day) throws Exception {
        fw.write("{");
        for (int i = 0; i < day.length; i++) {
            fw.write(day[i] + "");
            if (i != day.length - 1) {
                fw.write(", ");
            }
        }
        fw.write("}\n");
    }
}
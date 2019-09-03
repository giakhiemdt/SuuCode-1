/*
 * Code sinh dãy nhị phân 
 */

import java.io.*;

public class nhiphann {
    public static void main(String[] args) throws Exception {

        // độ dài chuỗi nhị phân
        int n = 8;

        // tạo trình ghi file 
        FileWriter fw = new FileWriter("day.txt");

        // array chứa chuỗi nhị phân 
        int[] day = new int[n];

        // khoi tao day 000...
        for(int i=0; i< n;i++){
            day[i] = 0; // gán gtri 0
        }

        // chạy từ cuối chuỗi 
        int i = n - 1;
        while(i >= 0){

            // ghi cấu hình hiện tại vào file 
            luuDay(fw,day);

            // tao cau hinh moi
            i = n - 1; // chạy từ cuối chuỗi 
            while(i >=0 && day[i] == 1){ // đến khi nào gặp số 0
                i--; // lùi tiếp 
            }
            if(i >= 0){ // nếu chưa hết chuỗi - hợp lệ 
                day[i] = 1; // tang len
                for(int j=i+1;j<n;j++){ // sua tat ca cac so dung sau no
                    day[j] = 0;
                }
            }
        }

        fw.close(); // dong file
    }

    // in cau hinh ra man hinh
    public static void inDay(int[] day){
        for(int i=0;i<day.length;i++){
            System.out.print(day[i] + " ");
        }
        System.out.println();
    }

    // ghi cau hinh vao file
    public static void luuDay(FileWriter fw,int[] day) throws Exception{
        for(int i=0;i<day.length;i++){
            fw.write(day[i]+"");
        }
        fw.write("\n");
    }
}

import java.io.*;

public class nhiphann {
    public static void main(String[] args) throws Exception {

        int n = 8;
        // de ghi vao file
        FileWriter fw = new FileWriter("day.txt");

        // day nhi phan
        int[] day = new int[n];

        // khoi tao day 000...
        for(int i=0; i< n;i++){
            day[i] = 0;
        }

        int i = n -1;
        while(i>=0){
            // in cau hinh hien tai
            luuDay(fw,day);

            // tao cau hinh moi
            i = n-1;
            while(i >=0 && day[i] == 1){ // chay den khi gap so 0
                i--;
            }
            if(i >=0){
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
            fw.write(day[i] + " ");
        }
        fw.write("\n");
    }
}
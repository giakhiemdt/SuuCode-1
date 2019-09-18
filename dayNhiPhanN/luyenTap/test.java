import java.io.*;

public class test {
    public static void main(String[] args ) throws Exception {
        FileOutputStream file = null;
        // String s = "Lap Trinh java \n HaHaHa! \n 12345";
        // byte[] a = s.getBytes();
        try {
            file = new FileOutputStream("output.txt");
            file.write(1000);
            System.out.print("Da ghi thanh cong!");

        }
        catch ( Exception e ) {
            System.out.print(e);
        }
        finally {
            file.close();
        }
    }
}
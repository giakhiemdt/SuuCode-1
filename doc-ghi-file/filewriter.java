import java.io.*;

public class filewriter {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("out.txt",true);

        fw.append("em oi em a");

        fw.close();
    }
}
import java.io.*;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) throws Exception{
        // khai bao file can mo
        File f1 = new File("input.txt");
        Scanner mofile = new Scanner(f1);

        mofile.useDelimiter("\\Z");
        String txt = mofile.next();
        System.out.println(txt);
        // txt = mofile.nextLine();

        
        mofile.close();
    }
}
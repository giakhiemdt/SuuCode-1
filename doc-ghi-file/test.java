import java.io.*;

public class test {
    public static void main(String[] args) throws IOException{

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("input.txt"); // khai bao ten file
            out = new FileWriter("output.txt");

            int c;
            while((c = in.read()) != -1) { // chua het file
                out.write(c);
                System.out.print(c + "-" + (char)c + " "); // in ra character code de thay ro
            }
        } finally {
            if( in != null){
                in.close();
            }
            if( out != null){
                out.close();
            }
        }
    }
}
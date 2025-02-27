package class_17;


import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new
                    BufferedReader(new FileReader("D:\\A.txt"));

            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("B.txt"));
            String s;
            while ((s = br.readLine())!=null) {
//                System.out.println("#" + s);
                bw.write("#"+s);
                bw.newLine();
            }

            br.close();
            bw.close();

        } catch (IOException e) {

        }

    }
}

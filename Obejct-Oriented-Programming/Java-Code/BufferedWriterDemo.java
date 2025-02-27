package class_17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {

            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("B.txt"));

            bw.write("Hello World");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

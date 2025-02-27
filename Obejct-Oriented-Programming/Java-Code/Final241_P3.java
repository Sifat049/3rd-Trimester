package class_17;

import java.io.*;

public class Final241_P3 {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("output.txt"));
            String s;
            int smallest = 9999999;
            while ((s = br.readLine())!=null){
                try{
                    int input = Integer.parseInt(s);
                    if(input < smallest) smallest = input;
                }catch (NumberFormatException e){
                }
            }
            bw.write(String.valueOf(smallest));
//            bw.write(""+smallest);


            br.close();
            bw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

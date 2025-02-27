import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args) {

        try {
            File f = new File("pract.txt");
            Scanner sc = new Scanner(f);


            String s1;
            int s2;
            double s3;

            s1=sc.nextLine();
            s2=sc.nextInt();
            s3=sc.nextDouble();

            celender cel=new celender(s1,s2,s3);
            System.out.println(cel.dayName+"\n"+cel.date+"\n"+cel.temparature);


            sc.close();
        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}

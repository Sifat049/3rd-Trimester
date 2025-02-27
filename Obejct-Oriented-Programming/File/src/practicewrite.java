import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;

public class practicewrite {
    public static void main(String[] args) {

        try {
            FileWriter f=new FileWriter("pract.txt");
            BufferedWriter bw= new BufferedWriter(f);

            celender cl=new celender("Friday",10,29.5);
            bw.write(cl.dayName+"\n"+cl.date+"\n"+cl.temparature);

            bw.close();
        } catch (IOException e) {
         //   throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
class celender{
    String dayName;
    int date;
    double temparature;


    public celender(String dayName, int date, double temparature) {
        this.dayName = dayName;
        this.date = date;
        this.temparature = temparature;
    }
}

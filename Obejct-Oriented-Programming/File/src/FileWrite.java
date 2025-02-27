import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("A.txt",true);//apend mode
            PrintWriter write = new PrintWriter(fw);

            //Normal Write
            write.println("OOP in Java");
            write.println(49);
            write.println(678327.37287F);
            write.println("ags" + " " + "bsg");
            for (int a = 1; a <= 10; a++) {
                write.println(a);
            }

            //Student class object create
            Student student1 = new Student("SIFAT", 112330669, 3.98);
            //
            write.println("NAME: " + student1.name + " ID: " + student1.id + " CGPA: " + student1.cgpa);

            //BUFFEREDWRITER
//            FileWriter demo = new FileWriter("B.txt");
            FileWriter demo = new FileWriter("B.txt",true);//append
            BufferedWriter write2 = new BufferedWriter(demo);
            write2.write("NAME: " + student1.name + " ID: " + student1.id + " CGPA: " + student1.cgpa);


            write2.newLine();
            write2.write(66);//print B ; ASCII VALUE print
            write2.newLine();

            //convert int to String
            write2.write(String.valueOf(66));
            write2.newLine();
            write2.write(66+ "");
            write2.newLine();

            //write close***MuST important
            write.close();
            write2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class Student {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }


}

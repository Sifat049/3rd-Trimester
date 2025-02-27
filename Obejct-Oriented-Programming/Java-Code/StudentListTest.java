package class_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentListTest {
    public static void main(String[] args) {
        ArrayList<Student> slist = new ArrayList<>();

        slist.add(new Student("1234","Rahim",3.8));
        slist.add(0, new Student("2456","Karim",3.4));
        slist.add(1, new Student("4678","Jabbar",3.5));

        slist.set(2, new Student("2144","Kalam",3.1));


        Collections.sort(slist, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               if(o1.cgpa < o2.cgpa) return  -1;
               else if(o1.cgpa > o2.cgpa) return  1;
               else return 0;
            }
        });

        for (Student s:slist){
            System.out.println(s);
        }

    }
}

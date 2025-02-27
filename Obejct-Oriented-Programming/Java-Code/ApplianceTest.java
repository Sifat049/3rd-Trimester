package class_16;

import java.util.ArrayList;
import java.util.Collections;

public class ApplianceTest {
    public static void main(String[] args) {
        ArrayList<Appliance> alist = new ArrayList<>();

        alist.add(new Appliance("Television", "Ent", 100));
        alist.add(new Appliance("WM", "Laundry", 2000));
        alist.add(new Appliance("Ref", "Kitchen", 150));


//
        for (Appliance a :alist){
            if(a.category.equals("Kitchen"))
                System.out.println(a.toString());
        }

        Collections.sort(alist);
        System.out.println(alist.get(0));//Highest PC
        System.out.println(alist.get(alist.size()-1));//lowest PC

        for (Appliance a :alist){
                System.out.println(a.toString());
        }

    }
}

package class_16;

import java.util.ArrayList;

public class class_16 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("UIU");
        list.add("OOP");
        list.add("section T");
        list.add(2,"Bangladesh");
        list.remove("OOP");

        for(String s :list){
            System.out.print(s +",");
        }

//        System.out.println(list.size());
    }
}

import java.util.*;

public class fall23 {
    public fall23(String s, String dhanmondi, String dhaka, int i) {
    }

    public static void main(String[] args) {

        //1
        ArrayList<fall23> fList= new ArrayList<>();
        //2
        fList.add(new fall23("19/A","Dhanmondi","Dhaka",1209));
        fList.add(new fall23("2/A","Tejgaon","Dhaka",1219));
        fList.add(new fall23("65","Nirala","khulna",1209));

        //3
        fList.add(1,new fall23("215","AAmtola","Barishal",820));

        //4
        fList.set(2,new fall23("215","AAmtola","Barishal",8200));

       // List<T> fall23;
        Collections.sort(fall23);

       // fList.sort(Comparator.comparing(fall23 -> fall23.toString()));
    }


}

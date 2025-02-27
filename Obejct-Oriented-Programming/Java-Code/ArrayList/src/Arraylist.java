import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Double> dList =new ArrayList<>();
        ArrayList<Double> dList2 =new ArrayList<>();
        ArrayList<Double> dList3=new ArrayList<>();


        System.out.println(dList);
        System.out.println("Size:"+dList.size());
        dList.add(245.43);
        dList.add(534.24);
        dList.add(453.64);
        dList.add(445.334);
        System.out.println("Element : "+dList);
        System.out.println("Size:"+dList.size());

        dList.remove(2);
        System.out.println("Element : "+dList);
        dList.set(1,288.3);
        System.out.println("Element : "+dList);
        System.out.println(dList.get(2));

        dList2.addAll(dList);
        System.out.println(dList2);
        System.out.println(dList2.addAll(dList3));
        System.out.println(dList3);
        System.out.println(dList.contains(dList2));
        System.out.println(dList2.equals(dList));





//        dList2.add(dList){
//
//        }

    }
}

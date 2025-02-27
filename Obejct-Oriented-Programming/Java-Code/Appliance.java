package class_16;

public class Appliance implements Comparable<Appliance>{
    String name, category;
    double powerConsumption;//watt

    Appliance(String n, String c, double d) {
        name = n;
        category = c;
        powerConsumption = d;
    }

    public String toString() {
        return name + " " + category + " " + powerConsumption;
    }

    @Override
    public int compareTo(Appliance o){
        if(this.powerConsumption < o.powerConsumption)
            return  1;
        else if (this.powerConsumption > o.powerConsumption)
            return -1;
        else return 0;
//        return -1 * this.name.compareTo(o.name);
    }
}

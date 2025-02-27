package Interface;

public class Bus implements Vehicle{
    @Override
    public void car() {
        System.out.println("Bus is a Vehicle");
    }

    @Override
    public void bus(String vehicleName) {
        System.out.println("Model name is "+vehicleName);
    }
}

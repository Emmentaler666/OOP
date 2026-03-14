public class Vehicle {

    protected String brand;
    protected String model;
    protected String date;
    protected int vehID;

    protected static int autoInc = 300;

    public Vehicle() {
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.vehID = autoInc;
        autoInc += 2;
    }

    public void setDate(String date) {
        this.date = date;

    }

    public void startVehicle() {
        System.out.println("Vehicle starting the engine!");
    }

    public void stopVehicle() {
        System.out.println("Vehicle stop the vehicle!");
        System.out.println("Vehicle turn off the engine!");
    }

    public void vehInfo() {
        System.out.println(this.toString());
    }

    public void additionalMethod(String msg) {
        System.out.println(msg);
    }

    @Override
    public String toString() {
        return "Vehicle [brand=" + brand +
                ", model=" + model +
                ", date=" + date +
                ", vehID=" + vehID + "]";
    }
}
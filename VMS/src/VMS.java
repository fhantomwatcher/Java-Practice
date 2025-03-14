public class VMS {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car("BMW","I8",2020,2);
        System.out.println("\n[Car Info]");
        myCar.displayinfo();

        System.out.println();

        Bike myBike = new Bike("BMW","R1225RS",2024,"spotrs");
        System.out.println("\n[Bike Info]");
        myBike.displayinfo();
        System.out.println();
        
    }
}

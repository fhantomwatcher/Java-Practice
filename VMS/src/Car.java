public class Car extends Vehicle {
    private int seats;

    public Car(){
        super();
        this.seats  = 4;
    }

    public Car(String cbrand, String cmodel, int year, int seats){
        super(cbrand, cmodel, year);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Seats: "+getSeats());
    }
}

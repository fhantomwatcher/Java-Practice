public class Bike extends Vehicle {
    private String type;

    public Bike(){
        super();
        this.type  = "unknown";
    }

    public Bike(String bbrand, String bmodel, int year, String type){
        super(bbrand, bmodel, year);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Seats: "+getType());
    }
}

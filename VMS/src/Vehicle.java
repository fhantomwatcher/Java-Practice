public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(){
        this.brand = "No brand";
        this.model = "No model set";
        this.year = 2025;
    }

    public Vehicle(String vbrand, String vmodel, int year){
        this.brand =  vbrand;
        this.model = vmodel;
        setYear(year);
    }

    public int setYear(int year){
        if(year<2015 || year>2030){
            return this.year = 0000;
        } else{
            return this.year = year;
        }
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    

    public void displayinfo(){
        System.out.println("Brand: "+getBrand());
        System.out.println("Vehicle model: "+  getModel());
        System.out.println("year: "+getYear());

    }

}

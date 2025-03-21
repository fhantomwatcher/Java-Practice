import java.lang.*;

public class Student{
    private int id;
    private String name;
    private double cgpa;

   Student(){
    //called dc
   }

    public double getCgpa() {
        return cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] gst){
        Student std1 = new Student();

        std1.setName("ghost");
        std1.setId(6025658);
        std1.setCgpa(3.75);

        System.out.println("\nDetails  For Student One");
        System.out.println("Name: "+std1.getName());
        System.out.println("ID: "+std1.getId());
        System.out.println("Cgpa: "+std1.getCgpa());
    }


}
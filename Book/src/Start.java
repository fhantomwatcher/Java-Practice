import java.lang.*;
public class Start {
    public static void main(String[] args) {
        
        Book book1 = new Book();
        book1.setIsbn("123-456-7890");
        book1.setBookTitle("Java Basics");
        book1.setAuthorName("Alice Brown");
        book1.setPrice(29.99);
        book1.setAvailableQuantity(10);

        
        Book book2 = new Book("987-654-3210", "Advanced Java", "Bob Green", 49.99, 5);

        
        System.out.println("--- Book 1 Details ---");
        book1.showDetails();

        book1.addQuantity(5);
        System.out.println("After adding 5 copies, Quantity: " + book1.getAvailableQuantity());

        book1.sellQuantity(3);
        System.out.println("After selling 3 copies, Quantity: " + book1.getAvailableQuantity());

        System.out.println("--- Book 2 Details ---");
        book2.showDetails();

        book2.addQuantity(2);
        book2.sellQuantity(1);
        System.out.println("After adding 2 and selling 1, Quantity: " + book2.getAvailableQuantity());
    }
}
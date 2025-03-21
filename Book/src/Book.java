import java.lang.*;

public class Book {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

   public Book(){}

   public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
    this.authorName = authorName;
    this.bookTitle = bookTitle;
    this.isbn = isbn;
    this.price = price;
    this.availableQuantity = availableQuantity;
   }

   public String getAuthorName() {
       return authorName;
   }
   public String getBookTitle() {
       return bookTitle;
   }
   public String getIsbn() {
       return isbn;
   }
   public double getPrice() {
       return price;
   }
   public int getAvailableQuantity() {
       return availableQuantity;
   }

   public void setAuthorName(String authorName) {
       this.authorName = authorName;
   }
   public void setBookTitle(String bookTitle) {
       this.bookTitle = bookTitle;
   }
   public void setIsbn(String isbn) {
       this.isbn = isbn;
   }
   public void setPrice(double price) {
       this.price = price;
   }
   public void setAvailableQuantity(int availableQuantity) {
       this.availableQuantity = availableQuantity;
   }

   public void addQuantity(int amount){
    availableQuantity +=  amount;
   }
   public void sellQuantity(int amount){
    availableQuantity -= amount;
   }

   public void showDetails() {
    System.out.println("ISBN: " + isbn);
    System.out.println("Title: " + bookTitle);
    System.out.println("Author: " + authorName);
    System.out.println("Price: $" + price);
    System.out.println("Available Quantity: " + availableQuantity + "\n");
}


}

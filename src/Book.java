public abstract class Book {
     String isbn;
     String title;
      int publish_Year;
    double price;
    boolean is_for_sale;
    public Book(String isbn, String title, int publish_Year, double price) {
        this.isbn = isbn;
        this.title = title;
        this.publish_Year = publish_Year;
        this.price = price;
    }
    abstract double buy(int quantity);



}

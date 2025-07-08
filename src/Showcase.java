public class Showcase extends Book{

    public Showcase(String isbn, String title, int publish_Year, double price) {
        super(isbn, title, publish_Year, price);
        this.is_for_sale=false;
    }

    @Override
    double buy(int quantity) {
        throw new RuntimeException("this Book "+this.title+" is not for sale");
    }
}

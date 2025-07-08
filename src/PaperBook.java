public class PaperBook extends Book{
int stock;
double shipped;

    public PaperBook(String isbn, String title, int publish_Year, double price,int stock,double shipped) {
        super(isbn, title, publish_Year, price);
        this.is_for_sale=true;
        this.stock=stock;
        this.shipped=shipped;
    }

    @Override
    double buy(int quantity) {
        if(quantity>this.stock)
        {
            throw new RuntimeException("no stock for this book : "+this.title);
        }else {
            return (this.price * quantity) + this.shipped;
        }
    }
}
